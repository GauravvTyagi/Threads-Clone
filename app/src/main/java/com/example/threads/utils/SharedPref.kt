package com.example.threads.utils

import android.content.Context.MODE_PRIVATE
import io.grpc.Context


object SharedPref {

    fun storeData(name:String, email:String,bio:String,userName:String,imageUrl:String,context: android.content.Context){
        val sharedPreferences = context.getSharedPreferences("users",MODE_PRIVATE)
        val editor=sharedPreferences.edit()
        editor.putString("name", name)
        editor.putString("email",email)
        editor.putString("bio", name)
        editor.putString("userName", name)
        editor.putString("imageUrl",email)
        editor.apply()
    }
     fun getUserName(context: android.content.Context):String {
         val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
         return sharedPreferences.getString("userName","")!!
     }
    fun getName(context: android.content.Context):String {
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("name","")!!
    }
    fun getUserEmail(context: android.content.Context):String {
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("email","")!!
    }
    fun getUserBio(context: android.content.Context):String {
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("bio","")!!
    }
    fun getUsseImage(context: android.content.Context):String {
        val sharedPreferences = context.getSharedPreferences("users", MODE_PRIVATE)
        return sharedPreferences.getString("imageUrl","")!!
    }
}