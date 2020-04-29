import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
}

kotlin {
    targets {
        targetFromPreset(presets.getByName("jvm"), "android")
    }

    val onPhone = System.getenv("SDK_NAME")?.startsWith("iphoneos")?:false
    println(System.getenv("SDK_NAME"))
    if(onPhone){
        iosArm64("ios")
    }else{
        iosX64("ios")
    }
    targets.getByName<KotlinNativeTarget>("ios").compilations["main"].kotlinOptions.freeCompilerArgs +=
            listOf("-Xobjc-generics", "-Xg0")

    version = "1.1"

    sourceSets {
        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlinx.coroutines.ExperimentalCoroutinesApi")
            }
        }
    }

    sourceSets["commonMain"].dependencies {
        implementation(kotlin("stdlib-common", Versions.kotlin))
        implementation(Deps.Coroutines.common)
        implementation(Deps.Serialization.common)
        api(project(":kn-os"))
    }

    sourceSets["androidMain"].dependencies {
        implementation(kotlin("stdlib", Versions.kotlin))
        implementation(Deps.Coroutines.jdk)
        implementation(Deps.Coroutines.android)
        implementation(Deps.Serialization.android)
        implementation(Deps.Android.gson)
    }

    sourceSets["iosMain"].dependencies {
        implementation(Deps.Coroutines.native) {
            version {
                strictly(Versions.coroutines)
            }
        }
        implementation(Deps.Serialization.ios)
    }
}