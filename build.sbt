name := """ssd-project"""
organization := "de.tobibeck.ssd"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies += javaJdbc
