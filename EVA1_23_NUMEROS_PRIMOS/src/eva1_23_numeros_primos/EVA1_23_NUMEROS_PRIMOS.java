/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_numeros_primos;

import static java.lang.Math.sqrt;

/**
 *
 * @author brcv1
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿EL numero 5 no es primo con la forma no eficiente? " + esPrimoNoEficiente(5));
        System.out.println("¿El numero 5 no es primo con la forma eficiente? " + esPrimoEficiente(5));
    }
    public static boolean esPrimoNoEficiente(int num){
    boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if((num % i) == 0){
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
}
    public static boolean esPrimoEficiente(int num){
    boolean esPrimo = true;
        for (int i = 2; i < sqrt(num); i++) {
           if((num % i) == 0){
               esPrimo = false;
               break;
           } 
        }
        return esPrimo;
}
}
