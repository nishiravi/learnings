package com.nishiravi;

class Person {
	private String firstName;
	String lastName;
	int age;
	public static int count = 0;

	Person(int age) {
		this.age = age;
		count++;
		System.out.println("Constructing Person");
	}

	static int getCount() {
		return count;
	}

	String getFirstName() {
		return firstName;
	}

	void setFirstName(String newFirstName) {
		getFirstName();
		firstName = newFirstName;
	}
}
