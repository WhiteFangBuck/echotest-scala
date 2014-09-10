package edu.luc.cs.cs372.echo.impl

import org.junit._
import Assert._

/**
 * Plain JUnit testing without ScalaTest.
 *
 * Alternatively, one can use
 * [[http://www.scalatest.org/getting_started_with_junit_4_in_scala JUnit with ScalaTest]]
 */
class EchoJUnit  {

  @Test
  def testSimpleEmpty(): Unit = {
    assertEquals("", (new SimpleEcho).echo(""))
  }

  @Test
  def testSimpleNonmpty(): Unit = {
    assertEquals("hello", (new SimpleEcho).echo("hello"))
  }

  @Test
  def testDoubleEmpty(): Unit = {
    assertEquals(" ", (new DoubleEcho).echo(""))
  }

  @Test
  def testDoubleNonmpty(): Unit = {
    assertEquals("hello hello", (new DoubleEcho).echo("hello"))
  }
}