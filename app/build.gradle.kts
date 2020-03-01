plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Dep.Android.compileSdk)

    defaultConfig {
        applicationId = Dep.Android.applicationId
        minSdkVersion(Dep.Android.minSdkVersion)
        targetSdkVersion(Dep.Android.targetSdkVersion)
        versionCode = Dep.Android.versionCode
        versionName = Dep.Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dep.Kotlin.kotlin_std)
    implementation(Dep.AndroidX.core_ktx)
    implementation(Dep.AndroidX.appcompat)
    implementation(Dep.AndroidX.constraint_layout)
    testImplementation(Dep.Tests.junit)
    androidTestImplementation(Dep.Tests.test_ext)
    androidTestImplementation(Dep.Tests.espresso)

}
