package generation;

import java.util.Scanner;

public class Codigo6 { //Las clases van en mayuscula
		  
	    int[] n = new int[20]; //faltaba inicializarlo

	    for (int i = 0; i < 20; i++) { //faltaba el + al final
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //faltaba el out
	    }
	    
	    Scanner scanner = new Scanner(System.in); //faltaba scanner
	    System.out.printl("\n¿Qué números quiere resaltar? ");
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine();

	    int multiplo = (opcion == 1) ? 5 : 7; // Estaba mal el operador ternario

	    foreach (char e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	       else {
	        System.in.print(e + " ");
	      }
	    }
	  
	}