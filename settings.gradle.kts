@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
rootProject.na.me = "Magisk"
include(":app:apk", ":app:core", ":app:shared", ":app:stub", ":app:test", ":native")
