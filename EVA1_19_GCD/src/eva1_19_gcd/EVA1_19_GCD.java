/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_gcd;

public class EVA1_19_GCD {

    public static void main(String[] args) {
        System.out.println("Maximo común divisor de 180 y 48 es: " + gcd(180,48));
    }
    
    public static int gcd(int val1, int val2){
        // Caso base: cuando el residuo es 0
        if (val2 == 0){
            return val1;
        }
        
        // Llamada recursiva usando el residuo
        return gcd(val2, val1 % val2);
    }
}