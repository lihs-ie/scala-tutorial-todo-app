package unit.controllers

import org.scalatestplus.play.*
import play.api.test.Helpers.*
import play.api.test.*

class HelloControllerSpec extends PlaySpec with GuiceOneAppPerTest:
  "HelloController GET" should {
    "return 200" in {
      val request = FakeRequest(GET, "/")
      val response = route(app, request).get

      status(response) mustBe OK
      contentAsString(response) must include("Hello World!")
    }
  }
