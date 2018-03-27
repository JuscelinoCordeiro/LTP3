package singleton;

public class Main {

	public static void main(String[] args) {
		 Singleton s1 = Singleton.getInstance();
		 System.out.println(s1);
		
		 Singleton s2 = Singleton.getInstance();
		 System.out.println(s2);

		Singleton vet[] = new Singleton[10];

		for (int i = 0; i < vet.length; i++) {
			vet[i] = Singleton.getInstance();
		}

		for (int i = 0; i < vet.length; i++) {
			System.out.println("posicao " + i + ": " + vet[i]);
		}
	}

}
