package Practica1;

//El objetivo de este programa es usar Scanner para pasar datos por consola

//Para poder pasar datos por consola lo primero debemos importar la biblioteca encargada de hacer esa funcion
import java.util.Scanner;

public class Ejercicio2 {
    
    public static int suma(int num1,int num2){
        return num1+num2;
    }
    public static int resta(int num1,int num2){
        return num1-num2;
    }
    public static int mult(int num1,int num2){
        return num1*num2;
    }
    public static double div(int num1,int num2){
        return (double)num1/num2;
    }
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Dame el primer número: ");
    int num1 = sc.nextInt();

    System.out.print("Dame el segundo número: ");
    int num2 = sc.nextInt();

    System.out.println("La suma de "+num1+" y "+num2+" es igual a: "+suma(num1,num2));
    System.out.println("La resta de "+num1+" y "+num2+" es igual a: "+resta(num1,num2));
    System.out.println("La multiplicación de "+num1+" y "+num2+" es igual a: "+mult(num1,num2));
    System.out.println("La división de "+num1+" y "+num2+" es igual a: "+div(num1,num2));

    sc.close();
    }
}

//La versión de arriba es más optima ya que si lo que buscamos es llamar a diferentes metodos en futuros programas nos sera
//más útil, pudiendo llamarlos de forma individual como suma, resta, mult o div.
//De la forma mostrada aquí abajo, aunque eficaz para el ejercicio, realizaria todo de golpe tras pedir los datos.
    /*
    public static void main(String[]args){

        //Esta linea de codigo crea una variable tipo Scanner,
        //le da nombre y dice de donde va a leer los datos (System.in) nos dice que desde consola.
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame el primer numero ");

        int num1 = sc.nextInt();

        System.out.println("Dame el segundo numero ");

        int num2 = sc.nextInt();

        //Estas variables mejor escribirlas todo en minuscula
        int suma = num1+num2;
        int resta = num1-num2;
        int mult = num1*num2;
        //Para la division creamos una variable double por si salen decimales
        double div = (double)num1/num2;

        System.out.println("La suma de "+num1+" y "+num2+" es igual a: "+suma);
        System.out.println("La resta de "+num1+" y "+num2+" es igual a: "+resta);
        System.out.println("La multiplicación de "+num1+" y "+num2+" es igual a: "+mult);
        System.out.println("La división de "+num1+" y "+num2+" es igual a: "+div);

        sc.close();
    }    
}
*/


