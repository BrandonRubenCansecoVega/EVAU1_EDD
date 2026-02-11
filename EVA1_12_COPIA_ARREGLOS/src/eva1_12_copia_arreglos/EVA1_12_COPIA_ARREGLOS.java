/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_arreglos;

/**
 *
 * @author brcv1
 */
public class EVA1_12_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = new Ejemplo[2];
        System.out.println(arreglo);
        //arreglo --> nos permite acceder al arreglo
        //creamos cada objeto en las posiciones del arreglo
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        //Imprimimos las direcciones
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        
        //Ejemplo[] copia = arreglo;//NO FUNCIONA, creo un duplicado de la direccion 
        Ejemplo[] copia = new Ejemplo[2];//DEBO CREAR UN NUEVO ARREGLO
        System.out.println("copia=" + copia);
        //posicion por posición copiar de un arreglo a otro:
        //ESTO NO SIRVE TAMPOCO
        //copia[0] = arreglo[0]; // no duplico el objeto, duplique la direccion
        //copia[1] = arreglo[1];
        ////CREAR UN "BACKUP" DE UN OBJETO IMPLICA "CREAR" 
        //
        copia[0] = new Ejemplo();
        copia[1] = new Ejemplo();
        System.out.println("copia[0]=" + copia[0]);
        System.out.println("copia[1]=" + copia[1]);
        //Ahora si, hay que ransferir la info de un objeto a otro (siempre y cuando
        //es info no sean objetos tambien)
        copia[0].val = arreglo[0].val;
        copia[1].val = arreglo[1].val;
        
    }
    
}
class Ejemplo{
    int val = 5;
}
