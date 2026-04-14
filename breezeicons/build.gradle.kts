plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.github.migueldk17.breezeicons"
    compileSdk = 36

    defaultConfig {
        minSdk = 26
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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

    val isWindows = System.getProperty("os.name")
        .lowercase()
        .contains("windows")

    val pythonCmd = if (isWindows) "python" else "python3"


    tasks.register<Exec>("generateIcons") {
        workingDir = rootDir
        commandLine(pythonCmd, "scripts/script.py")
    }

    tasks.named("preBuild") {
        dependsOn("generateIcons")
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
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.material3.android)
    implementation(libs.androidx.runtime.android)
    implementation(libs.androidx.ui.android)
    implementation(libs.androidx.ui.graphics.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}


