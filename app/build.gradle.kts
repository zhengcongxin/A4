plugins {
    id("com.android.application")
}

android {
    signingConfigs {
        create("myhwReleaseConfig") {
            storeFile = file("/Users/hong/Downloads/NEU/2023fall/keystoredemo/classkeystore")
            keyAlias = "key0"
            storePassword = "111111"
            keyPassword = "111111"
        }
    }
    namespace = "edu.northeastern.numad24sp_zhengcongxin"
    compileSdk = 34

    defaultConfig {
        applicationId = "edu.northeastern.numad24sp_zhengcongxin"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        signingConfig = signingConfigs.getByName("myhwReleaseConfig")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}