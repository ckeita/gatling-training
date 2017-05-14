
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://detectportal.firefox.com")
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

	val headers_0 = Map("Pragma" -> "no-cache")

	val headers_2 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8",
		"Upgrade-Insecure-Requests" -> "1")

    val uri1 = "http://computer-database.gatling.io"
    val uri2 = "http://detectportal.firefox.com/success.txt"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/success.txt")
			.headers(headers_0))
		.pause(10)
		.exec(http("request_1")
			.get("/success.txt")
			.headers(headers_0))
		.pause(37)
		.exec(http("request_2")
			.get(uri1 + "/")
			.headers(headers_2))
		.pause(22)
		.exec(http("request_3")
			.get("/success.txt")
			.headers(headers_0))
		.pause(5)
		.exec(http("request_4")
			.get(uri1 + "/computers?p=1")
			.headers(headers_2))
		.pause(54)
		.exec(http("request_5")
			.get("/success.txt")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}