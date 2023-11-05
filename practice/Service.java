package practice;

import java.util.*;
public class Service 
{
	private Scanner sc = new  Scanner(System.in);
	private Repository repo = new Repository();
	private Man o = new Man();
	public void saveperson()
	{
		System.out.println("========================");
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter phone no.");
		String phone = sc.nextLine();
		System.out.println("Enter email id");
		String email = sc.nextLine();
		System.out.println("==========================");
		Person person = new Person(name,phone,email);
		repo.saverecords(person);	
	}
	public void showallrecords() 
	{
		repo.showallrecords();
	}
	public void deleterecord()
	{
		System.out.println("Enter name");
		String name = sc.nextLine();
		repo.deletePerson(name);
	}
	public void update()
	{
		System.out.println("==================");
		System.out.println("Enter first name");
		String name = sc.nextLine();
		Person p = repo.getrecord(name);
		System.out.println(repo.getrecord(name));
		if(p!=null)
		{
			System.out.println("==================");
			System.out.println("Enter new phone number :");
			String phone = sc.nextLine();
			p.setPhone(phone);
			System.out.println("Phone no. has been updated");
			System.out.println("==================");			
		}	
	}
	public void searchrecord() 
	{
		System.out.println("============================");
		System.out.println("Enter first name");
		String name = sc.nextLine();
		Person p = repo.getrecord(name);
		if(p == null)
		{
			System.out.println("=====================");
			System.out.println("Record not found");
			System.out.println("=====================");
			return ;
		}
		System.out.println("=================");
		System.out.println(p);
		System.out.println("==================");
	}
}
