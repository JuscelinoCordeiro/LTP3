package singleton;

public class MyThread implements Runnable{
	public void run() {
		SingletonLimited s = SingletonLimited.getInstance();
		System.out.println(s);
	}
}
