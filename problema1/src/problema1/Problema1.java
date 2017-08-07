/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author FREDY CASTRO
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {{
        // TODO code application logic here
       
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduzca la cantidad de casos de prueba: ");
		int cantidad = reader.nextInt();
		int arreglo[]=new int[cantidad];
		int j=1;
		for(int i=0;i<cantidad;i++) {
			System.out.print("Valor "+j+++" : ");
			arreglo[i]=reader.nextInt();	
		}
		
		j=1;
		System.out.println("Resultado");
		for(int i=0;i<cantidad;i++) {
			System.out.println("Valor "+j+++" : "+Integer.bitCount(arreglo[i]));	
		}
	
    }
    
        // TODO code application logic here
    }
    
}
