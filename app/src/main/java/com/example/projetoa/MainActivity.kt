package com.example.projetoa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTxServ()
        initSeekBar()

//        button2.setOnClickListener(object : View.OnClickListener{
//
//            override fun onClick(v: View?) {
//               var conta = editTextNumberDecimal.text.toString()
//               var dinheiro     = editTextNumberDecimal2.text.toString()
//
//            }
//
//        })
//        var conta= findViewById<EditText>(R.id.editTextNumberDecimal)
//        var dinheiro = findViewById<EditText>(R.id.editTextNumberDecimal2)
//        var taxa = findViewById<TextView>(R.id.textView9)
//        var taxatotal = conta / 100 *taxa;
//        var total = conta + taxa;
//        R.id.textView2.text = taxatotal
    }

    private fun initSeekBar() {

    }
    fun  lerdados() {
        var conta = editTextNumberDecimal.text.toString()
        var dinheiro = editTextNumberDecimal2.text.toString()
        var taxa = textView9.text.toString()
        var taxatotal:Double =  conta.toDouble() / 100 * taxa.toDouble()

        var total:Double = conta.toDouble() + taxatotal
        var troco:Double = dinheiro.toDouble() - total;
        textView3.text = taxatotal.toString()
        textView5.text = total.toString()
        textView8.text = troco.toString()
    }

    private fun initTxServ() {
      seekBar.setOnSeekBarChangeListener(
          object: SeekBar.OnSeekBarChangeListener{
              override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {


                      textView9.text = progress.toString()
                  

              }

              override fun onStartTrackingTouch(seekBar: SeekBar?) {

              }

              override fun onStopTrackingTouch(seekBar: SeekBar?) {

              }
          }
      )
    }
}