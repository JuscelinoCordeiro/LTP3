package singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		SingletonLimited vet[] = new SingletonLimited[15];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = SingletonLimited.getInstance();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("posicao " + i + ": " + vet[i]);
			if (i == 2) {
				System.out.println("\n Instancias repetidas");
			}
		}
	}

}
