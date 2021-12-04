package castillo.leonel.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    val TAG = "ciclo_vida"
    lateinit var KHE:TextView
    //Es el punto de entrada de la app
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        KHE = findViewById<TextView>(R.id.KHE)
        val btnClick = findViewById<Button>(R.id.WTF)
        val kHE1 = findViewById<TextView>(R.id.KHE1)

        btnClick.setOnClickListener{
            val num1 = KHE.text.toString().toInt()
            val num2 = kHE1.text.toString().toInt()
            val suma = num1 + num2
            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("suma", suma)

            //Llamamos al método que inicia una nueva activity pasándole el intent
            startActivityForResult(i,666)
            KHE.text = ""
            kHE1.text = ""
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 666){
            if (resultCode == Activity.RESULT_OK){
                val stringEsperado = data?.getStringExtra("respuesta")
                KHE.text = stringEsperado
            }
        }
    }

}