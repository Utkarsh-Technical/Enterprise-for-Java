package Multithreading;

public class LaunchMT 
{

	public static void main(String[] args) throws Exception
	{
		
         System.out.println("Hello Focus Here");
         
        Thread t= Thread.currentThread();
        
        
        System.out.println(t);
        
        String name=Thread.currentThread().getName();
        System.out.println(name);
        
        
        
        
         
        
	}

}
