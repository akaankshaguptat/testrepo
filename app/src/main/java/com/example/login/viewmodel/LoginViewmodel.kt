package com.example.login.viewmodel

import android.content.Context
import android.text.TextUtils
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.login.model.data.Repository
import com.example.login.model.data.SharedPrefData
import com.example.login.util.ValidationUtils

class LoginViewmodel:ViewModel() {
    private var errMessage = MutableLiveData<String>()
    var email:String=""
    var pwd:String=""
    var data=SharedPrefData()
    var repo=Repository(data)
   fun onLoginClicked(
    // emailEditText: EditText,passwordEditText: EditText
   ){
       //check validations
       if(TextUtils.isEmpty(email)){
           errMessage.value="email cannot be left blank"
       }else if(!ValidationUtils.isValidEmail(email)){
           errMessage.value="please enter valid email address"
       }else if(TextUtils.isEmpty(pwd)){
           errMessage.value="password cannot be left blank"
       }

       //save data
       //repo.login(email, pwd,applicationContext)



   }
    fun getErrMessage(): LiveData<String> {
        return errMessage
    }
}