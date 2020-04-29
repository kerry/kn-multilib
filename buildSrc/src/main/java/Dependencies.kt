object Versions {
    val min_sdk = 21
    val target_sdk = 29
    val compile_sdk = 29

    val kotlin = "1.3.71"
    val android_x = "1.1.0"
    val android_gradle_plugin = "3.6.2"
    val buildToolsVersion = "29.0.0"
    val junit = "4.12"
    val coroutines = "1.3.5-native-mt"
    val serialization = "0.20.0"
    val cocoapodsext = "0.6"

    val mockito = "2.2.0"
    val mockitoinline = "3.0.0"
    val gson = "2.8.5"
}

object Deps {
    val app_compat_x = "androidx.appcompat:appcompat:${Versions.android_x}"
    val core_ktx = "androidx.core:core-ktx:${Versions.android_x}"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val junit = "junit:junit:${Versions.junit}"
    val cocoapodsext = "co.touchlab:kotlinnativecocoapods:${Versions.cocoapodsext}"

    object Android {
        val gson = "com.google.code.gson:gson:${Versions.gson}"
    }

    object AndroidXTest {
        val core =  "androidx.test:core:${Versions.android_x}"
        val junit =  "androidx.test.ext:junit:${Versions.android_x}"
        val runner = "androidx.test:runner:${Versions.android_x}"
        val rules = "androidx.test:rules:${Versions.android_x}"
    }

    object KotlinTest {
        val common =      "org.jetbrains.kotlin:kotlin-test-common:${Versions.kotlin}"
        val annotations = "org.jetbrains.kotlin:kotlin-test-annotations-common:${Versions.kotlin}"
        val jvm =         "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
        val junit =       "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
        val reflect =     "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
        val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockito}"
        val mockitoinline = "org.mockito:mockito-inline:${Versions.mockitoinline}"
    }

    object Coroutines {
        val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${Versions.coroutines}"
        val jdk = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        val native = "org.jetbrains.kotlinx:kotlinx-coroutines-core-native:${Versions.coroutines}"
        val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    }

    object Serialization {
        val common ="org.jetbrains.kotlinx:kotlinx-serialization-runtime-common:${Versions.serialization}"
        val android ="org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialization}"
        val ios ="org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:${Versions.serialization}"
    }
}