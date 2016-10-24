/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NumerosPrimos {

    //Devuelve true si es primo, false si no lo es
    public static boolean CompruebaPrimo(int num){
        boolean primo = true;
        
        for(int i=2; i<num; i++){
            if ( (num % i)==0 ) {
                primo = false;
                i=num+1;
            }
            
            
        }
        
        return primo;
    }
    
    public static int SiguientePrimo(int num){
        int primo = 0;
        boolean bandera = true;
        
        for(int i = (num+1); bandera == true; i++){
            if (CompruebaPrimo(i)){
                bandera= false;
                primo = i;
            }
        }
        return primo;
    }
    
    public static void main(String[] args) {
      
       boolean bandera = true;
       int num = 0;
       Scanner leer = new Scanner(System.in);
       
       while (bandera){
           System.out.println("Dime un numero por teclado para comprobar si es primo");
            num = leer.nextInt();
            
            if (CompruebaPrimo(num)){
                System.out.println("El numero " + num + " es primo" );
                System.out.println("El siguiente primo es " + SiguientePrimo(num) );
            }else{
                System.out.println("El numero " + num + " no es primo" );
                System.out.println("El siguiente primo es " + SiguientePrimo(num) );
                    }
            
            if (num == 0){
                bandera= false;
                        
            }
       
       }
       
       
        
        
    }
    
}
