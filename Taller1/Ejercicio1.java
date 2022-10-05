package Taller1;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        int opcion;
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        
        lista.crearLista();
        System.out.println("¿Quiere imprimir por pantalla la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        if (opcion == 1) {
            lista.imprimirLista();
        }
        s.close();
    }
}