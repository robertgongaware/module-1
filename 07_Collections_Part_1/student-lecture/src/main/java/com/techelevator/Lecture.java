package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");
		
		List<String> names; // names: null
		
		names = new ArrayList<String>(); // names -> new ArrayList of Strings on the heap
		
		// List<String> names = new ArrayList<String>(); how to declare in one line
		// equivolent in array...String[] namesArr = new String[0];
		
		names.add("Tom"); //must be a string
		names.add("Bob");
		names.add("Walt"); // cannot combine, must declraed individually
		names.add("Beth");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");
		
		for(int i = 0; i < names.size(); i++) { //no idea of how "big" this can get, infinite, as much as you need
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i)); // there is a method attached to the names object, and this 'gets' element i
		}


		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");
		
		System.out.println("Adding Bob again");
		names.add("Bob");
		
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");
		
		names.add(3, "Jennifer"); //Syntax: integer then string
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");
		
		System.out.println("======\nRemoving #5\n========");
		
		names.remove(5); //removes data at index 5
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}
		
		System.out.println("======\nRemoving #1\n========");
		names.remove(1); //removes data at index 1
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}
		
//		List<String> names2 = new ArrayList<String>(); Throws an error. Cannot add to the middle of a List that has no set bounds. List is "0" and we are trying to set index 3.
//		names2.add(3, "Jennifer");
//		
//		for(int i = 0; i < 4; i++) {
//			System.out.println(names2.get(i));
//		}
		
		


		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");
		boolean containsBeth;
		containsBeth = names.contains("Beth");
		
		System.out.print("names does ");
		if(!containsBeth) {
			System.out.print("not ");
		}
		System.out.println("contain Beth!");
		
		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		int indexOfWalt = names.indexOf("Walt");
		System.out.println("Walt is at position #: " + indexOfWalt);//picks out the index number of a particular string

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");
		
		String[] namesAsArray = names.toArray(new String[names.size()]);
		
		System.out.println("Here is my array:\n========");
		for(int i = 0; i < namesAsArray.length; i++) {
			System.out.println(namesAsArray[i]);
		}
		


		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");
		
		System.out.println("######## BEFORE SORTING ##########");
		
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}
		
		Collections.sort(names);
		
		System.out.println("######### AFTER SORTING #########");//sorts in alphanumerical order. alphabetical for words/chars, numerical for numbers
		
		for(int i = 0; i < names.size(); i++) { 
			System.out.print("Index " + i + ":\t");
			System.out.println(names.get(i));
		}


		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");
		
		Collections.reverse(names);

		
		System.out.println("####################");
		System.out.println(" PRIMITIVE WRAPPERS");
		System.out.println("####################");

		/* Every primitive data type has an equivalent "primitive wrapper class" that is an object representation
		 * of a primitive value */
		
		
		//int x = 5; does not work with lists.
		Integer x = new Integer(5);//creates a 'proper' list of integers on the heap
		x++;
		// Auto boxing & Auto unboxing - box up into a reference type or down into a primitive
		// primitive wrappers are IMMUTABLE
		Character c = new Character('c');
		Double pi = new Double(3.14159);
		Float t = new Float(0.9f);
		//Boolean t = new Boolean(true);
		
		Double.parseDouble("3.14");// 3.14
		Integer.parseInt("6"); // 6
		
		List<Integer> scores = new ArrayList<Integer>();
		
		
		//List<int> scores = new ArrayList<int>();//collections can only hold data on the heap. no stack value types ints/boolean/etc
		
		

		System.out.println("####################");
		System.out.println("       FOREACH"); //for each VALUE, needs to be a string. extremely popular to use
		System.out.println("####################");
		System.out.println();
		
		for(String name : names) {  //for each name in names. singular to plural
			System.out.println(name);
		}

		System.out.println("####################");
		System.out.println("       QUEUES"); //simple collections. retain order. interface, non instantiable
		System.out.println("####################");
		System.out.println();

		/////////////////////
		// PROCESSING ITEMS IN A QUEUE
		/////////////////////
		// First in / First Out
		// FIFO
		
		Queue<String> tasks = new LinkedList<String>();
		// Add: Offer
		// Remove: Poll
		tasks.offer("Clean the dishes");
		tasks.offer("Sweep the floor");
		tasks.offer("Scrub the toilet");
		
		while(tasks.size() > 0) { //or while(!tasks.isEmpty()) {
			System.out.println(tasks.size());
			System.out.println(tasks.poll());
		}
		
//		System.out.println(tasks.size());
//		
//		String nextTask = tasks.poll(); 
//		System.out.println(nextTask); //calls the first/top offer
//		System.out.println(tasks.size());
		
				
		

		System.out.println("####################");
		System.out.println("       STACKS");
		System.out.println("####################");
		System.out.println();

		////////////////////
		// PUSHING ITEMS TO THE STACK
		////////////////////
		
		//Last In / First Out
		// LIFO
		
		Stack<String> websites = new Stack<String>();
		
		// Add: Push
		// Remove: Pop
		
		// peek(): shows what the next item would be. works in both stacks and queues. doesn't modify the data structure.
		
		websites.push("www.google.com");
		websites.push("en.wikipedia.org");
		websites.push("www.techelevator.com");
		
		while(!websites.isEmpty()) {
		System.out.println(websites.size());
		System.out.println(websites.pop());
		}
		// doesn't stay in order as a queue does. think pancakes. you eat the top one...or the last pancake stacked. the bottom pancake was the first, top the last
		//think browser back button or undo button. give you the last change...not the beginning.
		////////////////////
		// POPPING THE STACK
		////////////////////

	}
}
