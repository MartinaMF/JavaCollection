package com.java.collectionInterfaces;

import org.w3c.dom.Node;

public class TheLinkedList {
	
	Node head; //head of list
	
	public static class Node{
		int data;
		Node next;
		public Node(int d) {
			data = d;
			next = null;
		}
	}
		//Prints the content of each node beginning with the head node
		public void printLinkedList() {
			Node n = head;
			while(n != null) {
				System.out.print(n.data + "");
				n = n.next;
			}
		}
		public void push(int new_data) {
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
		}
		public void deleteNode(int nodeKey) {
			Node temp = head;
			Node prev = null;
			//check if head contains the key to delete
			if(temp !=null && temp.data == nodeKey) {
				head = temp.next;
			}
			//Search for key to delete and keep track
			//of the previous node as we need to change the temp.next
			while(temp != null && temp.data != nodeKey) {
				prev = temp;
				temp = temp.next;
			}
			if(temp == null) {
				return;
			}
			prev.next = temp.next;
		}
	}
