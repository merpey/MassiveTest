package com.merpey.massivetest.massivetest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.widget.Button
import android.widget.ImageView

class FaceDetectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_face_detect)

        val myImageView = findViewById<View>(R.id.imgview) as ImageView
        val options =  BitmapFactory.Options()
        options.inMutable=true
        val myBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.test1,options)

        val myRectPaint = Paint()
        val strokeWidth = 10
        myRectPaint.strokeWidth = strokeWidth.toFloat()
        myRectPaint.color = Color.RED
        myRectPaint.style = Paint.Style.STROKE

        val tempBitmap = Bitmap.createBitmap(myBitmap.width,myBitmap.height,Bitmap.Config.RGB_565)
        val tempCanvas = Canvas(tempBitmap)
        tempCanvas.drawBitmap(myBitmap,0.toFloat(),0.toFloat(),null)

        val btn = findViewById<View>(R.id.button) as Button
        /*
        btn.setOnClickListener {
            Toast.makeText(this,"buton basıldı",Toast.LENGTH_SHORT).show()

            val faceDetector = FaceDetector.Builder(getApplicationContext()).setTrackingEnabled(false).build()
            if (!faceDetector.isOperational()){

                Toast.makeText(this,"asdasd2",Toast.LENGTH_LONG)
                var builder = AlertDialog.Builder(this)
                builder.setMessage("Could not set up the face detector!").show()
            }


            val frame = Frame.Builder().setBitmap(myBitmap).build()
            val faces = faceDetector.detect(frame)
            val faces_size = faces.size()
            if (faces_size != null){
                for (i in faces_size.toInt()){
                    btn.text=i.toString()
                    val thisFace = faces.valueAt(i)
                    val x1 = thisFace.position.x
                }
            }
        }*/

    }
}
