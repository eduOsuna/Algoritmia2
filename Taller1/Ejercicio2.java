package Taller1;

import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        int opcion, valor;
        Scanner s = new Scanner(System.in);
        Lista lista = new Lista();
        Lista lliures = new Lista();
        
        lista.crearLista();
        System.out.print("¿Quiere eliminar algun elemento de la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        while (opcion == 1) {
            System.out.print("¿Que información tiene el elemento a eliminar?: ");
            valor = s.nextInt();
            lista.eliminarNodo(lliures, valor);
            System.out.print("¿Quiere seguir eliminando elementos de la lista? (Sí=1/No=0): ");
            opcion = s.nextInt();
        }
        System.out.println("¿Quiere imprimir por pantalla la lista? (Sí=1/No=0): ");
        opcion = s.nextInt();
        if (opcion == 1) {
            System.out.println("Lista lista:");
            lista.imprimirLista();
            System.out.println("Lista lliures:");
            lliures.imprimirLista();
        }
        s.close();
    }
}