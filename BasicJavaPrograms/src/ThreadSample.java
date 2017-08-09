
public class ThreadSample extends Thread {
	public void run(){
		for(int i=0; i<5; i++)
		{
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		ThreadSample t1= new ThreadSample();
		ThreadSample t2= new ThreadSample();
		t1.start();
		t2.start();
	}
	}
