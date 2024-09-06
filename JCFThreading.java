package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JCFThreading {
	
	public static List<Integer> arrayList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		RunnableThreadAddToArray r1 = new RunnableThreadAddToArray();
		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		Thread t3 = new Thread(r1, "t3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(arrayList.size() + " - " + arrayList);
		
		
		
	}
	
	public static synchronized void add(int num) {
		if (!arrayList.contains(num)) {
			arrayList.add(num);
		}
	}

}
