package com.atguigu;

public class ResourceData2 {
	private boolean judge = true;
	private int x = 1;
	private int y = 65;

	public synchronized void setnumber() throws InterruptedException {
		// 1.�ж�
		if (judge == false) {
			this.wait();
		}
		// 2.�ɻ�
		/*if (x == 52) {
			notifyAll();
		}*/
		System.out.print(x);
		System.out.print(x + 1);
		x = x + 2;
		judge = false;
		// 3.֪ͨ
		notifyAll();
	}

	public synchronized void setalphabet() throws InterruptedException {
		// 1.�ж�
		if (judge == true) {
			this.wait();
		}
		// 2.�ɻ�
		/*if (y == 91) {
			notifyAll();
		}*/
		System.out.print((char) y);
		y=y+1;
		judge = true;
		// 3.֪ͨ
		notifyAll();
	}
}
