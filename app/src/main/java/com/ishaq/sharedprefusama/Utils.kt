package com.ishaq.sharedprefusama

import com.google.gson.Gson

fun Any.toJson(): String = Gson().toJson(this)

fun <T> String.fromJson(cls: Class<T>): T = Gson().fromJson(this, cls)