package com.handson;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(01, "Anita", "ani23"));
		list.add(new User(02, "Barath", "ba456"));
		list.add(new User(03, "Charlie", "char456"));
		list.add(new User(04, "Donold", "d0123"));
		list.add(new User(05, "Evan", "evan76"));
		
		for(User user : list) {
			if(user.getName().length() > 5) {
				System.out.println(user);
			}
		}
	}

}
