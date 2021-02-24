package concurrency;

public class DownLoadFile implements Runnable{

	@Override
	public void run() {
		System.out.println("Dowloading a file :" + Thread.currentThread().getName());
		
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			if(Thread.currentThread().isInterrupted()) return;
			System.out.println("Downloading byte " + i);
		}
		
		System.out.println("Downloading Complete!!!");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}

}
