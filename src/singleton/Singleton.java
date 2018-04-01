package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singleton {

	private static int qtdInstance = 10;
	private static List lista = new ArrayList();
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (qtdInstance > 0) {
			qtdInstance--;
			instance = new Singleton();
			lista.add(instance);
			return instance;
		}else {
			Random random = new Random(lista.size());
			return (Singleton) lista.get(random.nextInt());
		}
	}
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
}
