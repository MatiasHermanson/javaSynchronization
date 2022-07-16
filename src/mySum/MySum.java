package mySum;

public class MySum {
	 
	private int sum = 0;

	public void increaseSum() {
		 Thread t = Thread.currentThread();
		 String name = "Thread-" + t.getId();
		 try {
			 Thread.sleep(100);
			 this.sum += 1;
			 System.out.println(name + " sum is: " + sum);
		 } catch (InterruptedException ex) {
			 System.out.println(ex.getMessage());
		 }
	}
}
