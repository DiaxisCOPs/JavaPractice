package Practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static  void main(String[]args){

        Scanner sc = new Scanner(System.in);
       
        while (true) {
            
           
            System.out.println("BIP BIP, INIZIALIZANDO CALCULADORA:\n\nIndica con el numero que operación quieres realizar:\n1) SUMA\n2) RESTA\n3) MULTIPLICACIÓN\n4) División\nX) Salir");
            
            char simbol = sc.next().charAt(0);
            //Proteccion de entrada de datos validos cuando se pide la operación.
            if(simbol != '1'&& simbol != '2'&& simbol != '3'&& simbol != '4'&& simbol != 'x'&& simbol != 'X'){
                System.out.println("Opción inválida, inténtalo de nuevo.");
                continue;
            }
            if (simbol == 'X' || simbol == 'x') {
                System.out.println("Apagando calculadora... BIP BIP");
                break;
            }
            else{
                int a;
                int b;
               while (true){
                try{

                    System.out.println("Ahora dame el primer numero: ");
                    a = sc.nextInt();
                    break;
                } catch(InputMismatchException e){
                    System.out.println("Entrada inválida, por favor introduce un número válido.");
                    sc.next();
                }
               }
               while (true){
                try{
                    System.out.println("Ahora dame el segundo numero: ");
                    b = sc.nextInt();
                    
                    break;
                } catch(InputMismatchException e){
                    System.out.println("Entrada inválida, por favor introduce un número válido.");
                    sc.next();
                }
               }    
               switch (simbol) {
                case '1':
                    System.out.println("El resultado es: "+Calculadora.suma(a,b));
                    break;
                case '2':
                   System.out.println("El resultado es: "+Calculadora.resta(a,b));
                    break;
                case '3':
                    System.out.println("El resultado es: "+Calculadora.mult(a,b));
                    break;
                case '4':
                    System.out.println("El resultado es: "+Calculadora.div(a,b));
                    break;
                
                default:
                    System.out.println("Operación no valida !BIP!");
                    break;
               }
            }
        }
        sc.close();
    }
}
