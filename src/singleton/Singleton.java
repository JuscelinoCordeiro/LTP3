package singleton;

public class Singleton {

	private static int qtdInstance = 0;

//	private static Singleton instance;
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (qtdInstance < 10) {
			qtdInstance += 1;
			instance = new Singleton();
			return instance;
		}else {
			return null;
		}
		
	}
	// public static Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
}
