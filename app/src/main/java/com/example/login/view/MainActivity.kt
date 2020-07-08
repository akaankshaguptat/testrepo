package com.example.login.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.example.login.R
import com.example.login.model.pojo.LoginModel
import com.example.login.util.showToast
import com.example.login.viewmodel.LoginViewmodel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    val mViewmodel=LoginViewmodel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setObservers()

    }


    private fun setObservers(){
        mViewmodel.getErrMessage().observe(this, Observer {
            showToast(it)
        })
    }




    }

