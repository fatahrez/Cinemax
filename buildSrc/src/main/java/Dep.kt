object Versions {
    const val kotlin = "1.3.61"
    const val tools_gradle = "4.0.0-beta01"
}

object Dep {
    object GradlePlugins {
        val kotlin_gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        val android_tools_gradle = "com.android.tools.build:gradle:${Versions.tools_gradle}"
    }
}