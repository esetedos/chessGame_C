
public class Pieces {
	//atributes
		public String type; //letra de pieza en base al tipo (T: torre, P: peón, A: alfil, R: rey, C: caballo, D: dama)
		public int number; //pieza 2 o pieza 1, etc (si solo hay 1 pieza, default 0)
		public String team; //blaca W, negra B
		public Boolean alive; //si esta en el tablero (1) o no(0)
		
		//constructores
		public Pieces(){
			type = null;
			number = 0;
			team = "W";
			alive = true;
		}
		
		public Pieces(String type, int number, String team){
			this.type = type;
			this.number = number;
			this.team = team;	
		}
		
	//métodos
		
		public void killPiece(){
			this.alive = false;
		}
		
		public void beQueen() { //solo para peones que lleguen hasta arriba
			this.type = "D";
		}
		
}
