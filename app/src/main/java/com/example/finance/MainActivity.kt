package com.example.finance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.finance.ui.theme.ContasActivity
import com.example.finance.ui.theme.TranDespesaActivity
import com.example.finance.ui.theme.VisaoGeralActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnVisaoGeral = findViewById<Button>(R.id.button9)
        val btnTransacoes = findViewById<Button>(R.id.button7)
        val btnContas = findViewById<Button>(R.id.button8)

        btnVisaoGeral.setOnClickListener {
            val intent = Intent(this, VisaoGeralActivity::class.java)
            startActivity(intent)
        }

        btnTransacoes.setOnClickListener {
            val intent = Intent(this, TranDespesaActivity::class.java)
            startActivity(intent)
        }

        btnContas.setOnClickListener {
            val intent = Intent(this, ContasActivity::class.java)
            startActivity(intent)
        }
    }
}

