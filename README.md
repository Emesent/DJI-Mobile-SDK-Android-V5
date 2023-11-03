# DJI Mobile SDK for Android V5 Latest Alpha Version 5.8.0-a2

[中文版](README_CN.md)

##  Alpha Version Announcement

1. To improve the problem-solving efficiency of developers' feedback, we will fix the serious problems first. And we will release the alpha version immediately after the regression test.
2. For letting developers experience and test the MSDK functions that have been developed but not officially released, we will also release the alpha version immediately after the product acceptance test and functional test.
3. The alpha version is not strictly tested before the release. There might exist some unstable problems. Please judge and choose whether to use this version according to the release note. If you have other problems, please contact us immediately.
4. All changes in the alpha version will be merged into the official version and will be strictly tested before the release.
5. It is not suggested that developers directly merge the MSDK alpha version and released it as an official version.

## Release Date

2023.11.03

## Release Notes

- Support camera stream management class: ICameraStreamManager.

> **Note:**
> IVideoStreamManager will be deprecated starting from MSDK 5.8.0. Please use ICameraStreamManager to implement video stream management related functions.
> The ProGuard rules for MSDK v5.8.0 alpha have been changed. Please make sure you have synchronized your project with sample.pro file.
> This Alpha version requires manual addition of dependencies:com.iqiyi.xcrash:xcrash-android-lib:3.1.0

## Offline Documentation

- /Docs/Android_API/en/index.html

## AAR Explanation

> **Notice:** sdkVersion = 5.8.0-a2

| SDK package  <div style="width: 150pt">  | Explanation  <div style="width: 200pt">   | How to use <div style="width: 300pt">|
| :---------------: | :-----------------:  | :---------------: |
|     dji-sdk-v5-aircraft-alpha      | Aircraft main package, which provides support for MSDK to control the aircraft. | implementation 'com.dji:dji-sdk-v5-aircraft-alpha:{sdkVersion}' |
| dji-sdk-v5-aircraft-provided-alpha | Aircraft compilation package, which provides interfaces related to the aircraft package. | compileOnly 'com.dji:dji-sdk-v5-aircraft-provided-alpha:{sdkVersion}' |
| dji-sdk-v5-networkImp-alpha | Network library package, which provides network connection ability for MSDK. Without this dependency, all network functions of MSDK will not work, but the interfaces of hardware control can be used normally. | runtimeOnly 'com.dji:dji-sdk-v5-networkImp-alpha:{sdkVersion}' |

- If only the aircraft product is in need to support, please use:
  ```groovy
  implementation 'com.dji:dji-sdk-v5-aircraft-alpha:{sdkVersion}'
  compileOnly 'com.dji:dji-sdk-v5-aircraft-provided-alpha:{sdkVersion}'
  ```

- If the MSDK have to use network(required by default), please use:
  ```groovy
  runtimeOnly 'com.dji:dji-sdk-v5-networkImp-alpha:{sdkVersion}'
  ```