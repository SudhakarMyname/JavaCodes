package practice;

import java.util.*;

public class App implements Runnable{

	public static void main(String[] args) 
	{
	
		System.out.println("*** main method***");
		Scanner sc= new Scanner(System.in);
		Service service = new Service();
		while(true)
		{
		System.out.println("======Person management===========");
		System.out.println("Enter 1 to save records");
		System.out.println("Enter 2 to view records");
		System.out.println("Enter 3 to delete records");
		System.out.println("Enter 4 to search records");
		System.out.println("Enter 5 to update phone");
		System.out.println("Enter 6 to quit");
		System.out.println("====================================");
		
		int choice = sc.nextInt();
	
		if(choice == 1)
		{
			service.saveperson();
		
		}
		else if (choice == 2)
		{
			service.showallrecords();
		}
		else if(choice == 3)
		{
			service.deleterecord();
		}
		else if(choice == 4)
		{
			service.searchrecord();
		}
		else if(choice == 5)
		{
			service.update();
		}
		else if(choice == 6)
		{
			App obj = new App();
				obj.run();	
		}
		else {
			System.out.println("invalid input try again");
		}
		}	
		
	}
	public void run()
	{
		try {
			
			System.out.println("Thanx for visiting us ");
			Thread.sleep(5000);
			System.out.println("we are now closing this app");
			Thread.sleep(2000);
		}
		catch(Exception ex) {}	
		System.exit(0);
		
	}
	}
	
	
