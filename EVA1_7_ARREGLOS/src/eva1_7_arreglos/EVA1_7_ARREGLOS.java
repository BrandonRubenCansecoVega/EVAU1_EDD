/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos;

/**
 *
 * @author brcv1
 */
public class EVA1_7_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //string[] cade1,cade2,cade3 --
        int[] datos  = new int [10]; //40 bytes 
        //MANEJO DE INDICES
        System.out.println(datos);
        datos[0] = 100;
        datos[1] = 200;
        datos[2] = 300;
        datos[9] = 1000;
        //datos[10] = 1100;//posición 10 no existe (la ultima es 9)
        System.out.println("Valor en posición 0 = " + datos[0]);
        
    }
    
}
