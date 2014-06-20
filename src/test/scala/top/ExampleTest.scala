package top

import org.specs2.mutable.Specification

/**
 * Created by tejasbubane on 20/6/14.
 */
class ExampleTest extends Specification{

  "addition" should {
    "integer addition" in {
      1 + 1 mustEqual 2
    }
    "string" in {
      "abc" + "123" mustEqual "abc123"
    }
  }
}
