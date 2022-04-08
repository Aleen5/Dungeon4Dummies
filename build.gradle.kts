buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("com.android.tools.build:gradle:4.0.2")

        classpath("com.squareup.okhttp3:okhttp:5.0.0-alpha.3")
        classpath("com.squareup.okhttp3:logging-interceptor:4.9.1")
        classpath("com.squareup.retrofit2:retrofit:2.9.0")
        classpath("com.squareup.retrofit2:converter-gson:2.9.0")
        classpath("com.squareup.retrofit2:adapter-rxjava:2.9.0")
        classpath("com.squareup.retrofit2:adapter-rxjava2:2.9.0")

    }
}

group = "me.user"
version = "1.0"

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}