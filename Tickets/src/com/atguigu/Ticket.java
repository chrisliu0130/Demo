package com.atguigu;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ���߳��е���Դ�࣬���ھ�,�ѶԴ���Ĳ�������װ�ڴ����У������ṩ�ӿڣ�������
 */
public class Ticket {

	private int numbers = 100;
	Lock lock = new ReentrantLock();

	public void sellTicket() {

		lock.lock();
		try {
			;
			if (numbers > 0) {
				System.out.println(Thread.currentThread().getName() + "�߳�������Ʊ����ʣ" + --numbers + "��Ʊ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

}
