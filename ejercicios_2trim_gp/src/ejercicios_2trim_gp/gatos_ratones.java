package ejercicios_2trim_gp;
import java.util.Scanner;


public class gatos_ratones {
		static Scanner sc = new Scanner(System.in);
		
		public static void main(String[] args) {
		

/**
 * 
 * hemos creado una clase para resolver el siguiente problema 
 * tenemos  20 gatos y 3500 ratones.
 * Cada gato se come cada día un ratón. Siempre que haya ratones para comer, los gatos se reproducen cada 200 días (si había 20 gatos, entonces pasa a haber 80 gatos).
 * Los ratones por su parte, siempre que queden ratones con vida, se reproducen cada 100 días (si había 1000 ratones pasa a haber 2000).
 * el funcionamiento de nuestro programa es ir calculando los gatos
 *  al reproducirse y los ratones que han sido comidos por lso gatos teniendo en
 * cuenta que lso ratones se reproducen e ir calculando cuantos gatos hay hasta que dejen de haber ratones.
 	* @author: Paul Foulquier, Miguel Angel Cantó,Jaula Ghourbal
 	* @version: 0.1
 * 
 * 
 * 
 */
		/*
		 * Iniciamos los valores que ya conocemos indicando su tipo de datos.
		 */
			
			
		/** cantidad de gatos 	
		 */
			
			int gatos= 20;
			
			
			/** cantidad de ratones	
			 */
			int ratones=3500;
			/** cantidad de dias para inicializar
			 */
			int dias=0;
			/*
			 * inicializamos un bucle while para implementar el algoritmo teniendo en cuenta las condiciones que nos estipula el enunciado 
			 * incrementa 100 dias por cada ejecucion del bucle y se resta la cantidad de gatos existentes a los ratones existentes en ese momento 
			 * y por cada 200 dias se cuadruplican.
			 */
			while(ratones != 0 || ratones < 0) 
			{
							
						dias=dias + 100;
						ratones=ratones-gatos;
						
						System.out.println("El dia "+ dias + " hay " + ratones +" ratones y "+ gatos + " gatos");
						System.out.println();
					
					
						if(dias%200==0) 
							{
							gatos = gatos * 4;
							}
						if(dias%100==0) 
							{
							ratones = ratones * 2;
							}
			}
		
			/**
			 * Imprimira la cantidad de gatos y ratones que se han ido reproduciendo y los ratones que han sido usados 
			 * para alimentar a los gatos hasta que dejen de haber ratone.
			 */
			
			
					
			System.out.println("No hay mas ratones..");
			
	     
	     
	     }
	}

