

package Usuario; 

import java.util.Scanner;

public class PedirNombre {

    public static String Pedir_Nombre(Scanner sc){

        System.out.println("Oye,¿Que cual es tu nombre? ");

        return sc.nextLine();
    }
}