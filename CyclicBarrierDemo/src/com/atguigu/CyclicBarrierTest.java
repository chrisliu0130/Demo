package com.atguigu;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(7, () -> {
			System.out.println(Thread.currentThread().getName() + "���ٻ�����");
		});

		for (int i = 1; i <= 7; i++) {
			new Thread(() -> {

				try {
					System.out.println(Thread.currentThread().getName()+"�Ŷ����ռ���������");
					cb.await();
				} catch (InterruptedException | BrokenBarrierException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}, String.valueOf(i)).start();
		}

	}

}
