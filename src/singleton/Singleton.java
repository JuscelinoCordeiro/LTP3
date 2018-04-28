package singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
