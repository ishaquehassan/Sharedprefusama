package com.ishaq.sharedprefusama

import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson

abstract class BaseActivity : AppCompatActivity(){

    protected fun getAppDataPref() = getSharedPreferences("APP_DATA", 0)

    protected fun saveAppData(key:String,value:String){
        val editor = getAppDataPref().edit()
        editor.putString(key,value)
        editor.apply()
    }

    protected fun saveAppData(key:String,value:Any){
        val editor = getAppDataPref().edit()
        editor.putString(key,value.toJson())
        editor.apply()
    }

    protected fun getAppData(key:String) = getAppDataPref().getString(key,null)

    protected fun <A> getAppData(key:String,cls: Class<A>): A = Gson().fromJson(getAppDataPref().getString(key,"{}"),cls)

    protected fun delAppData(key:String) = getAppDataPref().edit().remove(key).apply()
}