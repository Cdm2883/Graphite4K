rootProject.name = "gradle-multi-module-project-template"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

include(":seek-recorder")
include(":video-composer")
include(":presentation")
include(":embedded-ui")
include(":open-gl")
