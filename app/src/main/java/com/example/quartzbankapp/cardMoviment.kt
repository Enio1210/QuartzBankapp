package com.example.quartzbankapp

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/*class cardMoviment: AppCompatActivity(){
private lateinit var sensorManager: SensorManager
private lateinit var accelerometerSensor: Sensor
private lateinit var imageView: ImageView

override fun
        onCreate(savedInstanceState: Bundle?){

         super.onCreate(savedInstanceState)

    setContentView(R.layout.tela_apresentacao)

    sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
    accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)!!
    imageView = findViewById(R.id.card)
        }
}
override fun onResume(){
    super.onResume()

    sensorManager.registerListener(accelerometerListener, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL)
}
private val acccelerometerListener = object: SensorEventListener {
    override fun onSensorChanged(event: SensorEvent)
}
val x =*/