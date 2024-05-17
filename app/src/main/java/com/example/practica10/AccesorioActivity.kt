package com.example.practica10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AccesorioActivity : AppCompatActivity() {
    private lateinit var descripcion : TextView
    private lateinit var imagen : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accesorio)
        descripcion = findViewById(R.id.txtDescripcion)
        imagen = findViewById(R.id.imgAccesorioDetalle)
        val info = intent.extras
        val detalle: String?
        val costo: String?
        val num: Int?
        if(info != null){
            detalle = info.getString("detalle")
            costo = info.getString("costo")
            num = info.getInt("numAccesorio")
            descripcion.text = "Descripcion del producto:\n${detalle}\nCosto: ${costo}"
            when(num){
                1->imagen.setImageResource(R.drawable.prenda01)
                2->imagen.setImageResource(R.drawable.prenda02)
                3->imagen.setImageResource(R.drawable.prenda03)
                4->imagen.setImageResource(R.drawable.prenda04)
                5->imagen.setImageResource(R.drawable.prenda05)
            }
        }else{
            detalle = "Sin detalle"
            costo = "$0.00"
            num = 1
            descripcion.text = "Descripcion del produto:\n${detalle}\nCosto: ${costo}"
        }
    }
}