package tema4;

public class project {

	public static void main(String[] args) {
		
		int numeroIf = 0;
		
		if(numeroIf == 0) {
			System.out.println("Numero if: " + "Es 0");
		}
		
		else if(numeroIf < 0) {
		System.out.println("Numero if: " + "Es negativo");
		}
		
		else {
		System.out.println("Numero if: " + "Es positivo");
		}
		
		//////////////////////////////////////////////////
		System.out.println("----------------");
		//////////////////////////////////////////////////
		
		int numeroWhile = 0;
		
		while (numeroWhile < 3) {
			System.out.println("Numero while: " + numeroWhile);
			numeroWhile = numeroWhile + 1;
		}
		
		//////////////////////////////////////////////////
		System.out.println("----------------");
		//////////////////////////////////////////////////
		
		int numeroDoWhile = 3;
		
		do {
			System.out.println("Numero DoWhile: " + numeroDoWhile);
			numeroDoWhile = numeroDoWhile + 1;
			
		}	while(numeroDoWhile < 3);
		
		//////////////////////////////////////////////////
		System.out.println("----------------");
		//////////////////////////////////////////////////
		
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("Numero For: " + numeroFor);
		}
		
		//////////////////////////////////////////////////
		System.out.println("----------------");
		//////////////////////////////////////////////////
		
		int estacion = 2;
		
		switch(estacion) {
		
			case 1:
				System.out.println("Es primavera");
				break;
				
			case 2:
				System.out.println("Es verano");
				break;
				
			case 3:
				System.out.println("Es otoño");
				break;
				
			case 4:
				System.out.println("Es invierno");
				break;
				
			default:
				System.out.println("No hay una estacion definida");
		}
		
	}
