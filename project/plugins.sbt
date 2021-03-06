resolvers += Resolver.file("local-plugins", file("/Users/ktoso/.ivy2/local"))(Resolver.ivyStylePatterns)

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0-M2")

// Play enhancer - this automatically generates getters/setters for public fields
// and rewrites accessors of these fields to use the getters/setters. Remove this
// plugin if you prefer not to have this feature, or disable on a per project
// basis using disablePlugins(PlayEnhancer) in your build.sbt
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.2")

// Akka GRPC
addSbtPlugin("com.lightbend.akka.grpc" %% "sbt-akka-grpc" % "0.2-RC1")

