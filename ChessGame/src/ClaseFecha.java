import java.util.Scanner;

public class ClaseFecha {
	//atributes
	public int dia;
	public int mes;
	public int año;
	public String idioma;
	
	//constructores
	public ClaseFecha(){
		dia = 1;
		mes = 1;
		año = 1;
		idioma = "Castellano";
	}
	
	public ClaseFecha(int dia, int mes, int año, String idioma){
		this.dia = dia;
		this.mes = mes;
		this.año = año;
		this.idioma = idioma;	
	}
	
//métodos
	
	//métodos de los formatos de las fechas	
	public String fechaIdatzi(int dia, int mes, int año, String idioma){
		String emaitza;
		switch(idioma) {
			case "Castellano":
				emaitza = dia + " de" + hilabeteIzenaLortu(mes, idioma) + " del " + año;
				break;
			case "Euskera":
				emaitza = año + " " + hilabeteIzenaLortu(mes, idioma) + " " + dia;
				break;
			case "English":
				emaitza = hilabeteIzenaLortu(mes, idioma) + " " + dia + ", " + año;
				break;
			default:
				emaitza = "no";
		}
		return emaitza;
	}
	
	public String fechaElektronikoa(int dia, int mes, int año, String idioma) {
		String emaitza;
		switch(idioma) {
		case "Castellano":
			emaitza = dia + "-" + mes + "-" + año;
			break;
		case "Euskera":
			emaitza = año + "-" + mes + "-" + dia;
			break;
		case "English":
			emaitza = mes + "-" + dia + "-" + año;
			break;
		default:
			emaitza = "no";
	}
		
		return emaitza;
	}
	
	public String fechaEgutegia(int dia, int mes, int año, String idioma) {
		String emaitza;
		switch(idioma) {
		case "Castellano":
			emaitza = dia + "/" + mes + "/" + año;
			break;
		case "Euskera":
			emaitza = año + "/" + mes + "/" + dia;
			break;
		case "English":
			emaitza = mes + "/" + dia + "/" + año;
			break;
		default:
			emaitza = "no";
	}
		
		return emaitza;
	}
	
	
	//resto de métodos
	public int hiruhilekoKalkulatu(int mes) {
		int emaitza = 0;
		switch(mes) {
			case 1, 2, 3:
				emaitza = 1;
				break;
			case 4, 5, 6:
				emaitza = 2;
				break;
			case 7, 8, 9:
				emaitza = 3;
				break;
			case 10, 11, 12:
				emaitza = 4;
				break;
		}
		return emaitza;
	}
	
	public int lauhilekoKalkulatu(int mes) {
		int emaitza = 0;
		switch(mes) {
			case 1, 2, 3, 4:
				emaitza = 1;
				break;
			case 5, 6, 7, 8:
				emaitza = 2;
				break;
			case 9, 10, 11, 12:
				emaitza = 3;
				break;
		}
		return emaitza;
	}
	
	public int seihilekoKalkulatu(int mes) {
		int emaitza = 0;
		switch(mes) {
			case 1, 2, 3, 4, 5, 6:
				emaitza = 1;
				break;
			case 7, 8, 9, 10, 11, 12:
				emaitza = 2;
				break;
		}
		return emaitza;
	}
	
	public static String hilabeteIzenaLortu(int mes, String idioma) {
		String emaitza = null; //me pide que ponga lo de null q si no da error, ns
		switch(mes) {
			case 1:
				if(idioma == "Castellano") emaitza = "Enero";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 2:
				if(idioma == "Castellano") emaitza = "Febrero";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 3:
				if(idioma == "Castellano") emaitza = "Marzo";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 4:
				if(idioma == "Castellano") emaitza = "Abril";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 5:
				if(idioma == "Castellano") emaitza = "Mayo";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 6:
				if(idioma == "Castellano") emaitza = "Junio";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 7:
				if(idioma == "Castellano") emaitza = "Julio";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 8:
				if(idioma == "Castellano") emaitza = "Agosto";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 9:
				if(idioma == "Castellano") emaitza = "Septiembre";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 10:
				if(idioma == "Castellano") emaitza = "Octubre";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 11:
				if(idioma == "Castellano") emaitza = "Noviembre";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			case 12:
				if(idioma == "Castellano") emaitza = "Diciembre";
				if(idioma == "Euskera") emaitza = "Enero";
				if(idioma == "English") emaitza = "Enero";
				break;
			default:
				emaitza = "no";
		}
		return emaitza;
	}

