package singleton;

public class MyThread implements Runnable{
	public void run() {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}
