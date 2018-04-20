package br.com.rodrigo.nacdadocorrecao

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var vitorias = 0
    var derrotas = 0
    var empates = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPlay.setOnClickListener{
            jogar()
        }
    }

    fun jogar(){
        val geradorNumero = Random()
        val numeroPlayer = geradorNumero.nextInt(6) + 1
        val numeroPC = geradorNumero.nextInt(6) + 1
        configuraDado(numeroPlayer, ivPlayer)
        configuraDado(numeroPC, ivPC)


        if (numeroPlayer > numeroPC){
            vitorias++
            tvVitorias.text = vitorias.toString()
        }else if (numeroPlayer < numeroPC){
            derrotas++
            tvDerrotas.text = derrotas.toString()
        }else {
            empates++
            tvEmpates.text = empates.toString()
        }
    }

    fun configuraDado(numero: Int, Imagem: ImageView){
        when(numero){
            1-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_1))

            2-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_2))

            3-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_3))

            4-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_4))

            5-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_5))

            6-> Imagem.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.goku_6))
        }
    }
}
