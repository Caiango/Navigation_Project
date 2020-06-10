package com.example.navigation_project

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_blank.view.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    companion object {
        var mostrar: String = ""
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_blank, container, false)
        val button: Button = root.findViewById(R.id.but_frag)
        val text_name: EditText = root.findViewById(R.id.editName)
        button.setOnClickListener {
            mostrar = text_name.text.toString()
            val intent = Intent(context, teste1::class.java)
            startActivity(intent)
        }


        return root
    }


}
