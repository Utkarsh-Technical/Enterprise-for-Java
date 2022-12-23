package Multithreading;
class Alpha extends Thread
{
	public void run()
	{
		String t=Thread.currentThread().getName();
		
		if(t.equals("BANK"))
		{
			banking();
		}
		else if(t.equals("PRINT"))
		{
			printing();
		}
		else
		{
			calc();
		}
	}
	
	public void banking()
	{
		System.out.println("banking task started ");
		
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Banking........");
		}
		System.out.println("Banking completed....");
	}
	
	public void printing()
	{
		System.out.println("printing task started ");
		
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("printing........");
		}
		System.out.println("printing completed....");
	}
	
	public void calc()
	{
		System.out.println("calc task started ");
		
		for(int i=0;i<3;i++)
		{
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("calc........");
		}
		System.out.println("calc completed....");
	}
}

public class LaunchSR {

	public static void main(String[] args)
	{
		Alpha a1=new Alpha();
		Alpha a2=new Alpha();
		Alpha a3=new Alpha();
		
		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		
		a1.start();
		a2.start();
		a3.start();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
