package com.example.mbs.fragmentkot

import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.support.v4.toast
import kotlinx.android.synthetic.main.activity_main.*
import android.app.Activity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        botonA.setOnClickListener{

            val intent = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(intent)



        }




    }



}
