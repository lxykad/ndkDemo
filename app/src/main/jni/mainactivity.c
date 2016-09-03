#include <jni.h>
#include <android/log.h>

JNIEXPORT jstring JNICALL
Java_com_lxy_ndk_MainActivity_getString(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "ndkDemo");
}

JNIEXPORT jstring JNICALL
Java_com_lxy_ndk_MainActivity_getData(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "666");
}

JNIEXPORT jint JNICALL
Java_com_lxy_ndk_MainActivity_getNum(JNIEnv *env, jobject instance, jint a, jint b) {

    // TODO


}

JNIEXPORT jstring JNICALL
Java_com_lxy_ndk_MainActivity_get(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "9999");
}

JNIEXPORT jstring JNICALL
Java_com_lxy_ndk_J2CActivity_getTV2(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "我是tv2");
}

JNIEXPORT jint JNICALL
Java_com_lxy_ndk_J2CActivity_add(JNIEnv *env, jobject instance, jint a, jint b) {

    // j2c 里的add方法

    return a + b;


}

JNIEXPORT jstring JNICALL
Java_com_lxy_ndk_J2CActivity_get(JNIEnv *env, jobject instance, jstring str_) {
    const char *str = (*env)->GetStringUTFChars(env, str_, 0);

    // TODO

    (*env)->ReleaseStringUTFChars(env, str_, str);

    return (*env)->NewStringUTF(env, str);
}

JNIEXPORT jintArray JNICALL
Java_com_lxy_ndk_J2CActivity_getInt(JNIEnv *env, jobject instance, jintArray arr_) {
    jint *arr = (*env)->GetIntArrayElements(env, arr_, arr);

    // TODO

    (*env)->ReleaseIntArrayElements(env, arr_, arr, 0);
}

JNIEXPORT void JNICALL
Java_com_lxy_ndk_MainActivity_test(JNIEnv *env, jobject instance) {

    // TODO

}