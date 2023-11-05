package practice;

public class LinkedList {
	
	private Node first = null;
	private Node last = null;
	
	public void add(String Element)
	{
		Node fresh = new Node(Element);
		if (last == null)
		{
			last = fresh;
			first = fresh;
				return;
		}
		last.next = fresh ;
		fresh.previous = last;
		last = fresh;
	}
	
	public void addFirst(String Element)
	{
		Node fresh = new Node(Element);
		if(first == null)
		{
			first = fresh ;
			last = fresh ;
			return;
		}		
		fresh.next = first ;
		first.previous = fresh ;
		first = fresh ;		
	}
	public void addLast(String Element)
	{
		add(Element);
	}
	public void add(int index , String Element)
	{
		int listsize = size();
		if(index < 0 || index > listsize)
		{
			throw new IndexOutOfBoundsException("Index :"+index+"size:"+listsize);
		
		}
		if(index == 0)
		{
			addFirst(Element);
			return;
		}
		if(index == listsize)
		{
			addLast(Element);
			return;
		}
		Node fresh = new Node(Element);
		Node b2 = first;
		
		for(int c = 0 ; c<index ; c++)
		{
			b2=b2.next;
		}
		
		Node b1 = b2.previous;
		b1.next = fresh;
		fresh.previous = b1 ;
		b2.previous = fresh ;
		fresh.next = b2;
	}
	//code to remove element
	public boolean remove (String element)
	{
		if(first == null)
			return false;
		Node cur = first;
		while(cur != null)
		{
			if(cur != null)
			{
				if( cur.element ==  element )
				{
					if( cur ==  first)
					{
						removeFirst();
						return true;
					}
					
					if( cur == last )
					{
						removeLast();
						return true;
					}
					Node b1 = cur.previous;
					Node b2 = cur.next;
					b1.next = b2;
					b2.previous = b1;
					break;
				}
				cur = cur.next;
			}
		}
		return false;
	}
	
	//code to remove first element
	
	public void removeFirst()
	{
		if (first ==  null)
			return;
		Node next = first.next;
	if(next == null)
	{
		first = last = null;
		return;
	}
		next.previous = null;
		first = next;
	}
	public void removeLast()
	{
		if(last == null)
			return;
		Node prev = last.previous;
		if(prev == null)
		{
			first = last = null;
			return;
		}
			prev.next = null;
			last = prev;
	}
	public int size()
	{
		int count = 0;
		Node cur = first;
		while(cur != null)
		{
			count++;
			cur = cur.next;
		}
		return count;
	}
	public void showList()
	{
		int count=0;
		Node cur = first;
		while(cur != null)
		{
			
			System.out.println(cur.element);
			cur = cur.next;
		}
	}
		
}
