package com.example.calculatorkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculatorkotlin.ui.theme.CalculatorKotlinTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTexts()
        }
    }
}

@Composable
fun MyTexts() {
    Column {
        var number by remember { mutableStateOf("") }
        var number2 by remember { mutableStateOf("") }
        var resultado by remember { mutableStateOf("") }
        val pattern = remember { Regex("^\\d+\$") }
        TextField(
            value = number,
            onValueChange = {
                if (it.isEmpty() || it.matches(pattern)) { // Valida que coincida con el patrón
                    number = it
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text("Enter a number here") }
        )

                Button(onClick = {
                    val primerNumero = number.toIntOrNull() ?:0
                    val segundoNumero = number2.toIntOrNull() ?:0
                    resultado = (primerNumero + segundoNumero).toString()
                }) {
            Text("+")
        }
        TextField(
            value = number2,
            onValueChange = {
                if (it.isEmpty() || it.matches(pattern)) { // Valida que coincida con el patrón
                    number2 = it
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number
            ),
            label = { Text("Enter a number here") }
        )
        Text( text = resultado)
    }

}

@Preview
@Composable
fun PreviewTexts() {
    MyTexts()
}

