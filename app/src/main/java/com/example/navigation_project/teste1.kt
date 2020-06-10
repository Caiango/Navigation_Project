package com.example.navigation_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_teste1.*

class teste1 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste1)



        buttonChange.setOnClickListener {

            var a = supportFragmentManager.beginTransaction()
            var b = BlankFragment()
            a.replace(R.id.teste_lay, b)
            a.commit()
        }

        if(BlankFragment.mostrar.isNotEmpty()){
            Toast.makeText(applicationContext, BlankFragment.mostrar,Toast.LENGTH_SHORT).show()
        }

    }

}
