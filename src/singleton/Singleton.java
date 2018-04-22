package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singleton {

	private static int qtdInstance = 3;
	private static List lista = new ArrayList();
	private static Singleton instance;

	private Singleton() {

	}

	public synchronized static Singleton getInstance() {
		if (qtdInstance > 0) {
			qtdInstance--;
			instance = new Singleton();
			lista.add(instance);
			 for (int i = 0; i < lista.size(); i++) {
			 System.out.println("Instancia da posição " + i + ": "
			 + lista.get(i));
			 }
			return instance;
		} else {
			Random rn = new Random();
			int indice = rn.nextInt(lista.size());
			// Random random = new Random(lista.size());
			return (Singleton) lista.get(indice);
		}
	}
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
}
