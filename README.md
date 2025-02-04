# 🌬️Breeze-Icons

## 📕About
Breeze Icons is a modern icon library designed for Jetpack Compose, featuring a collection of sleek icons (thanks to the [Panda Icons Library](https://www.figma.com/community/file/1331872221749358492/panda-icons-library)). It provides typed icons for seamless integration with Jetpack Compose.

## 🔧Instalation

Using Breeze Icons in your project is simple with JitPack.

### 1️⃣Add JitPack to your settings.gradle.kts:

```gradle
    dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io")}
    }
}
```
### 2️⃣ Add the dependency to your module’s build.gradle.kts:

```gradle
    dependencies {
    implementation 'com.github.MiguelDK17:Breeze-Icons:v1.0.0'
	}
```

## 🛠️Usage
### BreezeIcon
The BreezeIcon component is responsible for rendering icons. It works similarly to Jetpack Compose's default Icon component, requiring an icon from the BreezeIcons collection and a contentDescription:

```kotlin
    BreezeIcon(
        BreezeIcons.Linear.BookLinear,
        contentDescription = "this is a content description" //Can also be null
        )
```
You can also customize the color and size:
```kotlin
BreezeIcon(
        BreezeIcons.Linear.BookLinear,
        contentDescription = null,
        modifier = Modifier.size(width = 41.dp, height = 32.dp),
        color = Color.Blue
        )
```




## ⛏️Tools

- [Kotlin](https://kotlinlang.org/docs/home.html)
- [Jetpack Compose](https://developer.android.com/compose)
- [Material Design 3](https://m3.material.io/)
- [Panda Icons Library](https://www.figma.com/community/file/1331872221749358492/panda-icons-library)

## 🤝Contributions
Feel free to open **issue** and **pull requests** to improve the library!


## 📜Licenses
This project is under the **MIT License**. See the file [LICENSE](https://github.com/MiguelDK17/Breeze-Icons/blob/master/LICENSE) for more details.

**Panda Icons Library** is under the [CC BY 4.0 License](https://creativecommons.org/licenses/by/4.0/)



