package com.merpey.massivetest.massivetest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{
            Toast.makeText(this@MainActivity,"Buton-1 basıldı.!", Toast.LENGTH_SHORT).show()
        }
        button_2.setOnClickListener{
            Toast.makeText(this@MainActivity,"Buton-2 basıldı.!", Toast.LENGTH_SHORT).show()
            val newIntent = Intent(this,EmptyActivity::class.java)
            startActivity(newIntent)
        }
        button_3.setOnClickListener{
            Toast.makeText(this@MainActivity,"Buton-3 basıldı.!", Toast.LENGTH_SHORT).show()
            val faceDetectIntent = Intent(this,FaceDetectActivity::class.java)
            startActivity(faceDetectIntent)
        }
        button_4.setOnClickListener{
            Toast.makeText(this@MainActivity,"Buton-4 basıldı",Toast.LENGTH_SHORT).show()
            val faceDetect2Intent = Intent(this,FaceDetect2Activity::class.java)
            startActivity(faceDetect2Intent)
        }
        button_5.setOnClickListener{
            Toast.makeText(this,"Buton-5 basıldı",Toast.LENGTH_SHORT).show()
            val faceDetect3Intent = Intent(this,FaceDetect3Activity::class.java)
            startActivity(faceDetect3Intent)
        }
        button_6.setOnClickListener{
            Toast.makeText(this,"Buton-6 basıldı",Toast.LENGTH_SHORT).show()
            val faceDetect4Intent = Intent(this,FaceDetect4Activity::class.java)
            startActivity(faceDetect4Intent)
        }
    }
}
