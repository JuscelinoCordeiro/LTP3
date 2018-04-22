package singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Singleton vet[] = new Singleton[15];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Singleton.getInstance();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("posicao " + i + ": " + vet[i]);
			if (i == 9) {
				System.out.println("\n Instancias repetidas");
			}
		}
	}

}
