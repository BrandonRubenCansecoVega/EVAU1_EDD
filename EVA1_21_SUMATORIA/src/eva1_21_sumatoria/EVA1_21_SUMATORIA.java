/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_sumatoria;

/**
 *
 * @author brcv1
 */
public class EVA1_21_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("la sumatoria de 5 es " + sumatoria(5));
    }
    public static int sumatoria(int num){
      if(num != 1)  
        return num + sumatoria(num - 1);
        else 
          return num;
    }
}
