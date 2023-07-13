package Unit_3;

public class P14_Task02_RunOrStart {

	public static void main(String[] args) {
		CustomThreadStartOrRun obj = new CustomThreadStartOrRun();
		Thread t1=new Thread(new CustomThreadStartOrRun(),"T1");
		Thread t2=new Thread(obj,"T2");
		t1.run();
		t2.start();
		
		System.out.println(Thread.currentThread().getName());

	}

}

class CustomThreadStartOrRun implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+" = "+i);
		}
		
	}
	
}

//Run method doesn't create new thread
//Start will create new thread