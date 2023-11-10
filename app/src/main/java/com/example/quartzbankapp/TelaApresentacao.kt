package com.example.quartzbankapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TelaApresentacao : AppCompatActivity() {
    private var teclado: GridLayout? = null
    private var textTeclado: GridLayout? = null
    private var digitCount = 0 // Adicione esta variável global

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_apresentacao)

        teclado = findViewById<GridLayout>(R.id.teclado)
        textTeclado = findViewById<GridLayout>(R.id.textTeclado)

        val buttonToShowKeyboard = findViewById<Button>(R.id.button_enter)
        buttonToShowKeyboard.setOnClickListener {
            val tecladoLocal = teclado
            val textTecladoLocal = textTeclado

            if (tecladoLocal != null && textTecladoLocal != null) {
                val currentVisibility = tecladoLocal.visibility
                val newTextTecladoVisibility =
                    if (currentVisibility == View.VISIBLE) View.INVISIBLE
                    else View.VISIBLE

                tecladoLocal.visibility = newTextTecladoVisibility
                textTecladoLocal.visibility = newTextTecladoVisibility
                buttonToShowKeyboard.visibility = View.INVISIBLE
            }
        }

         val buttonBack = findViewById<Button>(R.id.buttom_back)
        buttonBack.setOnClickListener{
            val tecladoLocal = teclado
            val textTecladoLocal = textTeclado
            if (tecladoLocal != null && textTecladoLocal != null){
                tecladoLocal.visibility = View.INVISIBLE
                textTecladoLocal.visibility = View.INVISIBLE
                buttonToShowKeyboard.visibility = View.VISIBLE
                textTecladoLocal.removeAllViews()
                digitCount = 0
            }
        }

        setupNumericButton(R.id.buttom_1, "1")
        setupNumericButton(R.id.buttom_2, "2")
        setupNumericButton(R.id.buttom_3, "3")
        setupNumericButton(R.id.buttom_4, "4")
        setupNumericButton(R.id.buttom_5, "5")
        setupNumericButton(R.id.buttom_6, "6")
        setupNumericButton(R.id.buttom_7, "7")
        setupNumericButton(R.id.buttom_8, "8")
        setupNumericButton(R.id.buttom_9, "9")
        setupNumericButton(R.id.buttom_0, "0")

        val buttonDelete = findViewById<Button>(R.id.buttom_x)
        buttonDelete.setOnClickListener { deleteLastDigitFromGrid() }
    }

    private fun setupNumericButton(buttonId: Int, digit: String) {
        val button = findViewById<Button>(buttonId)
        button.setOnClickListener { appendDigitToGrid(digit) }
    }

    private fun appendDigitToGrid(digit: String) {
        if (digitCount < 4) { // Limite para apenas quatro dígitos
            val textView = TextView(this)
            textView.text = digit
            textView.textSize = 40f
            textView.layoutParams = GridLayout.LayoutParams().apply {
                rowSpec =
                    GridLayout.spec(GridLayout.UNDEFINED, 1f) // Cada número ocupa uma linha
                columnSpec =
                    GridLayout.spec(digitCount) // Cada número vai para a próxima coluna
            }
            textTeclado!!.addView(textView)

            digitCount++
        }
    }

    private fun deleteLastDigitFromGrid() {
        val childCount = textTeclado!!.childCount
        if (childCount > 0) {
            textTeclado!!.removeViewAt(childCount - 1)
            digitCount--
        }
    }
}
