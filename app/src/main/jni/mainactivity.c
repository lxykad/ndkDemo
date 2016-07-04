#include <jni.h>

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
Java_com_lxy_ndk_SecondActivity_getTV2(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "我是tv2");
}