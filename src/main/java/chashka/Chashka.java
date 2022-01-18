package chashka;
import java.util.Scanner;
import java.util.Random;

public class Chashka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("¿Cuántos equipos participan?");
		short equipos = Short.parseShort(sc.nextLine());
		String[] lista = new String [equipos];
		for (short i=0; i<equipos; i++) {
			System.out.println("Introduce el nombre del equipo " + (i+1));
			lista[i] = sc.nextLine();
		}
		String local;
		String visitante;
		short aux;
		for (short i=0; i<(equipos/2); i++) {
			do {
				aux = (short) rd.nextInt(equipos);
				local = lista[aux];
				lista[aux] = null;
			} while (local == null);
			do {
				aux = (short) rd.nextInt(equipos);
				visitante = lista[aux];
				lista[aux] = null;
			} while (visitante == null);
			System.out.println(local + "-" + visitante);
		}
	}

}
