package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainMyThread {

	public static void main(String[] args) {
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i = 0; i < 15; i++) {
			Runnable r = new MyThread();
			pool.execute(r);
//			System.out.println("Saída " + i);
		}
	}

}
