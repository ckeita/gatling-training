package gatling

import io.gatling.core.Predef.{Simulation, atOnceUsers, scenario}
import io.gatling.http.Predef.http
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.session.Expression
import io.gatling.http.Predef._
import net.sf.saxon.functions.Substring
/**
  * Created by chegoujk on 11/05/17.
  */
class TrainingSimulation extends Simulation {
  val patchTemplate: Expression[String] = session => {
      val valvld = session ("name").validate[String]
      val result = for {
      value <- valvld
    } yield value.reverse
    """{"name" : "foo ${value}"}"""
  }


  val httpProtocol = http
    .baseURL("http://jsonplaceholder.typicode.com")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")
  val scn =
    scenario("jsonparse")
      .exec(http("Parse Comments")
        .get("/comments/1")
        .check(jsonPath("""$.name""").saveAs("name")))
      .pause(1)
      .exec ({
        Session =>
         //val valAs = Session("name").as[String].reverse
        for {
          value <- Session("name").validate[String]
        } yield Session.set("name",value.reverse)
      })

      .exec(http("Patch Comments")
        .patch("/comments/1")
        .header("Content-Type","application/json")
        .body(StringBody("""{"name" : "foo ${name}"}"""))
        .check(substring("foo")) )
      .pause(1)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
