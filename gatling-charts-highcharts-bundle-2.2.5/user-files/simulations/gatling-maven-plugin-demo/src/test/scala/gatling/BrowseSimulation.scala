package gatling

import io.gatling.core.Predef.{Simulation, atOnceUsers, scenario}
import io.gatling.http.Predef.http
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

/**
  * Created by chegoujk on 10/05/17.
  */

object Browse {

	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")
	val browse = group("browse") {
		repeat(5, "count") {
			exec(http("Page ${count}")
				.get("/computers?p=${count}")
				.headers(headers_0))
				.pause(1)
		}
	}

}
class BrowseSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

	val scn = scenario("RecordedSimulation")
						.exec(Browse.browse)


	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
