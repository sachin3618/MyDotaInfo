plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
    alias(libs.plugins.ktorSerialization)
    id("com.squareup.sqldelight")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
dependencies {
    implementation(project(":hero:hero-domain"))

    implementation(libs.ktor.core.client)
    implementation(libs.ktor.android.client)
    implementation(libs.ktor.logging.client)
    implementation(libs.ktor.serialization.client)
    implementation(libs.ch.qos.logback)
    implementation(libs.kotlin.json.serialization)

    implementation(libs.sqlDelight.runtime)

}

sqldelight {
    database("HeroDatabase") {
        packageName = "com.codesharkstudio.hero_datasource.cache"
        sourceFolders = listOf("sqldelight")
    }
}


