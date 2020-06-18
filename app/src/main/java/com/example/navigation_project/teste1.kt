package com.example.navigation_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_teste1.*

class teste1 : AppCompatActivity() {

    lateinit var list: ListView
    lateinit var text: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste1)

        list = findViewById(R.id.lista)
        text = findViewById(R.id.Clicked)

        var nomes_lista = arrayListOf<String>("Caio", "Camila", "PPS")
        list.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes_lista)
        list.setOnItemClickListener{
            parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            Clicked.text = nomes_lista[position]
            
        }


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
