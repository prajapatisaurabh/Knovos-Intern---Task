package thread;

class A extends Thread {
	public void run() {
		System.out.println("Class A method...");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class B extends Thread {
	public void run() {
		System.out.println("Class B method...");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
	}
}

public class ThreadTutorial {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);

		a.start();
		b.start();
	}

}