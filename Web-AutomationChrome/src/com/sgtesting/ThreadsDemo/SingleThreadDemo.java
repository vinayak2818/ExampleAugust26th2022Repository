package com.sgtesting.ThreadsDemo;
class MyThread implements Runnable
{
	public void run()
	{
		dislayEvenNumber();
	}
	void dislayEvenNumber()
	{
		try {
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println("Elements:"+i);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class SingleThreadDemo {

	public static void main(String[] args) {
		MyThread job=new MyThread();
		
		Thread t1=new Thread(job);
		t1.start();

	}
	

}
