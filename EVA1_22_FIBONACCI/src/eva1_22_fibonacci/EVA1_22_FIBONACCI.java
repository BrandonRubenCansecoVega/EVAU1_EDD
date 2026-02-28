/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_fibonacci;

/**
 *
 * @author brcv1
 */
public class EVA1_22_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("en la posicion 5 esta " + fibonacci(5));
           
    }
    public static int fibonacci(int pos){
      if(pos != 1)                          
        return pos + fibonacci(pos - (pos - 1));
        else 
        return pos;
    }
}
