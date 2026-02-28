/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_califas;

import java.util.Scanner;

/**
 *
 * @author brcv1
 */
public class EVA1_16_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] grupos;//NO SE CUANTOS GRUPOS SON, LO INDICA EL USUARIO
        
        System.out.println("¿Cuantos grupos tiene la escuela?");
        int cant = input.nextInt();
        input.nextLine();
        grupos = new int[cant][];
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("¿Cuantos estudiantes tiene el grupo " + (i + 1) + "?");
            int estudiantes = input.nextInt();
            input.nextLine();
            grupos[i] = new int[estudiantes];
        }
        //captura calificaciones
        for (int i = 0; i < grupos.length; i++) {
            System.out.println("+++++++GRUPO " + (i + 1) + "++++++++++");
            for (int j = 0; j < grupos.length; j++) {
                System.out.println("Calificación del estudiante " + (j + 1) + ":");
                int califa = input.nextInt();
                grupos[i][j] = califa;
                input.nextLine();
            }
        }
        //IMPRIMIR CALIFICACIONES
        //CALCULEN EL PROMEDIO POR GRUPO
        
        for (int i = 0; i < califa.length; i++) {
            System.out.println("+++++GRUPO " + (i + 1) + "+++++++");
            for (int j = 0; j < califa.length; j++) {
                System.out.println("Lista de calificaciónes " + califa.length );
                
            }
        }
    }
    
}
