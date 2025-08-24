

package Usuario;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Pedir nombre
        String nombre = PedirNombre.Pedir_Nombre(sc);

        //Resolución de pedir nombre
        System.out.println("Ya veo, así que tu eres "+ nombre);

        //Pedir edad
        int edad = PedirEdad.Pedir_Edad(sc);

        //Resolución de pedir edad
        System.out.println("Bienvenido "+ nombre +" tienes "+ edad +" años.");

        HolaMundo.main();
        sc.close();
    }
}