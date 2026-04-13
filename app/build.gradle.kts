plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.compose.compiler)

}

android {
    namespace = "com.migueldk17.breezeicons"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.github.migueldk17.breezeicons"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "2.2.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    publishing {
        singleVariant("release") {
            // Opcional: Descomente abaixo se a sua publicação exigir o código-fonte ou Javadoc
            // withSourcesJar()
            // withJavadocJar()
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }


    tasks.register<Exec>("generateIcons") {
        group = "breezeicons"
        description = "Generates Breeze Icons All files (Linear, Outlined, Colors)"

        commandLine(
            "python",
            "${rootProject.projectDir}\\scripts\\script.py"
        )
    }
}

kotlin {
    jvmToolchain(11)
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11)
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.ui.android)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(project(":breezeicons"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}