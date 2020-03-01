object Versions {
    const val kotlin = "1.3.61"
    const val tools_gradle = "4.0.0-beta01"
    const val core_ktx = "1.2.0"
    const val appcompat = "1.1.0"
    const val constraint_layout = "1.1.3"
    const val junit = "4.13"
    const val test_ext = "1.1.1"
    const val espresso = "3.2.0"
}

object Dep {
    object GradlePlugins {
        val kotlin_gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        val android_tools_gradle = "com.android.tools.build:gradle:${Versions.tools_gradle}"
    }

    object Android {
        val compileSdk = 29
        val applicationId = "com.lukmotech.cinemax"
        val minSdkVersion = 21
        val targetSdkVersion = 29
        val versionCode = 1
        val versionName = "1.0"
    }

    object Kotlin {
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.61"
    }

    object AndroidX {
        val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
        val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    }

    object Tests {
        val junit = "junit:junit:${Versions.junit}"
        val test_ext = "androidx.test.ext:junit:${Versions.test_ext}"
        val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}