package thread;

class RunnableDemo extends Thread {
	private Thread t;
	private String threadName;

	public RunnableDemo(String threadName) {
		this.threadName = threadName;
		System.out.println("Creating Thread : " + threadName);
	}

	public void run() {
		System.out.println("Running : " + threadName);
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread : " + threadName + " , " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread : " + threadName + "Intrupted .");
		}
		System.out.println("Thread : " + threadName + " Exit");

	}

	public void start() {
		System.out.println("Starting : " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo("T-1");
		r.start();
		RunnableDemo r1 = new RunnableDemo("T-2");
		r1.start();
	}
}
