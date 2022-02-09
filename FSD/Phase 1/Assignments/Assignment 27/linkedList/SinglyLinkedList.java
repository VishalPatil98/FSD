package linkedList;
import java.io.*;
public class SinglyLinkedList 
{
	Node head;                        // first node
	static class Node                  // inner class 
	{
		int data;
		Node next;
		
		Node(int d) 
		{
			data = d;
			next = null;
		}
	}
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) //inserting new node
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if (list.head == null)
		{
			list.head = new_node;
		} 
		else 
		{
			Node last = list.head;
			while (last.next != null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public static void printList(SinglyLinkedList list)
	{
		Node currNode = list.head;
		System.out.print("LinkedList: ");
			while (currNode != null) 
			{
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		System.out.println();
	}

	// Method to delete a node in the LinkedList by KEY
	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key)
	{
		Node currNode = list.head, prev = null;
		if (currNode != null && currNode.data == key)
		{
			list.head = currNode.next; // Changed head
			System.out.println(key + " found and deleted");
			return list;
		}
		//to delete node between two nodes or last node
		while (currNode != null && currNode.data != key) 
		{
			prev = currNode;
			currNode = currNode.next;
		} 
		if (currNode != null)
		{
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}
		if (currNode == null)
		{
			System.out.println(key + " not found");
		}
		return list;
	}
	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list = insert(list, 55);
		list = insert(list, 35);
		list = insert(list, 10);
		list = insert(list, 45);
		list = insert(list, 22);
		list = insert(list, 99);
		list = insert(list, 79);
		list = insert(list, 86);
		printList(list);
		deleteByKey(list, 10);
		printList(list);
		deleteByKey(list, 45);
		printList(list);
		// Delete node with value 10
		deleteByKey(list, 100);
		printList(list);
	}
}
