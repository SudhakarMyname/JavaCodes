package practice;

public class P {

	    private Node head;
	    private Node tail;
	    
	    // Node class representing each element in the doubly linked list
	    private class Node {
	        String data;
	        Node prev;
	        Node next;
	        
	        Node(String data2) {
	            this.data = data2;
	            this.prev = null;
	            this.next = null;
	        }
	    }
	    
	    // Method to add a new element to the doubly linked list
	    public void add(String data) {
	        Node newNode = new Node(data);
	        
	        if (head == null) {
	            // If the doubly linked list is empty, make the new node both head and tail
	            head = newNode;
	            tail = newNode;
	        } else {
	            // Add the new node at the end of the doubly linked list
	            newNode.prev = tail;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }
	    
	    // Other methods of the DoublyLinkedList class
	}


