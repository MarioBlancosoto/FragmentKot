package com.example.mbs.fragmentkot


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.support.v4.toast
import kotlinx.android.synthetic.main.fragment_frag_a.*
/**
 * A simple [Fragment] subclass.
 */
class frag_a : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_frag_a, container, false)
    }



    override fun onViewCreated(view: View?, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)


        boton.setOnClickListener{

            toast("Mensaje: ${main_editText.text}")
            main_textview.text = main_editText.text
        }
    }



}// Required empty public constructor
