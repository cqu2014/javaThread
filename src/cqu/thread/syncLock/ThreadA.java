package cqu.thread.syncLock;

public class ThreadA extends Thread {
	private MyObject object;

	public ThreadA(MyObject object) {
		super();
		this.object = object;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		object.methodA();
	}
}
