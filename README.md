# Calculadora en Kotlin con Jetpack Compose

Este proyecto es una sencilla aplicación de calculadora desarrollada en **Kotlin** utilizando **Jetpack Compose** para la interfaz de usuario en Android. La aplicación permite ingresar dos números y realizar una operación de suma entre ellos.

## Descripción

La aplicación tiene una interfaz básica donde los usuarios pueden ingresar dos números a través de campos de texto. Al presionar un botón con el signo "+" se realiza la suma de los dos números ingresados y muestra el resultado. La interfaz es simple pero funcional y valida que los valores ingresados sean numéricos.

## Características

- Interfaz de usuario moderna utilizando **Jetpack Compose**.
- Entrada de números a través de campos de texto con validación de entradas.
- Suma de dos números y visualización del resultado.
- Uso de la API de **KeyboardOptions** para que solo se puedan ingresar números.
- Validación de los valores para evitar entradas no numéricas.

## Tecnologías utilizadas

- **Kotlin**: Lenguaje principal para el desarrollo de la aplicación.
- **Jetpack Compose**: Biblioteca de UI moderna y declarativa para construir la interfaz de usuario.
- **Android SDK**: Plataforma base para desarrollar aplicaciones Android.
- **Material3**: Uso de componentes de Material Design 3 para la UI (como `Button`, `TextField`, `Text`, etc.).

## Estructura del proyecto

El proyecto contiene una sola actividad (`MainActivity`) que es la pantalla principal donde se encuentran los componentes de la calculadora.

- `MainActivity.kt`: Clase principal que define la lógica de la aplicación.
- `MyTexts()`: Componente composable que contiene los elementos de la interfaz (campos de texto, botones y el resultado).
- `PreviewTexts()`: Función para previsualizar la interfaz en el editor de Compose.

## Funcionamiento

1. El usuario ingresa un número en el primer campo de texto.
2. El usuario ingresa un número en el segundo campo de texto.
3. Al presionar el botón con el símbolo "+", los dos números ingresados se suman.
4. El resultado de la suma se muestra debajo de los campos de texto.

## Código

```kotlin
package com.example.calculatorkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

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
                if (it.isEmpty() || it.matches(pattern)) { 
                    number = it
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Enter a number here") }
        )

        Button(onClick = {
            val primerNumero = number.toIntOrNull() ?: 0
            val segundoNumero = number2.toIntOrNull() ?: 0
            resultado = (primerNumero + segundoNumero).toString()
        }) {
            Text("+")
        }

        TextField(
            value = number2,
            onValueChange = {
                if (it.isEmpty() || it.matches(pattern)) { 
                    number2 = it
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            label = { Text("Enter a number here") }
        )

        Text(text = resultado)
    }
}

@Preview
@Composable
fun PreviewTexts() {
    MyTexts()
}
```

## Cómo ejecutar el proyecto

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en **Android Studio**.
3. Conecta un dispositivo Android o utiliza un emulador para ejecutar la aplicación.
4. Ejecuta la aplicación y usa la calculadora.
