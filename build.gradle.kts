
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.ktorSerialization) apply false

}



buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies{
        classpath(libs.sqlDelight.gradle)
        classpath (libs.kotlin.gradle)
        classpath(libs.android.buildTools)
        //noinspection UseTomlInstead
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48.1")

    }
}