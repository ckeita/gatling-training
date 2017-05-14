package gatling

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Search {
	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val search = group("search") {
		feed(csv("search.csv").circular)
			.exec(http("request_0")
				.get("/computers?p=0")
				.headers(headers_0))
			.pause(1)
			.exec(http("search")
				.get("/computers?f=${searchCriterion}")
				.check(css("a:contains(${searchComputerName})", "href").saveAs("url"))
				.headers(headers_0))
			.exitHereIfFailed
			.pause(1)
			.exec(http("select")
				.get("${url}")
				.headers(headers_0))
			.pause(1)
	}
}

class SearchSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

	val scn = scenario("SearchSimulation")
						.exec(Browse.browse)

	setUp(scn.inject(atOnceUsers(3))).protocols(httpProtocol)
}