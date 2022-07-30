/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jose
 */
public abstract class ArrayListManager {

    public static ArrayList<Integer> generarAleatorio(int size) {
        ArrayList<Integer> retorno = new ArrayList<>();
        Random aleatorio;
        int numeroAleatorio;
        for (int i = 0; i < size; i++) {
            aleatorio = new Random();            
            numeroAleatorio = aleatorio.nextInt(50);
            retorno.add(numeroAleatorio);
        }        
        return retorno;
    }

    public static int sumaElementos(ArrayList<Integer> array) {
        int suma = 0;
        for (int i = 0; i < array.size(); i++) {
            suma += array.get(i);
        }
        return suma;
    }
}
