package com.java.collectionInterfaces;

import com.java.collectionInterfaces.TheLinkedList.Node;

public class TheLinkedListTest {

	public static void main(String[] args) {
		TheLinkedList list = new TheLinkedList();
		//Dynamically allocate three nodes
		//list.head = new Node(1);
		//Node second_node = new Node(2);
		//Node third_node = new Node(3);
		//linked first node (head) with the second 
		//list.head.next = second_node;
		//linked the second node with the third node
		//second_node.next = third_node;
		//list.printLinkedList();
		
		list.push(2);
		list.push(5);
		list.push(7);
		list.push(4);
		list.printLinkedList();
		System.out.println("\n");
		list.deleteNode(2);
		list.printLinkedList();
	}

}
