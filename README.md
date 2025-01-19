# Proyecto de Calculadora en Android Studio

## Descripción
Este proyecto consiste en una calculadora simple desarrollada en Android Studio, que permite realizar operaciones de suma entre dos números ingresados por el usuario. La aplicación utiliza XML para el diseño de la interfaz de usuario y Java para la lógica de la aplicación.

## Tecnologías Utilizadas
- **Lenguaje de programación:** Java
- **Diseño de interfaz:** XML
- **Entorno de desarrollo:** Android Studio

## Características
1. Permite ingresar dos números en campos de texto.
2. Incluye un botón para realizar la operación de suma.
3. Muestra el resultado de la operación en un TextView.
4. Manejo de errores para entradas no válidas.

## Estructura del Proyecto

### Archivo Java (`MainActivity.java`)

El código Java contiene la lógica principal de la calculadora:
- **Referencias a los componentes de la interfaz** como `EditText`, `Button` y `TextView`.
- **Evento OnClickListener:** Se asocia al botón para manejar el clic del usuario.
- **Conversión y operación:** Los valores ingresados se convierten a enteros y se realiza la suma.
- **Manejo de errores:** En caso de entradas no válidas, se muestra un mensaje de error.

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);

    EditText numero1 = findViewById(R.id.numero1);
    EditText numero2 = findViewById(R.id.numero2);
    Button sumNumbers = findViewById(R.id.sumNumbers);
    TextView textView = findViewById(R.id.textView);

    sumNumbers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int suma = num1 + num2;
                textView.setText("Resultado: " + suma);
            } catch (NumberFormatException e) {
                textView.setText("Por favor ingresa números válidos");
            }
        }
    });
}
```

### Archivo XML (`activity_main.xml`)

El diseño de la interfaz incluye:
- **Dos campos de texto (`EditText`)** para ingresar los números.
- **Un botón (`Button`)** para ejecutar la suma.
- **Un elemento de texto (`TextView`)** para mostrar el resultado.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/sumNumbers"
        android:layout_width="64dp"
        android:layout_height="47dp"
        android:layout_marginStart="172dp"
        android:layout_marginTop="100dp"
        android:text="+"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero1"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="52dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero2"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="264dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="164dp"
        android:layout_marginTop="176dp"
        android:text="Resultado"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Instalación y Uso
1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en Android Studio.
3. Compila y ejecuta el proyecto en un emulador o dispositivo físico.
4. Ingresa dos números en los campos de texto.
5. Presiona el botón `+` para obtener la suma.

## Capturas de Pantalla
# Proyecto de Calculadora en Android Studio

## Descripción
Este proyecto consiste en una calculadora simple desarrollada en Android Studio, que permite realizar operaciones de suma entre dos números ingresados por el usuario. La aplicación utiliza XML para el diseño de la interfaz de usuario y Java para la lógica de la aplicación.

## Tecnologías Utilizadas
- **Lenguaje de programación:** Java
- **Diseño de interfaz:** XML
- **Entorno de desarrollo:** Android Studio

## Características
1. Permite ingresar dos números en campos de texto.
2. Incluye un botón para realizar la operación de suma.
3. Muestra el resultado de la operación en un TextView.
4. Manejo de errores para entradas no válidas.

## Estructura del Proyecto

### Archivo Java (`MainActivity.java`)

El código Java contiene la lógica principal de la calculadora:
- **Referencias a los componentes de la interfaz** como `EditText`, `Button` y `TextView`.
- **Evento OnClickListener:** Se asocia al botón para manejar el clic del usuario.
- **Conversión y operación:** Los valores ingresados se convierten a enteros y se realiza la suma.
- **Manejo de errores:** En caso de entradas no válidas, se muestra un mensaje de error.

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);

    EditText numero1 = findViewById(R.id.numero1);
    EditText numero2 = findViewById(R.id.numero2);
    Button sumNumbers = findViewById(R.id.sumNumbers);
    TextView textView = findViewById(R.id.textView);

    sumNumbers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int suma = num1 + num2;
                textView.setText("Resultado: " + suma);
            } catch (NumberFormatException e) {
                textView.setText("Por favor ingresa números válidos");
            }
        }
    });
}
```

### Archivo XML (`activity_main.xml`)

