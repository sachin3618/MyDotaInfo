plugins {
    id("java-library")
    alias(libs.plugins.jetbrainsKotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies{
    implementation(project(":core"))
    implementation(project(":hero:hero-datasource"))
    implementation(project(":hero:hero-domain"))

    implementation(libs.kotlin.coroutineCore)

}