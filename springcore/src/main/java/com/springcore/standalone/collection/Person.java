package com.springcore.standalone.collection;

import java.util.List;

public class Person {
	
	private List<String> friends;

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

}
