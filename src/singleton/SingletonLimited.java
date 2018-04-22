package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SingletonLimited {

	private static int qtdInstance = 3;
	private static List lista = new ArrayList();
	private static SingletonLimited instance;

	private SingletonLimited() {

	}

	public synchronized static SingletonLimited getInstance() {
		if (qtdInstance > 0) {
			qtdInstance--;
			instance = new SingletonLimited();
			lista.add(instance);
			return instance;
		} else {
			Random rn = new Random();
			int indice = rn.nextInt(lista.size());
			return (SingletonLimited) lista.get(indice);
		}
	}

}
