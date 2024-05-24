package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int contador = 0;
        while (contador < 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }


        int numero;
        do {
            System.out.print("Ingresa un número entre 1 y 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);
        System.out.println("Número válido: " + numero);

        // Estructura de control for
        for (int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }


        System.out.print("Ingresa un día de la semana (1-7): ");
        int dia = sc.nextInt();
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Día inválido";
                break;
        }
        System.out.println("Día seleccionado: " + nombreDia);




        int suma = 0;
        int num = 0;
        String opcion;

        do {
            System.out.print("Ingresa un número: ");
            num = sc.nextInt();
            suma += num;

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            opcion = sc.next();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("La suma de los números ingresados es: " + suma);

        sc.close();
    }
}