package gatling

import java.util.concurrent.ThreadLocalRandom

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

object Edit {
	val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

	val edit = group("edit")  {
		exec(http("Form")
			.get("/computers/new")
			.headers(headers_0))
			.pause(1)
			.tryMax (3) {
				exec(http("Post")
					.post("/computers")
					.headers(headers_0)
					.formParam("name", "")
					.formParam("introduced", "2017-04-01")
					.formParam("discontinued", "2017-04-30")
					.formParam("company", "42")
					.check(status.is(_ => 200 + ThreadLocalRandom.current().nextInt(2))) )
					.pause(1)
			}
	}
}

class EditSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://computer-database.gatling.io")
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.5")
		.userAgentHeader("Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:53.0) Gecko/20100101 Firefox/53.0")

	val scn = scenario("EditSimulation")
						.exec(Edit.edit)

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}