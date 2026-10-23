@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://maven.aliyun.com/repository/public") }
    }
}

rootProject.name = "Trace"

// ---------------------------------------------------------------------------
// Trace module graph
//
//   :app            -> Trace application (new UI/UX + branding)
//   :innertube      -> YouTube / YouTube Music InnerTube discovery client (reused)
//   :lyricsProvider -> open-source lyrics providers (reused; Musixmatch removed)
//   :lastfm         -> Last.fm scrobbling client (reused, optional)
//
// Removed relative to the upstream project:
//   :jiosaavn, :canvas, :applecanvas, :vivimusiccanvas, :artistvideo,
//   :shazamkit, :spotify, :kizzy  (proprietary and/or not required)
// ---------------------------------------------------------------------------
include(":app")
include(":innertube")
include(":lastfm")
include(":lyricsProvider")

// Use a local copy of NewPipe Extractor by uncommenting the lines below.
// For this to work you also need to change the implementation in
// innertube/build.gradle.kts to one which does not specify a version.
//includeBuild("../NewPipeExtractor") {
//    dependencySubstitution {
//        substitute(module("com.github.teamnewpipe:NewPipeExtractor")).using(project(":extractor"))
//    }
//}
