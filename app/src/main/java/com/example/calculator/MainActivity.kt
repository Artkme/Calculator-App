package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    var number1: Float = 0.0f
    var isPlus: Boolean = false
    var isMinus: Boolean = false
    var isDivide: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edit_text)

    }

    fun operationFunction(view : View){

        when(view.id){

            R.id.button_one -> {
                numberClicked(1)
            }
            R.id.button_two -> {
                numberClicked(2)
            }
            R.id.button_three -> {
                numberClicked(3)
            }
            R.id.button_four -> {
                numberClicked(4)
            }
            R.id.button_five -> {
                numberClicked(5)
            }
            R.id.button_six -> {
                numberClicked(6)
            }
            R.id.button_seven -> {
                numberClicked(7)
            }
            R.id.button_eight -> {
                numberClicked(8)
            }
            R.id.button_nine -> {
                numberClicked(9)
            }
            R.id.button_zero -> {
                numberClicked(0)
            }
            R.id.button_dot -> {
                dotClicked()
            }
            R.id.button_clear -> {
                editText.setText("")
            }
            R.id.button_plus -> {
                plusClicked()
            }
            R.id.button_minus -> {
                minusClicked()
            }
            R.id.button_slash -> {
                slashClicked()
            }
            R.id.button_equal -> {
                equalClicked()
            }
        }
    }

    private fun numberClicked(numberClicked: Int){
        val number = editText.text.toString() + numberClicked.toString()
        editText.setText(number)
    }

    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }

    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }

    private fun slashClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }

    private fun dotClicked(){
        val number = editText.text.toString() + "."
        editText.setText(number)
    }

    private fun equalClicked(){
        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDivide -> {
                divide()
            }
        }
    }

    private fun plus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 + number2
        editText.setText(result.toString())
        isPlus = false
    }

    private fun minus(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 - number2
        editText.setText(result.toString())
        isMinus = false
    }

    private fun divide(){
        val number2 = editText.text.toString().toFloat()
        val result = number1 / number2
        editText.setText(result.toString())
        isDivide = false
    }
}