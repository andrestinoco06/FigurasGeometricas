package edu.unicundi.figurasgeometricas;

import java.util.Scanner;

/**
 *
 * @author Camilo Tinoco
 * @author Johan Zambrano
 * @version 1.0.0
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("-- Menu --");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            opcion = leer.nextInt();
        } while (opcion > 3 || opcion < 1);

        switch (opcion) {
            case 1:
                //invoca el metodo coordenadas y envia 1 indicando que son las coordenadas de un cuadrado
                int[] arrayCoordenadasC = coordenadas(1);
                Cuadrado c = new Cuadrado(arrayCoordenadasC);
                break;
            case 2:
                //invoca el metodo coordenadas y envia 2 indicando que son las coordenadas de un rectangulo
                int[] arrayCoordenadasR = coordenadas(2);
                //aqui invoca la clase de rectangulo
            break;
            case 3:
                //invoca el metodo coordenadas y envia 3 indicando que son las coordenadas de un triangulo
                int[] arrayCoordenadasT = coordenadas(3);
                Cuadrado t = new Cuadrado(arrayCoordenadasT);
            break;
        }

    }

    static int[] coordenadas(int tipo) {
        //Guarda las coordenadas, X y Y, son 4 coordenadas, 8 números en total
        int[] coordenadas = new int[8];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            //Ingresa los valores de X
            if (i % 2 == 0) {
                System.out.println("Ingrese la coordenada " + (i + 1) + " en X => ");
                coordenadas[i] = leer.nextInt();
            } else {
                //Ingresa los valores de Y
                System.out.println("Ingrese la coordenada " + (i) + " en Y => ");
                coordenadas[i] = leer.nextInt();
            }
            //tipo 3 son las coordenadas de un triangulo, como un triangulo solo tiene tres coordenadas, el arreglo duplica la ultima coordenada para completar 4 y poder pintar
            if(tipo==3 && i==5){
                coordenadas[i+1] = coordenadas[i-1];
                coordenadas[i+2] = coordenadas[i];
                //finaliza el for
                i=9;
            }
        }
        //Imprime las coordenadas
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("Coordenada " + (i + 1) + " en X => " + coordenadas[i]);
            } else {
                System.out.println("Coordenada " + (i) + " en Y => " + coordenadas[i]);
            }
        }
        return coordenadas;
    }
}
