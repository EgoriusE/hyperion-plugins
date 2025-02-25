buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:${PluginVersions.androidGradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${PluginVersions.kotlin}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }

    group = Build.group
    version = Build.versionName
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}