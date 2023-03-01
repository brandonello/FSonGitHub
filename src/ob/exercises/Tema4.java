/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ob.exercises;

import java.util.Scanner;

public class Tema4 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        
        System.out.println("--IF-- \nEnter a number: ");
        int numeroIf = scan.nextInt();
        
        if (numeroIf == 0){
            System.out.println("The number is zero.");
        }else if(numeroIf > 0){
                System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }

        System.out.println("\n--WHILE--\n");
        int numeroWhile = 0;
     
        while(numeroWhile < 3){
            System.out.println("numeroWhile = " + numeroWhile++);
        }
    
        System.out.println("\n--DO WHILE--\n");
        do{
            System.out.println("numeroWhile = " + numeroWhile++);
            
        } while(numeroWhile < 3);
     
        System.out.println("\n--FOR--\n");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("numeroFor = " + numeroFor);
        }
        
        
        
        System.out.println("\n--SWITCH--\nEnter a season: ");
        scan.nextLine();
        String estacion = scan.nextLine();
   
        switch(estacion.toLowerCase()){
            case "spring":
                System.out.println("You entered Spring");
                break;
            case "summer":
                System.out.println("You entered Summer");
                break;
            case "fall": 
            case "autumn":
                System.out.println("You entered Fall");
                break;
            case "winter":
                System.out.println("You entered Winter");
                break;
            default:
                System.out.println("Something went wrong...");
                
        }  
        
    }     
    
}
