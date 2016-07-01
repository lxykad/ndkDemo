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