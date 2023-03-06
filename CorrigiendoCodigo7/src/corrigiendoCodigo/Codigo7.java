package corrigiendoCodigo;
import java.util.HashMap;// se importo el HashMap
import java.util.Scanner;// se importo scanner


public class Codigo7 {

		
		public static void main(String[] args) {//Faltaba la clase main
		
		Scanner s = new Scanner(System.in);//faltaba el System.in

	    HashMap<String, String> capitales = new HashMap<>();//era capitales la lista ademas de el tipo de dato

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador");//Faltaba la caiptal
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";// estaba mal escrito String

	    do {//el Print de la siguiente linea estaba mal
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      c = s.nextLine();
	      
	      if (!c.equals("salir")) {// estaba escrito mal equals
	        if (capitales.containsKey(c)) {//no era value 
	          System.out.println("La capital de " + c);//faltaba out
	          System.out.println(" es " + capitales.get(c));// se uso get
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));// faltaba un parentesis y el while estaba mal escrito
	    
	  }
	}

