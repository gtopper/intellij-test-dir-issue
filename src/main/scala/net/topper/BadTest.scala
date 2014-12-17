package net.topper

import org.scalatest.FunSpec

class BadTest extends FunSpec {

  it("System.exit!") {
    sys.exit(-1)
  }
}
