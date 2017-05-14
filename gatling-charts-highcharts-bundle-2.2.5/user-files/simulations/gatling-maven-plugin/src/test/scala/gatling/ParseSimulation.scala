package gatling

import io.gatling.core.scenario.Simulation

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
/**
  * Created by chegoujk on 11/05/17.
  */
class ParseSimulation extends Simulation {

  val httpProtocol = http
    .baseURL("http://jsonplaceholder.typicode.com")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

    val scn =
        scenario("jsonparse")
          .exec(http("Parse Comments")
          .get("/comments")
          .check(jsonPath("""$[?(@.email=="Eliseo@gardner.biz")].name""").is("id labore ex et quam laborum"))
          .check(jsonPath("""$[?(@.email=="Eliseo@gardner.biz")].postId""").ofType[Int].is(1)))
        .pause(1)

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
