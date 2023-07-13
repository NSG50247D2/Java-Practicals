package Unit_3;
import java.util.*;
import java.lang.*;

public class P14_Task04_DepositAndWithdraw {

	public static void main(String[] args) {
		SharedResources c = new SharedResources();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				c.withdraw(15000);
			}
		});
		t1.start();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
		
	}

}

class SharedResources{
	int amount=10000;
	synchronized void withdraw(int amount) {
		System.out.println("Going to withdraw: "+amount);
		if(this.amount<amount) {
			System.out.println("Less balance, waiting for deposit: ");
			try {
				wait();
				/*
				 * To kill the thread instead of waiting
				 * Thread.currentThread().interrupt();
				 * 
				 * Thread.currentThread().stop();
				 */
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount-=amount;
		if(this.amount<0) {
			System.out.println("Negative balance, can not withdraw: ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Now total amount is: "+this.amount);
		System.out.println("Withdraw completed!");
	}
	synchronized void deposit(int amount){
		System.out.println("Going to depsoit: "+amount);
		this.amount+=amount;
		System.out.println("Deposit completed");
		System.out.println("Current total amount: "+this.amount);
//		notify();
		notifyAll();
	}
}