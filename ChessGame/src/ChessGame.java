import java.util.Scanner;

public class ChessGame {
	//atributes
	public int dia;
	public int mes;
	public int año;
	public String idioma;
	public int turno;

	
	//constructores
	public ChessGame(){
		dia = 1;
		mes = 1;
		año = 1;
		idioma = "Castellano";
		turno = 0;
	}
	
	public ChessGame(int dia, int mes, int año, String idioma){
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.idioma = idioma;	
	}
	
//métodos
	public static String whichTurn(int turn) {
		if(turn == 0)
			return "las fichas blancas";
		else
			return "las fichas negras";
	}
	
	
	
//fin de métodos
	public static void main(String[] args) {
		Pieces[][] casillas = new Pieces[8][8];
		
//		   0  1  2  3  4  5  6  7 //primer argumento
//		0  o  x  o  x  o  x  o  x
//		1  x  o  x  o  x  o  x  o
//		2  o  x  o  x  o  x  o  x
//		3  x  o  x  o  x  o  x  o
//		4  o  x  o  x  o  x  o  x
//		5  x  o  x  o  x  o  x  o
//		6  o  x  o  x  o  x  o  x
//		7  x  o  x  o  x  o  x  o
		//segundo argumento
		
	//Colocación de piezas ------------------------------------------------------------------------------------
		//peones
		for(int i = 0; i < 8; i++) {
			casillas[i][0] = new Pieces("P", i, "B");
			casillas[i][7] = new Pieces("P", i, "W");
		}
		
		//torres izquierdas
		casillas[0][1] = new Pieces("T", 0, "B");
		casillas[0][6] = new Pieces("T", 0, "W");
		
		//torres derechas
		casillas[7][1] = new Pieces("T", 1, "B");
		casillas[7][6] = new Pieces("T", 1, "W");
		
		//caballos iz
		casillas[1][1] = new Pieces("C", 0, "B");
		casillas[1][6] = new Pieces("C", 0, "W");
		
		//caballos de
		casillas[6][1] = new Pieces("C", 1, "B");
		casillas[6][6] = new Pieces("C", 1, "W");
		
		//alfiles iz
		casillas[2][1] = new Pieces("A", 0, "B");
		casillas[2][6] = new Pieces("A", 0, "W");
		
		//alfiles de
		casillas[5][1] = new Pieces("A", 1, "B");
		casillas[5][6] = new Pieces("A", 1, "W");
		
		//Reina (dama)
		casillas[3][1] = new Pieces("D", 0, "B");
		casillas[3][6] = new Pieces("D", 0, "W");
		
		//Rey
		casillas[4][1] = new Pieces("R", 0, "B");
		casillas[4][6] = new Pieces("R", 0, "W");
		
		int turn = 0;
		String pieza = ""; 
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			//mostrar tablero -------------------------------------------------------------------------------------------
			 for (int i = 0; i < casillas.length; i++) {
		            for (int j = 0; j < casillas[i].length; j++) {
		                if (casillas[j][i] == null) {
		                	if((i+1)%2 == (j+1)%2)
		                		System.out.print("[   ] ");
		                	else
		                		System.out.print("[xxx] ");
		                } else {
		                	if(casillas[j][i].type == "D" || casillas[j][i].type == "R") {
			                    System.out.print("[" + casillas[j][i].team + casillas[j][i].type + " ] ");
		                	}
		                	else {
		                		int number = casillas[j][i].number+1;
			                    System.out.print("[" + casillas[j][i].team + casillas[j][i].type + number + "] ");
		                	}
		                }  
		            }
//		            System.out.println();
		            System.out.println();
		        }
			System.out.println();
			 
			System.out.println("Es el turno de " + whichTurn(turn));
			System.out.println("¿Que pieza quieres mover? (Ingresa la primera letra del nombre en español)");
			pieza=sc1.nextLine();
			pieza = pieza.toUpperCase();
			
			while(!pieza.equals("T") &&
				       !pieza.equals("P") &&
				       !pieza.equals("A") &&
				       !pieza.equals("R") &&
				       !pieza.equals("C") &&
				       !pieza.equals("D")) {
				System.out.println("Lo siento, esa letra no coincide con laletra inicial de ninguna pieza.");
				System.out.println("¿Que pieza quieres mover? (Ingresa la primera letra del nombre en español)");
				pieza=sc1.nextLine();
				pieza = pieza.toUpperCase();
			}
			
			//escoge qué pieza (en caso deposeer más de una en el tablero)
			if(!pieza.equals("D") && !pieza.equals("R")) {
				//cmirar como saber si las piezas del type metido estan alive o no
				System.out.println("¿Cuál quieres mover? (ingresa el número)");
			}
			
			
			
			
			 
			
			
			//cambio de turno
			if(turn == 0) 
				turn = 1;
			else
				turn = 0;
		}
		
		
		
		
	
	
		
		
		
		
		
		
//		// TODO Auto-generated method stub
//		Scanner sc1 = new Scanner(System.in);
//		int dia, mes, año, number=0, emaitzaInt;
//		String idioma="", emaitza;
//		boolean exit=true, emaitzaB;
//		
//		
//		//primero recoger los valores para crear el objeto fecha
//		
//		System.out.println("Escribe el día");
//		dia=sc1.nextInt();
//		System.out.println("Escribe el mes");
//		mes=sc1.nextInt();
//		System.out.println("Escribe el año");
//		año=sc1.nextInt();
//
//	
//		
//		
//		//crear la fecha
//		ClaseFecha fecha = new ClaseFecha(dia, mes, año, idioma);
//		
//		
//		while(exit) {
//			System.out.println("Escribe lo que quieras hacer");
//			number=sc1.nextInt();
//			
//		}
	}

}
