package com.atguigu;

/*
 * �߳���Դ��
 */
public class ResourceData {
	// 12A34B56C
	private boolean judge = true;
	private int codenum = 65;

	public synchronized void setnumber() throws InterruptedException {

		// 2.�ɻ�
		for (int i = 1; i <= 52; i++) {
			// 1.�ж�
			if (judge == false) {
				this.wait();
			}
			if (i % 2 == 0) {
				judge = false;
			}
			System.out.print(i);
		}

		// 3.֪ͨ
		this.notifyAll();
	}

	public synchronized void setalppabet() throws InterruptedException {

		// 2.�ɻ�
		for (int i = codenum; i < 91; i++) {
			// 1.�ж�
			if (judge == true) {
				this.wait();
			}
			char a = (char) i;
			System.out.print(a);
			judge = true;

			// 3.֪ͨ
			this.notifyAll();
		}

	}
}
