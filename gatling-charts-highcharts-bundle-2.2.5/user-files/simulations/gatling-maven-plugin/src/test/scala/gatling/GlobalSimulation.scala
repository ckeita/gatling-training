package gatling

import io.gatling.core.scenario.Simulation
import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._



/**
  * Created by chegoujk on 10/05/17.
  */
class GlobalSimulation extends Simulation {

  val httpProtocol = http
    .baseURL("http://computer-database.gatling.io")
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

    val users = scenario("Users")
              .exec(Browse.browse, Search.search)

    val admins = scenario("Admins")
      .exec(Browse.browse, Search.search, Edit.edit)


  setUp(users.inject(rampUsers(2).over(10)),admins.inject(atOnceUsers(2))).protocols(httpProtocol).assertions(global.failedRequests.count.is(0),global.responseTime.percentile1.lt(20))
}
