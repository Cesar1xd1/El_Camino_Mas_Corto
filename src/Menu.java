import java.util.Scanner;

interface Correcion{
	Scanner input = new Scanner(System.in);
	
	public static int validacion() {
		int r = 0;
		boolean e = false;
		do {
			try {
				r = input.nextInt();
			} catch (java.util.InputMismatchException h) {
				System.out.println("Ups... Solo numeros porfavor, intenta de nuevo:");
				input.nextLine();
				e=true;
			}
			if (r>0) {
				e=false;
			}else {
				System.out.println("Solo numeros mayores a 0 por favor, intenta de nuevo:");
				e=true;
			}
		}while(e);
		return r;
	}
}


public class Menu {

	public static void main(String[] args) {
		int opcion = 0;
		do {
			System.out.println("========== MENU ==========");
			System.out.println("Digite 1 para DIJKSTRA");
			System.out.println("Digite 2 para FLOYD SARSHALL");
			System.out.println("DIGITE 3 para FORD BELLMAN");
			System.out.println("Digite 4 para ***SALIR***");
			opcion = Correcion.validacion();
			switch(opcion) {
			case 1:
				Dijkstra.main(args);
				break;
			case 2:
				Floyd_Warshall.main(args);
				break;
			case 3: 
				Bellman_Ford.main(args);
				break;
			case 4:
				System.out.println("Gracias por usar");
				break;
			default:
				System.out.println("Opicion no disponible");
			}
			
			
			
			
		}while(opcion!=4);

	}

}
