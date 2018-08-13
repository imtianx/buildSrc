/**
 * <pre>
 *     @desc: common dependencies
 * </pre>
 * @author 奚岩
 * @date 2018/7/2 9:44 AM
 */

object Versions {

    const val android_plugin = "3.1.4"
    const val android_sdk_compile = 27
    const val android_sdk_min = 15
    const val android_sdk_target = 22
    const val android_sdk_support = "27.1.1"

    const val junit = "4.12"
    const val test_runner = "1.0.2"
    const val espresso_core = "3.0.2"

    const val multidex = "1.0.2"

    const val kotlin = "1.2.60"
    const val anko = "0.10.5"

    const val constraintlayout = "1.1.2"

    const val retrotit2 = "2.4.0"
    const val gson = "2.8.5"
    const val rxjava2 = "2.1.16"
    const val rxandroid = "2.0.2"

    const val glid = "4,7.1"
    const val eventbus = "3.1.1"

    const val arouter_api = "1.3.1"
    const val arouter_compile = "1.1.4"
    const val arouter_annotation = "1.0.4"
    const val arouter_register = "1.0.2"

    const val fragmentation = "1.3.5"

    const val lifecycle = "1.1.0"

}

object Deps {

    // android plufin and support lib
    const val android_plugin = "com.android.tools.build:gradle:${Versions.android_plugin}"
    const val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.android_sdk_support}"
    const val support_v4 = "com.android.support:support-v4:${Versions.android_sdk_support}"
    const val support_design = "com.android.support:design:${Versions.android_sdk_support}"
    const val support_cardview = "com.android.support:cardview-v7:${Versions.android_sdk_support}"
    const val support_recyclerview_v7 = "com.android.support:recyclerview-v7:${Versions.android_sdk_support}"

    const val support_multidex = "com.android.support:multidex:${Versions.multidex}"

    const val constraintlayout = "com.android.support.constraint:constraint-layout:${Versions.constraintlayout}"


    // android arch lib
    const val lifecycle_extentions = "android.arch.lifecycle:extensions:${Versions.lifecycle}"
    const val lifecycle_compiler = "android.arch.lifecycle:compiler:${Versions.lifecycle}"
    const val lifecycle_livedata = "android.arch.lifecycle:livedata:${Versions.lifecycle}"
    const val lifecycle_viewmodel = "android.arch.lifecycle:viewmodel:${Versions.lifecycle}"
    const val lifecycle_runtime = "android.arch.lifecycle:runtime:${Versions.lifecycle}"

    // test
    const val junit = "junit:junit:${Versions.junit}"
    const val test_runner = "com.android.support.test:runner:${Versions.test_runner}"
    const val espresso_core = "com.android.support.test.espresso:espresso-core:${Versions.espresso_core}"

    // kotlin plugin,jre7,noarg,allopen
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_stdlib_jre7 = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_noarg = "org.jetbrains.kotlin:kotlin-noarg:${Versions.kotlin}"
    const val kotlin_allopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"


    // anko,mo to see : https://github.com/Kotlin/anko
    const val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
    const val anko_sdk25 = "org.jetbrains.anko:anko-sdk25:${Versions.anko}"

    // databinding compile ,the version same as android_plugin
    const val databinding_compile = "com.android.databinding:compiler:${Versions.android_plugin}"

    // retrofit
    const val retrofit2 = "com.squareup.retrofit2:retrofit:${Versions.retrotit2}"
    const val retrofit2_convert_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrotit2}"
    const val retrofit2_adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrotit2}"

    // rxandroid,rxjava2
    const val rxjava2 = "io.reactivex.rxjava2:rxjava:${Versions.rxjava2}"
    const val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"

    // gson
    const val gson = "com.google.code.gson:gson:${Versions.gson}"

    // glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glid}"

    // eventbus
    const val eventbus = "org.greenrobot:eventbus:${Versions.eventbus}"

    // fragmentation
    const val fragmentation = "me.yokeyword:fragmentation:${Versions.fragmentation}"


    // arouter
    const val arouter_api = "'com.alibaba:arouter-api:${Versions.arouter_api}"
    const val arouter_compile = "'com.alibaba:arouter-compile:${Versions.arouter_compile}"


}