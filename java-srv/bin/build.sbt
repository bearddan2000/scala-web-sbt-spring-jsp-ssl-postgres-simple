lazy val root = (project in file("."))
  .settings(
  // Project name (artifact name in Maven)
  name := "spring-boot-scala-web",

  version := "1.0",


  scalaVersion := "2.13.1",

  libraryDependencies ++= Seq(
    "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
    "org.apache.tomcat.embed" % "tomcat-embed-jasper" % "9.0.46",
    "javax.servlet" % "javax.servlet-api" % "4.0.0",
    "javax.servlet.jsp" % "javax.servlet.jsp-api" % "2.3.3" % "provided",
    "javax.servlet" % "jstl" % "1.2",
    "org.springframework.boot"%"spring-boot-starter-data-jpa"%"2.4.2",
    "jakarta.xml.bind" % "jakarta.xml.bind-api" % "2.3.2",
    "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2",
    "javax.annotation"%"javax.annotation-api"%"1.3.2",
    "org.postgresql"%"postgresql"%"42.2.19"
   ),

  mainClass := Some("example.Main")
)
