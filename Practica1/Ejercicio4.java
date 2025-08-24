package Practica1;

import java.util.Scanner;

//En este ejercicio pedire que pasen dos numeros e indicare cual es mayor y cual menor
public class Ejercicio4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Veamos, vas a darme dos numeros y te dire cual es mayor y cual es menor:");
        int num1 = sc.nextInt();

        System.out.println("Ahora el segundo");
        int num2 = sc.nextInt();
        //Esto de aqui son ternarios encadenados, en vez de hacer un if/else como antes realizamos este en menos lineas
        String mensaje = (num1>num2)?"El "+ num1+" es mayor":
                         (num2>num1)?"El "+ num2+" es mayor":
                         "Ambos numeros son iguales";
        System.out.println(mensaje);

        sc.close();
    }
}