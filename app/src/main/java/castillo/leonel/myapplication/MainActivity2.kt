package castillo.leonel.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class MainActivity2 : AppCompatActivity() {
    var mensajeRecibido = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val datoMostrar = findViewById<TextView>(R.id.datoMostrar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)


        intent.extras?.let { bundle ->
            //mensajeRecibido = bundle.getString("suma", "")
            mensajeRecibido = bundle.getInt("suma", 0)
            datoMostrar.text = mensajeRecibido.toString()

        }

        btnRegresar.setOnClickListener{
            //val i = Intent(this,MainActivity::class.java)
            //val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))
            //i.putExtra("apellido", datoMostrar.text.toString())
            //i.putExtra("nombre", mensajeRecibido)
            //startActivity(i)
            finish()
        }
    }
}