	public int hilEgunKopuruMax(int mes, int año) {
		int emaitza = 0;
		switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			emaitza = 31;
			break;
		case 4, 6, 9, 11:
			emaitza = 30;
			break;
		case 2:
			if(bisiestoDa(año)==true) emaitza = 29;
			else emaitza = 28;
		}
		return emaitza;
	}
	
public boolean bisiestoDa(int año) {
		boolean emaitza;
		if (año%4==0) emaitza = true;
		else emaitza = false;
		return emaitza;
	}
	
	public void egunaAldatu(int dia) {
		this.dia = dia;
	}
	public void hilabeteaAldatu(int mes) {
		this.mes = mes;
	}
	public void urteaAldatu(int año) {
		this.año = año;
	}
	
	public boolean dataEgokiaDa(int dia, int mes, int año) {
		boolean emaitza = true;
		if(mes>12 || hilEgunKopuruMax(mes, año)<dia) emaitza = false;
		return emaitza;
	}
	
	public boolean berdinakDira(ClaseFecha fecha1, int dia, int mes, int año) {
		boolean emaitza;
		if(fecha1.dia == dia && fecha1.mes == mes && fecha1.año == año) emaitza = true;
		else emaitza = false;
		return emaitza;
	}
	
	public String konparatu(ClaseFecha fecha1, int dia, int mes, int año) {
		String emaitza = "";
		if(fecha1.año>año) emaitza = fechaElektronikoa(fecha1.dia, fecha1.mes, fecha1.año, fecha1.idioma);
		else if(fecha1.año<año) emaitza = fechaElektronikoa(dia, mes, año, fecha1.idioma);
		else {
			if(fecha1.mes>mes) emaitza = fechaElektronikoa(fecha1.dia, fecha1.mes, fecha1.año, fecha1.idioma);
			else if(fecha1.mes<mes) emaitza = fechaElektronikoa(dia, mes, año, fecha1.idioma);

		}
		return emaitza;
	}
	
	public static void esleitu(ClaseFecha fecha1, int dia, int mes, int año) {
		fecha1.dia = dia;
		fecha1.mes = mes;
		fecha1.año = año;
	}
	
	public int urteHasietatikZenbatEgun(ClaseFecha fecha) {
		int emaitza = fecha.dia;
		for(int i = 1; i<fecha.mes; i++) {
			emaitza+=hilEgunKopuruMax(i, fecha.año);
		}
		return emaitza;
	}
	
	public int urteBukaerarainoZenbategun(ClaseFecha fecha) {
		int emaitza;
		if(bisiestoDa(fecha.año)) emaitza = 366;
		else emaitza = 365;
		emaitza -= urteHasietatikZenbatEgun(fecha);	
		return emaitza;
	}
	
	public int egunFaltaDira(ClaseFecha fecha1, ClaseFecha fecha2) {
		int emaitza;
		emaitza = urteHasietatikZenbatEgun(fecha2) - urteHasietatikZenbatEgun(fecha1);
		return emaitza;
	}
	
	//							la fecha de hoy			cumpleaños
	public int adinaKalkulatu(ClaseFecha fecha, int dia, int mes, int año) { //dia, mes, año del cumpleaños
		int emaitza;
		if(mes<fecha.mes || mes==fecha.mes && dia<fecha.dia) emaitza = año-fecha.año;
		else emaitza = año-fecha.año-1;
		return emaitza;
	}
	
	public String bihar(ClaseFecha fecha) {
		String emaitza;
		int dia=fecha.dia, mes=fecha.mes, año=fecha.año;
		
		if(fecha.dia+1>hilEgunKopuruMax(fecha.mes, fecha.año)) {
			dia=1;
			if(fecha.mes+1>12) {
				mes = 1;
				año++;
			}
			else mes++;
		}
		else dia++;
		emaitza=dia + "/" + mes + "/" + año;
		return emaitza;
	}
	
	public void hurrengoEguna(ClaseFecha fecha) {
		if(fecha.dia+1>hilEgunKopuruMax(fecha.mes, fecha.año)) {
			fecha.dia=1;
			if(fecha.mes+1>12) {
				fecha.mes=1;
				fecha.año++;
			}
			else fecha.mes++;
		}
		else fecha.dia++;
	}
	
	public String atzo(ClaseFecha fecha) {
		String emaitza;
		int dia=fecha.dia, mes=fecha.mes, año=fecha.año;
		
		if(dia-1<1) {
			dia=hilEgunKopuruMax(fecha.mes-1, fecha.año);
			if(fecha.mes-1<1) {
				mes=12;
				año--;
			}
			else mes--;
		}
		else dia--;
		emaitza=dia + "/" + mes + "/" + año;
		return emaitza;
	}
	
	public void atzokoEguna(ClaseFecha fecha) {
		if(fecha.dia-1<1) {
			fecha.dia=hilEgunKopuruMax(fecha.mes-1, fecha.año);
			if(fecha.mes-1<1) {
				fecha.mes=12;
				fecha.año--;
			}
			else fecha.mes--;
		}
		else fecha.dia--;
	}
	
	
	
	
	
	



