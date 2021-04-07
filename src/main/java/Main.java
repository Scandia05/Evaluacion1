import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 0;
        System.out.println("Hola, en este programa podrá convertir números decimales a binarios y viceversa\n");
        System.out.println("¿Qué desea hacer?");
        System.out.println("[1] Mostrar representación binaria (de 8 bits) ");
        System.out.println("[2] Mostrar representación decimal (base 10)");
        System.out.println("[0] Salir");
        String opcion = teclado.nextLine();
        int a = ingresarNúm(num);
        switch (opcion) {
            case "1":
                ingresarNúm(num);
                numeroEntero(a);
                convertirBinario8Bits(num);
                break;
            case "2":
                break;
            case "0":
                break;
            default:



        }
    }

    private static void convertirBinario8Bits(int num) {
        num = 0;
        int modulo;
        String binario = "";
        num = teclado.nextInt();
        while (num > 0) {
            modulo = (num % 2);
            binario = modulo + binario;
            num = num / 2;
            System.out.println("El número " + num + " base 10 es = " + binario + " en base 2");

        }
    }

    public static int ingresarNúm(int num) {
        do {
            try {
                System.out.println("Ingrese un número por favor");
                num = teclado.nextInt();

            } catch (Exception e) {
                System.out.println("Dato inválido");
                teclado.next();
            }
        } while (0 >= num);
        return num;
    }

    public static boolean numeroEntero(int leerNumero) {
        boolean num = false;
        if (leerNumero != (int) leerNumero) {
            leerNumero = (int) leerNumero;
            return true;
        } else {
            return true;
        }
    }
}




