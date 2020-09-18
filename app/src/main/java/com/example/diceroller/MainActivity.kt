package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Inicializando as variaveis e os tipos
    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var rollButton: Button
    lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Inflando
        setContentView(R.layout.activity_main)
        //Atribuindo o id da view as variaveis
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        rollButton = findViewById(R.id.roll_button)
        clearButton = findViewById(R.id.clear_button)
        //Adicionando a ação ao botão
        rollButton.setOnClickListener { rollDice() }
        clearButton.setOnClickListener{clearDice()}

        //val countButton: Button = findViewById(R.id.countup_button)
        //countButton.setOnClickListener { countUp() }

        //val resetButton: Button = findViewById(R.id.reset_button)
        //resetButton.setOnClickListener{reset()}

    }

    private fun rollDice(){
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return  when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun clearDice(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
/*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text == "Hello World"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    } */

    /*
    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }*/

}