//-----------------------------------------------

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc1 = new Scanner(System.in);
	int dia, mes, año, number=0, emaitzaInt;
	String idioma="", emaitza;
	boolean exit=true, emaitzaB;
	
	
	//primero recoger los valores para crear el objeto fecha
	
	System.out.println("Escribe el día");
	dia=sc1.nextInt();
	System.out.println("Escribe el mes");
	mes=sc1.nextInt();
	System.out.println("Escribe el año");
	año=sc1.nextInt();
	while(1>number || number>3) {
		System.out.println("Por último, escoge el idioma (1-Castellano, 2-Euskera, 3-English");
		number=sc1.nextInt();
	}
	switch(number) {
		case 1:
			idioma="Castellano";
			break;
		case 2:
			idioma="Euskera";
			break;
		case 3:
			idioma="English";
			break;
	}
	
	
	//crear la fecha
	ClaseFecha fecha = new ClaseFecha(dia, mes, año, idioma);
	
	
	while(exit) {
		System.out.println("Escribe lo que quieras hacer");
		number=sc1.nextInt();
		switch(number) {
			case 0:
				exit=false;
				break;
			case 1:
				emaitza=fecha.fechaIdatzi(fecha.dia, fecha.mes, fecha.año, fecha.idioma);
				System.out.println(emaitza);
				break;
				
			case 2:
				emaitza=fecha.fechaElektronikoa(fecha.dia, fecha.mes, fecha.año, fecha.idioma);
				System.out.println(emaitza);
				break;
			
			case 3:
				emaitza=fecha.fechaEgutegia(fecha.dia, fecha.mes, fecha.año, fecha.idioma);
				System.out.println(emaitza);
				break;
				
			case 4:
				emaitzaInt=fecha.hiruhilekoKalkulatu(fecha.mes);
				System.out.println(emaitzaInt);
				break;
			
			case 5:
				emaitzaInt=fecha.lauhilekoKalkulatu(fecha.mes);
				System.out.println(emaitzaInt);
				break;
			
			case 6:
				emaitzaInt=fecha.seihilekoKalkulatu(fecha.mes);
				System.out.println(emaitzaInt);
				break;
				
			case 7:
				emaitza=ClaseFecha.hilabeteIzenaLortu(fecha.mes, fecha.idioma);
				System.out.println(emaitza);
				break;
				
			case 8:
				emaitzaInt=fecha.hilEgunKopuruMax(fecha.mes, fecha.año);
				System.out.println(emaitzaInt);
				break;
				
			case 9:
				emaitzaB=fecha.bisiestoDa(fecha.año);
				System.out.println(emaitzaB);
				break;
				
			case 10:
				System.out.println("Escribe el día");
				dia=sc1.nextInt();
				fecha.egunaAldatu(dia);
				break;
				
			case 11:
				System.out.println("Escribe el mes");
				mes=sc1.nextInt();
				fecha.hilabeteaAldatu(mes);
				break;
				
			case 12:
				System.out.println("Escribe el año");
				año=sc1.nextInt();
				fecha.urteaAldatu(año);
				break;
			
			case 13:
				emaitzaB=fecha.dataEgokiaDa(fecha.dia, fecha.mes, fecha.año);
				System.out.println(emaitzaB);
				break;
				
			case 14:
				System.out.println("Escribe el día");
				dia=sc1.nextInt();
				System.out.println("Escribe el mes");
				mes=sc1.nextInt();
				System.out.println("Escribe el año");
				año=sc1.nextInt();
				emaitzaB=fecha.berdinakDira(fecha, dia, mes, año);
				System.out.println(emaitzaB);
				break;
				
			case 15:
				System.out.println("Escribe el día");
				dia=sc1.nextInt();
				System.out.println("Escribe el mes");
				mes=sc1.nextInt();
				System.out.println("Escribe el año");
				año=sc1.nextInt();
				emaitza=fecha.konparatu(fecha, dia, mes, año);
				System.out.println(emaitza);
				break;
				
			case 16:
				System.out.println("Escribe el día");
				dia=sc1.nextInt();
				System.out.println("Escribe el mes");
				mes=sc1.nextInt();
				System.out.println("Escribe el año");
				año=sc1.nextInt();
				ClaseFecha.esleitu(fecha, dia, mes, año);
				break;
				
			case 17:
				emaitzaInt=fecha.urteHasietatikZenbatEgun(fecha);
				System.out.println(emaitzaInt);
				break;
				
			case 18:
				emaitzaInt=fecha.urteBukaerarainoZenbategun(fecha);
				System.out.println(emaitzaInt);
				break;
				
			case 19:
				System.out.println("Escribe el día");
				dia=sc1.nextInt();
				System.out.println("Escribe el mes");
				mes=sc1.nextInt();
				System.out.println("Escribe el año");
				año=sc1.nextInt();
				while(0<number && number<4) {
					System.out.println("Por último, escoge el idioma (1-Castellano, 2-Euskera, 3-English");
					number=sc1.nextInt();
				}
				switch(number) {
					case 1:
						idioma="Castellano";
						break;
					case 2:
						idioma="Euskera";
						break;
					case 3:
						idioma="English";
						break;
				}
				ClaseFecha fecha2 = new ClaseFecha(dia, mes, año, idioma);
				
				emaitzaInt=fecha.egunFaltaDira(fecha, fecha2);
				System.out.println(emaitzaInt);
				break;
				
			case 20:
				System.out.println("Escribe el dia en el que nació");
				dia=sc1.nextInt();
				System.out.println("EEl mes");
				mes=sc1.nextInt();
				System.out.println("Y el año");
				año=sc1.nextInt();
				emaitzaInt=fecha.adinaKalkulatu(fecha, dia, mes, año);
				System.out.println(emaitzaInt + " urte");
				break;
				
			case 21:
				emaitza=fecha.bihar(fecha);
				System.out.println(emaitza);
				break;
				
			case 22:
				fecha.hurrengoEguna(fecha);
				break;
				
			case 23:
				emaitza=fecha.atzo(fecha);
				System.out.println(emaitza);
				break;
				
			case 24:
				fecha.atzokoEguna(fecha);
				break;
				
		}
	}
}
}
