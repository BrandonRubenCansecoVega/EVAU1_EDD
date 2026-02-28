/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_potencias;

/**
 *
 * @author brcv1
 */
public class EVA1_20_POTENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("2 elevado a la 5 = " +  potencia(2,5));
    }
    public static int potencia(int base,int exp){
        if(exp == 1)
            return base;
        else
            return base * potencia(base, exp - 1);
    }
}
