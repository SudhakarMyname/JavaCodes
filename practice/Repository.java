package practice;

import java.util.ArrayList;

public class Repository 
{
	private ArrayList <Person> personlist = new ArrayList <Person>();
	
	
	
	public void saverecords(Person p) {
	System.out.println("** Control into repository **");
	personlist.add(p);
	System.out.println("=====================");
	System.out.println("Record has been saved");
	System.out.println("=====================");
	}
	public void showallrecords()
	{
		if(personlist.isEmpty())
		{
			System.out.println("===============");
			System.out.println("No record exists");
			System.out.println("===============");
			return;
		}
		System.out.println("===================");
		for(Person p : personlist)
		{
			System.out.println(p);
		}
		System.out.println("=================");
	}
	public void deletePerson(String nam) 
	{
		for(Person p : personlist)
		{
			String name = p.getName();
			if(name.equalsIgnoreCase(name))
			{
				personlist.remove(p);
				System.out.println("===============");
				System.out.println("person record has been deleted");
				System.out.println("===============");
				return;
			}			
				System.out.println("================");
				System.out.println("person record does not exist");
				System.out.println("=================");					
		}
	}
	public Person getrecord(String name)
	{
		for(Person p : personlist)
		{
			if(p.getName().equalsIgnoreCase(name));
			{
				return p;
			}
		}
		return null;
}
}
