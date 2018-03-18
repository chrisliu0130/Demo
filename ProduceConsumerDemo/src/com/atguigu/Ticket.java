package com.atguigu;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket {

	private int number = 100;
	private ReentrantLock rl = new ReentrantLock();

	public void sell() {

		rl.lock();
		try {
			if(number>0) {
				System.out.println(Thread.currentThread().getName()+"������Ʊ��Ʊ����ʣ"+(--number)+"��");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rl.unlock();
		}
	}
}
