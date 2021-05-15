package ayan.tech.viewbinding

import android.graphics.Color.red
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import ayan.tech.viewbinding.R.color

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val yoyo= findViewById<TextView>(R.id.textView)

       /* yoyo.text="100"
        yoyo.textSize=50f
        */
        //with(yoyo)
        yoyo.apply{
            text="100"
            textSize=50f
        }

        val editTxt= findViewById<TextView>(R.id.editText)
        val button = findViewById<TextView>(R.id.button)

        editTxt.apply{
           // isEnabled=false
            hint="Enter your Name"
            setText("Ayan Agarwal ")
            this.addTextChangedListener{
                Log.i("ViewBinding", it.toString())
                button.isEnabled = it.toString().length in 7..18

            }

        }


        button.setOnClickListener{

            Toast.makeText(this, "Ayan Agarwal", Toast.LENGTH_SHORT).show()
        }




    }

   // fun showToast(view: View) {
  //      Toast.makeText(this, "Ayan Agarwal", Toast.LENGTH_SHORT).show()
   // }

}





