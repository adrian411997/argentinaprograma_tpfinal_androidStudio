package com.example.myapplication;
import androidx.lifecycle.ViewModel;

//DESDE AQUI VAMOS A MANEJAR LA LOGICA DE LA APLICACION
public class ViewModelGlobal extends ViewModel{
    public String compararPalabras(String palabra1, String palabra2){
        // EN ESTA FUNCION PEDIREMOS 2 PARAMETROS QUE SERÁN COMPARADOS Y RETORNARÁN UN RESULTADO DETERMINADO
        if(palabra1.equals(palabra2)){
            return("Las palabras son iguales");
        }
        return("Las palabras no son iguales");
    }
}
