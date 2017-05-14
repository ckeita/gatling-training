package gatling

import io.gatling.core.Predef.{Simulation, atOnceUsers, scenario}
import io.gatling.http.Predef.http

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.session.Session
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
/**
  * Created by chegoujk on 11/05/17.
  */
class IntrospectingSimulation extends Simulation {
  val iterator = Iterator.from(1).map(value => Map("email" -> s"user${value}@gatling.io"))
  val scn =
    scenario("jsonparse")
      .exec({
        Session => val foobar = Session.set("foo","bar")
        println(foobar)
        foobar
      })
      .exec( {
        Session => val foobar2 = Session.set("baz",Session("foo").validate[String])
        println(foobar2)
        foobar2
      })
    .exec( {
      Session => val Session_n1n2 = Session.setAll("n1" -> 2, "n2" -> 3)
        val n1 = Session_n1n2("n1").as[Int]
        val n2 = Session_n1n2("n2").as[Int]
        val result = Session_n1n2.set("res", n1 + n2)
        println(result)
        result
    })
    .exec( {
      Session => val Session_n1n2 = Session.setAll("n1" -> 2, "n2" -> 3)
        val n1 = Session_n1n2("n1").validate[Int]
        val n2 = Session_n1n2("n2").validate[Int]
        //for is an expression
        val result = for {
          n1 <- n1
          n2 <- n2
        } yield n1 + n2

        val res = Session_n1n2.set("res", result)
        println(res)
        res
    })
      .feed(iterator)
    .exec( {
      Session =>
      println(Session("email"))
        Session
    })

  setUp(scn.inject(atOnceUsers(3)))
}
