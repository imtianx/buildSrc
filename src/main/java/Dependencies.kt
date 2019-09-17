/**
 * <pre>
 *     @desc: common dependencies
 * </pre>
 * @author 奚岩
 * @date 2018/7/2 9:44 AM
 */

object Versions {

    // @formatter:off

    const val android_build_tools_gradle                    = "3.5.0"
    const val kotlin                                        = "1.3.50"
    const val kotlin_x_coroutines_android                   = "1.3.1"


    const val android_sdk_compile                           = 29
    const val android_sdk_min                               = 14
    const val android_sdk_target                            = 29

    const val android_x_appcompat                           = "1.1.0"
    const val android_x_core_ktx                            = "1.1.0"
    const val android_x_fragment                            = "1.1.0"
    const val android_x_constraintlayout                    = "1.1.3"
    const val android_x_cardview                            = "1.0.0"
    const val android_x_recyclerview                        = "1.0.0"
    const val android_x_coordinatorlayout                   = "1.0.0"
    const val android_x_material                            = "2.0.1"
    const val android_x_multidex                            = "2.0.1"
    const val android_x_percentlayout                       = "1.0.0"
    const val android_x_swiperefreshlayout                  = "1.0.0"
    const val android_x_lifecycle                           = "2.1.0"
    const val android_x_room                                = "2.1.0"
    const val android_x_navigation                          = "2.1.0"
    const val android_x_sqlite                              = "2.0.1"

    const val android_x_test_runner                         = "1.2.0"
    const val android_x_test_ext                            = "1.1.1"
    const val android_x_test_espresso_core                  = "3.2.0"
    const val junit                                         = "4.12"

    const val anko                                          = "0.10.8"

    const val retrotit2                                     = "2.6.1"
    const val gson                                          = "2.8.5"
    const val moshi                                         = "1.8.0"
    const val rxjava2                                       = "2.2.12"
    const val rxandroid                                     = "2.1.1"

    const val glide                                         = "4.9.0"
    const val eventbus                                      = "3.1.1"

    const val arouter_api                                   = "1.3.1"
    const val arouter_compile                               = "1.1.4"
    const val arouter_annotation                            = "1.0.4"
    const val arouter_register                              = "1.0.2"

    const val utilCode                                      = "1.25.9"

    const val fragmentation                                 = "1.3.5"

    // @formatter:on
}

object Deps {

    // @formatter:off

    const val android_gradle_plugin                         = "com.android.tools.build:gradle:${Versions.android_build_tools_gradle}"
    const val android_material                              = "com.google.android.material:material:${Versions.android_x_material}"

    const val android_x_appcompat                           = "androidx.appcompat:appcompat:${Versions.android_x_appcompat}"
    const val android_x_core_ktx                            = "androidx.core:core-ktx:${Versions.android_x_core_ktx}"
    const val android_x_fragment                            = "androidx.fragment:fragment:${Versions.android_x_fragment}"
    const val android_x_fragment_ktx                        = "androidx.fragment:fragment-ktx:${Versions.android_x_fragment}"

