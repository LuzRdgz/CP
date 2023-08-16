package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReader archivo;
        BufferedReader leer;
        String cp;
        List<String> CP = new ArrayList<String>();


        try{
            archivo = new FileReader("C:\\Users\\LuzRd\\Desktop\\codigos_postales_hmo.txt");
            String cadena;
            int i=0;
            leer = new BufferedReader(archivo);
            while((cadena = leer.readLine()) != null){
                cp = cadena.substring(0,5);
                CP.add(cp);

            }

        }catch(Exception e){
            System.out.println("Error: " + e);
        }

    }
}