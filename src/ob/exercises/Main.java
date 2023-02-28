package ob.exercises;

import java.util.Scanner;
/**
 *
 * @author Bran
 */

class Coche{
    public int doors;
   
    public void addDoors(){
        this.doors++;
    }

}

public class Main {
    
    public static int tripleSuma(int a, int b, int c){
        return a + b + c;
    }
    
/*Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.*/
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Primera parte: ");
        System.out.println("---Triple Suma---\nIngrese los tres numeros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        
        System.out.println("La triple suma es: " + 
                tripleSuma(num1, num2, num3));
        
        
        System.out.println("\nSegunda parte: ");
        
        Coche miCoche = new Coche();
        miCoche.addDoors();
        
        System.out.println("La cantidad de puertas que tiene miCoche = "
                + miCoche.doors);
    }
    
}
