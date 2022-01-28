package ejercicios_2trim_gp;
	import java.util.Arrays;
	import java.util.Scanner;
public class granja_2trim {
	

/**
		 * Este programa sera capaz de almacenar los nombres de un listado de patos, corderos, conejos y perros.
		 * Presentando una interfaz al usuario para poder gestionar su granja.
		 * @version 1.0
		 * @author Paul Edouard Foulquier, Miguel Angel Cantó, Jaula Ghourbal 
		 */
		

		static String [] patos = new String[0];
		static String [] corderos = new String[0];
		static String [] conejos = new String[0];
		static String [] perros = new String[0];

		
		static Scanner sc = new Scanner(System.in);
		
		/** 
		 * @param muestraPatos() creamos un una funcion para mostrar patos
		 */
		
		private static void muestraPato() {
			
			if(patos.length==0) {
				
				System.out.println("No ha introducido patos");
				patos();
			}else {
			
			System.out.println("patos:");
			for(String str: patos)   
			{  
			System.out.println("-"+str);  
			
			}  
			System.out.println();
		}
			
			patos();
			
		}
		/** 
		 * @param muestraPerros() creamos un una funcion para añadir perro
		 */
		
		
		private static void muestraPerro() {
			
			if(perros.length==0) {
				
				System.out.println("No ha introducido perros");
				perros();
			}else {
			
			System.out.println("perros:");
			for(String str: perros)   
			{  
			System.out.println("-"+str);  
			
			}  
			System.out.println();
		}
		}	
		/** 
		 * @param anyadirPerros() creamos un una funcion para añadir perros
		 */
		
		
		private static void anyadirPerros() {
			
			System.out.println("cuantos perros desea añadir");
			int perrosNuevos=sc.nextInt();
			int perrosConteo=0;
			if(perros.length==0) {
				
				
				perros=new String[perrosNuevos];
				sc.nextLine();
				for(int i=0;i<perros.length;i++) {
					
					
					
					
					System.out.println("indique el nombre del perro" +i);
					perros [i]=sc.nextLine();
					System.out.println();
					perrosConteo ++;
				}
				perros();
				
				
			}else {
				
				
				int numPerrosnuevos=perrosNuevos;
				perros=Arrays.copyOf(perros,perros.length + numPerrosnuevos);
				sc.nextLine();
				for(int i=0;i<perros.length;i++) {
					
					
					if(i>perrosConteo) {
					
					System.out.println("indique el nombre del perro" +i);
					perros [i]=sc.nextLine();
					System.out.println();
					
					}
				
			}
			
		
			
			}
			
			perros();
			
			
			
			
		};	/** 
		 * @param perro()creamos un submeno para añadir y mostrar perro
		 */
		private static void perros() {
	    	int opcion;
			
	    	
			
			System.out.println("PERROS");
			System.out.println("-------");
			System.out.println("1-Añadir perros");
			System.out.println("2-Mostrar perros");
			System.out.println("3-Salir..");
			
			opcion=sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				
				anyadirPerros();
				
				break;
			case 2:
				
				muestraPerro();
				
				break;
			case 3:
				
				menu();
				
				break;
		

			default:
				
				System.out.println("valor introducido incorrecto");
				patos();
				break;
			}
			
	    	
	    	
	    	
	    	
	    };
	    /** 
		 * @param muestraConejo() funcion para mostrar conejos. 
		 */
		private static void muestraConejo() {
			
			if(conejos.length==0) {
				
				System.out.println("No ha introducido patos");
				conejos();
			}else {
			
			System.out.println("conejos:");
			for(String str: conejos)   
			{  
			System.out.println("-"+str);  
			
			}  
			System.out.println();
		}
		}	
		
		 /** 
		 * @param anyadirConejos() funcion para añadir conejos. 
		 */
	
		private static void anyadirConejos() {
			
			System.out.println("cuantos conejos desea añadir");
			int conejosNuevos=sc.nextInt();
			int conejoConteo=0;
			if(conejos.length==0) {
				
				
				conejos=new String[conejosNuevos];
				sc.nextLine();
				for(int i=0;i<conejos.length;i++) {
					
					
					
					
					System.out.println("indique el nombre del conejo" +i);
					conejos [i]=sc.nextLine();
					System.out.println();
					conejoConteo ++;
				}
				conejos();
				
				
			}else {
				
				
				int numConejosnuevos=conejosNuevos;
				conejos=Arrays.copyOf(conejos,conejos.length + numConejosnuevos);
				sc.nextLine();
				for(int i=0;i<conejos.length;i++) {
					
					
					if(i>conejoConteo) {
					
					System.out.println("indique el nombre del conejo" +i);
					conejos [i]=sc.nextLine();
					System.out.println();
					
					}
				
			}
			
		
			
			}
			
			conejos();
			
			
			
			
		};
		/** 
		 * @param conejos()creamos un submeno para añadir y mostrar conejos
		 */
		
		private static void conejos() {
		    	int opcion;
				
		    	
				
				System.out.println("CONEJOS");
				System.out.println("-------");
				System.out.println("1-Añadir conejos");
				System.out.println("2-Mostrar conejos");
				System.out.println("3-Salir..");
				
				opcion=sc.nextInt();
				
				
				switch (opcion) {
				case 1:
					
					anyadirConejos();
					
					break;
				case 2:
					
					muestraConejo();
					
					break;
				case 3:
					
					menu();
					
					break;
			

				default:
					
					System.out.println("valor introducido incorrecto");
					patos();
					break;
				}
				
		    	
		    	
		    	
		    	
		    };
		    
			/** 
			 * @param Menu() en este parametro creamos un menu que sea amigable con el cliente 
			 */
		private static void menu() {
			
			
	int opcion;
			
			do {
				
				System.out.println("Bienvenido a la granja");
				System.out.println("1-patos");
				System.out.println("2-corderos");
				System.out.println("3-conejos");
				System.out.println("4-perros");
				System.out.println("5-salir");
				opcion=sc.nextInt();
				
				
				switch (opcion) {
				case 1:
					
					patos();
					
					break;
				case 2:
					
					corderos();
					
					break;
				case 3:
					
					conejos();
					
					break;
				case 4:
					
					perros();
					
					break;
				case 5:
					
					System.out.println("Saliendo...");
					
					break;

				default:
					
					System.out.println("valor introducido incorrecto");
					menu();
					break;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			}while(opcion!=5);
			
			
			
		}
		/** 
		 * @param anyadirPato() creamos un una funcion para añadir patos
		 */
		
		
	 	private static void anyadirPato() {
			
			System.out.println("cuantos patos desea añadir");
			int patosNuevos=sc.nextInt();
			int patosConteo=0;
			if(patos.length==0) {
				
				
				patos=new String[patosNuevos];
				sc.nextLine();
				for(int i=0;i<patos.length;i++) {
					
					
					
					
					System.out.println("indique el nombre del pato" +i);
					patos [i]=sc.nextLine();
					System.out.println();
					patosConteo ++;
				}
				patos();
				
				
			}else {
				
				
				int numPatosnuevos=patosNuevos;
				patos=Arrays.copyOf(patos,patos.length + numPatosnuevos);
				sc.nextLine();
				for(int i=0;i<patos.length;i++) {
					
					
					if(i>patosConteo) {
					
					System.out.println("indique el nombre del pato" +i);
					patos [i]=sc.nextLine();
					System.out.println();
					
					}
				
			}
			
		
			
			}
			
			patos();
			
			
			
			
		};
		/** 
		 * @param patos() creamos un submeno para añadir y mostrar patos
		 *
		 */
		private static void patos() {
			
				int opcion;
			
		
				
				System.out.println("PATOS");
				System.out.println("-------");
				System.out.println("1-Añadir patos");
				System.out.println("2-Mostrar patos");
				System.out.println("3-Salir..");
				
				opcion=sc.nextInt();
				
				
				switch (opcion) {
				case 1:
					
					anyadirPato();
					
					break;
				case 2:
					
					muestraPato();
					
					break;
				case 3:
					
					menu();
					
					break;
			

				default:
					
					System.out.println("valor introducido incorrecto");
					patos();
					break;
				}
				
			
			
		}
		/** 
		 * @param corderos() creamos un submeno para añadir y mostrar corderos
		 *
		 */
		private static void corderos() {
			int opcion;
			
		
			
			System.out.println("CORDEROS");
			System.out.println("--------");
			System.out.println("1-Añadir corderos");
			System.out.println("2-Mostrar corderos");
			System.out.println("3-Salir..");
			
			opcion=sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				
				anyadirCordero();
				
				break;
			case 2:
				
				muestraCordero();
				
				break;
			case 3:
				
				System.out.println("Saliendo al menu principal");
				System.out.println();
				menu();
				
				
				break;
		

			default:
				
				System.out.println("Valor introducido incorrecto");
				corderos();
				break;
				
				
			}
			
		
			
			
		}
		/** 
		 * @param anyadirCordero() creamos un una funcion para añadir cordero
		 */
		
		private static void anyadirCordero() {

			
			System.out.println("cuantos corderos desea añadir");
			int corderosNuevos=sc.nextInt();
			int corderosConteo=0;
			if(corderos.length==0) {
				
				
				corderos=new String[corderosNuevos];
				sc.nextLine();
				for(int i=0;i<corderos.length;i++) {
					
					
					
					
					System.out.println("indique el nombre del cordero" +i+1);
					corderos [i]=sc.nextLine();
					System.out.println();
					corderosConteo ++;
				}
				corderos();
				
				
			}else {
				
				
				int numCorderosnuevos=corderosNuevos;
				corderos=Arrays.copyOf(corderos,corderos.length + numCorderosnuevos);
				sc.nextLine();
				for(int i=0;i<patos.length;i++) {
					
					
					if(i>corderosConteo) {
					
					System.out.println("indique el nombre del cordero" +i+1);
					corderos [i]=sc.nextLine();
					System.out.println();
					
					}
				
			}
			
		
			
			}
			
			corderos();
			
			
			
			
		};
		/** 
		 * @param muestraCordero() creamos un una funcion para mostrar corderos
		 */
		
		private static void muestraCordero() {
	 
			if(corderos.length==0) {
				
				System.out.println("no ha introducido corderos");
				corderos();
			}else {
			
			System.out.println("Corderos:");
			for(String str: corderos)   
			{  
			System.out.println("-"+str);  
			
			}  
			System.out.println();
		}
		}

		/** 
		 * @param args main que invoca menu principal
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub


			menu();
			}
}


		
		
		
		
		
		
		
		