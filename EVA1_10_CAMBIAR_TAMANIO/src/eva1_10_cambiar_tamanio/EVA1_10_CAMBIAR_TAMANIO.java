/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_cambiar_tamanio;

/**
 *
 * @author brcv1
 */
public class EVA1_10_CAMBIAR_TAMANIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] datos = new int[6];
          for (int i = 0; i < datos.length; i++) {
          datos[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println("{" + datos[i] + "}"); 
        }
        System.out.println("");
        System.out.println("----copiamos los 3 primeros----");
       int [] copia = new int [3];
        for (int i = 0; i < copia.length; i++) {
          copia[i] = datos[i];
        }
        for (int i = 0; i < copia.length; i++) {
            System.out.println("{" + copia[i] + "}"); 
        }
        System.out.println("");

        System.out.println("---------en un solo arreglo haremos la separacion----------");
         int[] uno = new int[5];
          for (int i = 0; i < uno.length; i++) {
          uno[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < uno.length; i++) {
            System.out.println("{" + uno[i] + "}"); 
        }
        System.out.println("");
        System.out.println("primeros 3 datos");
        for (int i = 2; i < uno.length; i++ ){
            System.out.println("{" + uno[i] + "}");
        }
        
    }
    
    
}
