package com.nishiravi;

class Exec {
	public static void main(String[] args) {
		System.out.println("Hello world!");
		Person sang = new Person(30);
		sang.getCount();
		sang.setFirstName("Sangeeth");
		System.out.println("Person name is: " + sang.getFirstName());
		System.out.println("Person name is: " + sang.count + " " + Person.count);
		Person sree = new Person(26);
		sree.getCount();
		sang.getCount();
		Person.getCount();
		sree.count = 1;
		System.out.println("Person name is: " + sang.count + " " + Person.count + " " + sree.count);
		Person.count = 2;
		System.out.println("Person name is: " + sang.count + " " + Person.count + " " + sree.count);
		sang.count = 3;
		System.out.println("Person name is: " + sang.count + " " + Person.count + " " + sree.count);
	}
}

