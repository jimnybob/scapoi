name := "scapoi"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.1.2",
  "org.apache.poi" % "poi" % "3.10-FINAL",
  "org.apache.poi" % "poi-ooxml" % "3.10-FINAL",
  "org.apache.poi" % "poi-ooxml-schemas" % "3.10-FINAL"
)