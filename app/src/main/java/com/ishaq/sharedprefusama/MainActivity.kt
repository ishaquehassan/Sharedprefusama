package com.ishaq.sharedprefusama

import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRm.setOnClickListener {
            delAppData("username")
        }

        //saveAppData("username","FUCK")

        val udata =  UserData(1,"Ishaq","ishaquehassan@gmail.com")

        //aveAppData("loginData",udata)

        val loginData = getAppData("loginData",UserData::class.java)


        //val myUname = getAppData("username")

        //Toast.makeText(this,"User is : $myUname",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"User is : ${loginData.name}",Toast.LENGTH_SHORT).show()
    }
}


