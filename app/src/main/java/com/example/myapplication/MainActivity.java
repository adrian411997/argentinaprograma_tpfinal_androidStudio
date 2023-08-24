package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Aqui inicializamos los valores de los strings
    private EditText editText1;
    private EditText editText2;

    //Aqui vamos a usar la clase que creamos aparte
    private ViewModelGlobal viewModel;
    private TextView field;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Introducimos en esta variable las funciones relacionadas a lo clase que creamos aparte
        viewModel = new ViewModelProvider(this).get(ViewModelGlobal.class);
    }


    public void  onButtonClick(View v){
        editText1  = findViewById(R.id.firstWord);
        editText2  = findViewById(R.id.secondWord);
        field = findViewById(R.id.textView);

        String valor1 = editText1.getText().toString();
        String valor2 = editText2.getText().toString();
        //USAMOS LA FUNCION QUE CREAMOS Y LA GUARDAMOS EN UNA VARIABLE
        String resultado = viewModel.compararPalabras(valor1, valor2);
        //LUEGO LA ESCRIBIMOS EN EL TEXTVIEW
        field.setText(resultado);
    }
    public void changeScreen(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}