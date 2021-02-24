package concurrency;

public class Main {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new DownLoadFile());
		thread.start();
		
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("File is ready to be scanned.");
//		
	}

}
