package com.example.hashmap_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Crear hashMap<tipoDatoClave,tipoDatoValor>

        HashMap<String,String> capitales= new HashMap<>();

        //Agregar elementos al hashmap
        capitales.put("Antioquía","Medellín");
        capitales.put("Caldas","Manizales");
        capitales.put("Cundinamarca","Bogotá");
        capitales.put("Boyacá","Tunja");
        capitales.put("Quindío","Armenia");
        capitales.put("Risaralda","Pereira");

        System.out.println(capitales.toString());
        //Remplazar un dato del hashmap
        capitales.replace("Cundinamarca","Bogotá DC");

        //Eliminar un elemento
        capitales.remove("Quindío");

        System.out.println(capitales.toString());

        //Clonar el hashMap --> hacer una copia
        HashMap<String,String> copiaCapitales= new HashMap<>();
        copiaCapitales.putAll(capitales);

        //Consultar un dato dentro del hashMap
        String caldas=capitales.get("Caldas");
        System.out.println(caldas);
        //Preguntar si dentro del HashMap hay una clave o un valor especifico
        boolean existe= capitales.containsKey("Valle del Cauca");
        boolean existeCapital= capitales.containsValue("Pereira");
        System.out.println(existe);
        System.out.println(existeCapital);
        HashMap<String,String> capitalesCaribe= new HashMap<>();
        capitalesCaribe.put("Atlántico","Barranquilla");
        capitalesCaribe.put("Bolívar","Cartagena");
        capitalesCaribe.put("Córdoba","Montería");
        capitalesCaribe.put("Magdalena","Santa Marta");

        //Unir listas
        copiaCapitales.putAll(capitalesCaribe);

        System.out.println(copiaCapitales.toString());

        //Vaciar o limpiar una hashMap
        copiaCapitales.clear();

        //Saber si un HashMap esta vacio
        boolean vacio= capitales.isEmpty();
        System.out.println(vacio);
        //Tamaño de un HashMap
        int size= capitales.size();
        System.out.println(size);

        //Recorrer el hashMap por sus claves
        //keySet() genera una lista con las claves del hashMap
        for (String i:capitales.keySet()) {
            System.out.println(i+"-"+capitales.get(i));
        }

        //Recorrer por sus valores
        //values() genera una lista con los valores del HashMap
        for (String i: capitales.values()){
            System.out.println(i);
        }

        //Recorrer clave - valor
        //Map.Entry son las interfaces que establecen el funcionamiento clave-valor en java
        // Entonces el iterador (i) debe ser un elemento de este tipo
        //entry.Set(), genera una estructura recorrible de clave-valor
        for (Map.Entry<String,String>i:capitales.entrySet()){
            System.out.println(i.toString());
            System.out.println(i.getKey()+"-"+i.getValue());
        }

        HashMap <String,Persona> ciudadanos=new HashMap<>();

        Persona luis= new Persona("Luis Rojas","01/08/1994"
        ,"12356489","Calle 68 #413-545","Manizales"
        ,"Soltero");

        ciudadanos.put("123456",luis);





    }
}