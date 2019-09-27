# buildSrc
buildSrc for android project with kotlin dsl

# using 

Add this repo as a `submodule` to your project,and you can choose the diferent branch.

Then,add `gitpack` to `build.gradle` file of root project.
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

# library website
  
  - [x] [Google Repo](https://dl.google.com/dl/android/maven2/index.html)
  - [x] [jetpack](https://developer.android.com/jetpack)
  - [x] [material-android](https://github.com/material-components/material-components-android)
  - [x] [kotlin](https://github.com/JetBrains/kotlin/releases)
  - [x] [kotlinx.coroutines](https://github.com/Kotlin/kotlinx.coroutines)
  - [x] noarg
  - [x] allopen
  - [x] [anko](https://github.com/Kotlin/anko)
  - [x] [retrofit2](https://github.com/square/retrofit)
  - [x] [rxjava2](https://github.com/ReactiveX/RxJava)
  - [x] [rxandroid2](https://github.com/ReactiveX/RxAndroid)
  - [x] ~~[gson](https://github.com/google/gson)~~ 
  - [x] [moshi](https://github.com/square/moshi)
  - [x] [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization)
  - [x] [glide](https://github.com/bumptech/glide)
  - [x] [eventbus](https://github.com/greenrobot/EventBus)
  - [x] [blankj:utilcode](https://github.com/Blankj/AndroidUtilCode)
  - [x] [AndroidUtilKTX](https://github.com/lulululbj/AndroidUtilCodeKTX)
  - [x] [LiveEventBus](https://github.com/JeremyLiao/LiveEventBus)
  - [x] [BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)
  
  
  

> Avoid code warpping，please open the `Formatter Control` (Preferences -> Editor ->Code style -> Formatter Control)of your `IDEA` or `AS`，and add the following code where you don't need to wrap:
  
```
// @formatter:off
// @formatter:on
```

  
