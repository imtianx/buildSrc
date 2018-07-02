/**
 * <pre>
 *     @desc:
 * </pre>
 * @author 奚岩
 * @date 2018/7/2 9:44 AM
 */

object Versions {

    const val android_plugin = "3.1.3"
    const val android_sdk_compile = "27"
    const val android_sdk_min = 15
    const val android_sdk_target = 27
    const val android_sdk_support = "27.1.1"

    const val multidex = "1.0.3"

    const val kotlin = "1.2.41"
    const val anko = "0.10.5"

    const val constraintlayout = "1.1.2"


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

    const val constraintlayout = "com.android.support:multidex:${Versions.constraintlayout}"

    // kotlin plugin,jre7,noarg,allopen
    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlin_stdlib_jre7 = "org.jetbrains.kotlin:kotlin-stdlib-jre7:${Versions.kotlin}"
    const val kotlin_noarg = "org.jetbrains.kotlin:kotlin-noarg:${Versions.kotlin}"
    const val kotlin_allopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"


    // anko,mo to see : https://github.com/Kotlin/anko
    const val anko_commons = "org.jetbrains.anko:anko-commons:${Versions.anko}"
    const val anko_sdk25 = "org.jetbrains.anko:anko-sdk25:${Versions.anko}"

    // databinding compile ,the version same as android_plugin
    const val databinding_compile = "com.android.databinding:compiler:${Versions.android_plugin}"


}