    // view
    const val android_x_constraintlayout                    = "androidx.constraintlayout:constraintlayout:${Versions.android_x_constraintlayout}"
    const val android_x_swiperefreshlayout                  = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.android_x_swiperefreshlayout}"
    const val android_x_recyclerview                        = "androidx.recyclerview:recyclerview:${Versions.android_x_recyclerview}"
    const val android_x_cardview                            = "androidx.cardview:cardview:${Versions.android_x_cardview}"
    const val android_x_coordinatorlayout                   = "androidx.coordinatorlayout:coordinatorlayout:${Versions.android_x_coordinatorlayout}"
    const val android_x_multidex                            = "androidx.multidex:multidex:${Versions.android_x_multidex}"
    const val android_x_percentlayout                       = "androidx.percentlayout:percentlayout:${Versions.android_x_percentlayout}"

    // lifecycle
    const val android_x_lifecycle_common                    = "androidx.lifecycle:lifecycle-common:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_common_java8              = "androidx.lifecycle:lifecycle-common-java8:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_compiler                  = "androidx.lifecycle:lifecycle-compiler:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_extensions                = "androidx.lifecycle:lifecycle-extensions:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_livedata                  = "androidx.lifecycle:lifecycle-livedata:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_livedata_core             = "androidx.lifecycle:lifecycle-livedata-core:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_livedata_core_ktx         = "androidx.lifecycle:lifecycle-livedata-core-ktx:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_livedata_ktx              = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_runtime                   = "androidx.lifecycle:lifecycle-runtime:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_runtime_ktx               = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_viewmodel                 = "androidx.lifecycle:lifecycle-viewmodel:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_viewmodel_ktx             = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.android_x_lifecycle}"
    const val android_x_lifecycle_viewmodel_savedstate      = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.android_x_lifecycle}"

    // room
    const val android_x_room_common                         = "androidx.room:room-common:${Versions.android_x_room}"
    const val android_x_room_compiler                       = "androidx.room:room-compiler:${Versions.android_x_room}"
    const val android_x_room_coroutines                     = "androidx.room:room-coroutines:${Versions.android_x_room}"
    const val android_x_room_ktx                            = "androidx.room:room-ktx:${Versions.android_x_room}"
    const val android_x_room_runtime                        = "androidx.room:room-runtime:${Versions.android_x_room}"

    // navigation
    const val android_x_navigation_common                   = "androidx.navigation:navigation-common:${Versions.android_x_navigation}"
    const val android_x_navigation_common_ktx               = "androidx.navigation:navigation-common-ktx:${Versions.android_x_navigation}"
    const val android_x_navigation_fragment                 = "androidx.navigation:navigation-fragment:${Versions.android_x_navigation}"
    const val android_x_navigation_fragment_ktx             = "androidx.navigation:navigation-fragment-ktx:${Versions.android_x_navigation}"
    const val android_x_navigation_runtime                  = "androidx.navigation:navigation-runtime:${Versions.android_x_navigation}"
    const val android_x_navigation_runtime_ktx              = "androidx.navigation:navigation-runtime-ktx:${Versions.android_x_navigation}"
    const val android_x_navigation_ui                       = "androidx.navigation:navigation-ui:${Versions.android_x_navigation}"
    const val android_x_navigation_ui_ktx                   = "androidx.navigation:navigation-ui-ktx:${Versions.android_x_navigation}"
    const val android_x_navigation_safe_args_generator      = "androidx.navigation:navigation-safe-args-generator:${Versions.android_x_navigation}"
    const val android_x_navigation_safe_args_gradle_plugin  = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.android_x_navigation}"

    // sqlite
    const val android_x_sqlite                              = "androidx.sqlite:sqlite:${Versions.android_x_sqlite}"
    const val android_x_sqlite_framework                    = "androidx.sqlite:sqlite-framework:${Versions.android_x_sqlite}"
    const val android_x_sqlite_ktx                          = "androidx.sqlite:sqlite-ktx:${Versions.android_x_sqlite}"

    // test
    const val junit                                         = "junit:junit:${Versions.junit}"
    const val test_runner                                   = "androidx.test:runner:${Versions.android_x_test_runner}"
    const val test_ext_junit                                = "androidx.test.ext:junit:${Versions.android_x_test_ext}"
    const val test_ext_junit_ktx                            = "androidx.test.ext:junit-ktx:${Versions.android_x_test_ext}"
    const val test_espresso_core                            = "androidx.test.espresso:espresso-core:${Versions.android_x_test_espresso_core}"

    // kotlin
    const val kotlin_gradle_plugin                          = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_stdlib_jdk7                            = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val kotlin_noarg                                  = "org.jetbrains.kotlin:kotlin-noarg:${Versions.kotlin}"
    const val kotlin_allopen                                = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
    const val kotlin_x_coroutines_android                   = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlin_x_coroutines_android}"

    // anko
    const val anko_commons                                  = "org.jetbrains.anko:anko-commons:${Versions.anko}"
    const val anko_sdk25                                    = "org.jetbrains.anko:anko-sdk25:${Versions.anko}"

    // retrofit
    const val retrofit2                                     = "com.squareup.retrofit2:retrofit:${Versions.retrotit2}"
    const val retrofit2_convert_gson                        = "com.squareup.retrofit2:converter-gson:${Versions.retrotit2}"
    const val retrofit2_convert_moshi                       = "com.squareup.retrofit2:converter-moshi:${Versions.retrotit2}"
    const val retrofit2_adapter_rxjava2                     = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrotit2}"

    // rxandroid,rxjava2
    const val rxjava2                                       = "io.reactivex.rxjava2:rxjava:${Versions.rxjava2}"
    const val rxandroid                                     = "io.reactivex.rxjava2:rxandroid:${Versions.rxandroid}"

    // gson
    const val gson                                          = "com.google.code.gson:gson:${Versions.gson}"

    // moshi
    const val moshi                                         = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshi_kotlin                                  = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    const val moshi_kotlin_gen                              = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"

    // glide
    const val glide                                         = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glide_compiler                                = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // eventbus
    const val eventbus                                      = "org.greenrobot:eventbus:${Versions.eventbus}"

    // fragmentation
    const val fragmentation                                 = "me.yokeyword:fragmentation:${Versions.fragmentation}"

    // arouter
    const val arouter_api                                   = "com.alibaba:arouter-api:${Versions.arouter_api}"
    const val arouter_compile                               = "com.alibaba:arouter-compile:${Versions.arouter_compile}"

    const val utilCodex                                     = "com.blankj:utilcodex:${Versions.utilCode}"


    // @formatter:on
}