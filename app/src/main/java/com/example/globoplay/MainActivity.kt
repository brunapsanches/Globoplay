package com.example.globoplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.concurrent.TimeUnit
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.os.Handler().postDelayed(
//Para fazer com que a tela fique trava por alguns segundos.
            {
                val i: Intent = Intent(this, pagina_inicial::class.java)
                startActivity(i)

                finish()
            }, 5*1000
        )
    }

}

