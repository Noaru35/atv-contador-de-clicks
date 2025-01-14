plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
}

android {
    compileSdk 33

    defaultConfig {
        applicationId "com.example.clickcounter"
        minSdk 21
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion '1.4.3'
    }

    buildFeatures {
        compose true
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = '1.8'
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.1'
    implementation 'androidx.activity:activity-compose:1.8.0'
    implementation "androidx.compose.ui:ui:1.5.1"
    implementation "androidx.compose.material:material:1.5.1"
    implementation "androidx.compose.ui:ui-tooling-preview:1.5.1"
    implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1"
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.6.1"

    debugImplementation "androidx.compose.ui:ui-tooling:1.5.1"
    debugImplementation "androidx.compose.ui:ui-test-manifest:1.5.1"
}