El diseño de la interfaz incluye:
- **Dos campos de texto (`EditText`)** para ingresar los números.
- **Un botón (`Button`)** para ejecutar la suma.
- **Un elemento de texto (`TextView`)** para mostrar el resultado.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/sumNumbers"
        android:layout_width="64dp"
        android:layout_height="47dp"
        android:layout_marginStart="172dp"
        android:layout_marginTop="100dp"
        android:text="+"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero1"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="52dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero2"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="264dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="164dp"
        android:layout_marginTop="176dp"
        android:text="Resultado"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Instalación y Uso
1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en Android Studio.
3. Compila y ejecuta el proyecto en un emulador o dispositivo físico.
4. Ingresa dos números en los campos de texto.
5. Presiona el botón `+` para obtener la suma.

## Capturas de Pantalla
# Proyecto de Calculadora en Android Studio

## Descripción
Este proyecto consiste en una calculadora simple desarrollada en Android Studio, que permite realizar operaciones de suma entre dos números ingresados por el usuario. La aplicación utiliza XML para el diseño de la interfaz de usuario y Java para la lógica de la aplicación.

## Tecnologías Utilizadas
- **Lenguaje de programación:** Java
- **Diseño de interfaz:** XML
- **Entorno de desarrollo:** Android Studio

## Características
1. Permite ingresar dos números en campos de texto.
2. Incluye un botón para realizar la operación de suma.
3. Muestra el resultado de la operación en un TextView.
4. Manejo de errores para entradas no válidas.

## Estructura del Proyecto

### Archivo Java (`MainActivity.java`)

El código Java contiene la lógica principal de la calculadora:
- **Referencias a los componentes de la interfaz** como `EditText`, `Button` y `TextView`.
- **Evento OnClickListener:** Se asocia al botón para manejar el clic del usuario.
- **Conversión y operación:** Los valores ingresados se convierten a enteros y se realiza la suma.
- **Manejo de errores:** En caso de entradas no válidas, se muestra un mensaje de error.

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);

    EditText numero1 = findViewById(R.id.numero1);
    EditText numero2 = findViewById(R.id.numero2);
    Button sumNumbers = findViewById(R.id.sumNumbers);
    TextView textView = findViewById(R.id.textView);

    sumNumbers.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                int num1 = Integer.parseInt(numero1.getText().toString());
                int num2 = Integer.parseInt(numero2.getText().toString());
                int suma = num1 + num2;
                textView.setText("Resultado: " + suma);
            } catch (NumberFormatException e) {
                textView.setText("Por favor ingresa números válidos");
            }
        }
    });
}
```

### Archivo XML (`activity_main.xml`)

El diseño de la interfaz incluye:
- **Dos campos de texto (`EditText`)** para ingresar los números.
- **Un botón (`Button`)** para ejecutar la suma.
- **Un elemento de texto (`TextView`)** para mostrar el resultado.

```xml
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/sumNumbers"
        android:layout_width="64dp"
        android:layout_height="47dp"
        android:layout_marginStart="172dp"
        android:layout_marginTop="100dp"
        android:text="+"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero1"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="52dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/numero2"
        android:layout_width="89dp"
        android:layout_height="47dp"
        android:layout_marginStart="264dp"
        android:layout_marginTop="100dp"
        android:ems="10"
        android:inputType="number"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="164dp"
        android:layout_marginTop="176dp"
        android:text="Resultado"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```

## Instalación y Uso
1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en Android Studio.
3. Compila y ejecuta el proyecto en un emulador o dispositivo físico.
4. Ingresa dos números en los campos de texto.
5. Presiona el botón `+` para obtener la suma.

## Capturas de Pantalla
![xml](https://github.com/user-attachments/assets/e7e2a9c8-1f69-4f3d-9e2d-f0585c233f4b)


## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama con tus cambios: `git checkout -b feature/nueva-funcionalidad`.
3. Realiza tus cambios y haz un commit: `git commit -m 'Agregada nueva funcionalidad'`.
4. Envía un pull request.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.



## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama con tus cambios: `git checkout -b feature/nueva-funcionalidad`.
3. Realiza tus cambios y haz un commit: `git commit -m 'Agregada nueva funcionalidad'`.
4. Envía un pull request.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.


## Contribución
Si deseas contribuir al proyecto, sigue estos pasos:
1. Haz un fork del repositorio.
2. Crea una rama con tus cambios: `git checkout -b feature/nueva-funcionalidad`.
3. Realiza tus cambios y haz un commit: `git commit -m 'Agregada nueva funcionalidad'`.
4. Envía un pull request.
****
