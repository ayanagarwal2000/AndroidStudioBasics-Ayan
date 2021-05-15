package ayan.tech.androidwidgets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
//import.android.widget.TextView
import kotlinx.android.synthetic.main. activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       textView1.text="Ayan "
        textView1.append("Aagrwal")
        editTextTextPersonName.requestFocus()

        checkBox.setOnCheckedChangeListener { button, b ->
            Toast.makeText(this, "checked", Toast.LENGTH_SHORT).show()
        }

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.radioButton ->{
                    Toast.makeText(this, "Radio Button 1 checked", Toast.LENGTH_SHORT).show()

                }
                R.id.radioButton2 ->{
                    Toast.makeText(this, "Radio Button 2 checked", Toast.LENGTH_SHORT).show()

                }
            }
        }







    }
}