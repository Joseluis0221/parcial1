package main;

import java.util.Scanner;
import libro.Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 5, 0);
        Libro libro2 = new Libro();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el título del libro 2: ");
        libro2.setTitulo(sc.nextLine());

        System.out.println("Ingrese el autor del libro 2: ");
        libro2.setAutor(sc.nextLine());

        System.out.println("Ingrese el número de ejemplares del libro 2: ");
        libro2.setNumEjemplares(sc.nextInt());

        System.out.println("Ingrese el número de ejemplares prestados del libro 2: ");
        libro2.setNumPrestados(sc.nextInt());

        System.out.println("\nEstado del libro 1:");
        System.out.println(libro1.toString());

        System.out.println("\nEstado del libro 2:");
        System.out.println(libro2.toString());

        System.out.println("\nIntentando prestar el libro 1: " + libro1.prestamo());
        System.out.println("Intentando devolver el libro 1: " + libro1.devolucion());

        System.out.println("\nEstado actualizado del libro 1:");
        System.out.println(libro1.toString());
    }
}
