package com.cluster.ThreadCollections;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBookAss4 {

	public static void main(String[] args) {

		Map<String,Integer> tbook=new HashMap<String, Integer>();
		tbook.put("name1", 912345678);
		tbook.put("name2", 48423456);
		tbook.put("name3", 89754312);
		System.out.println("Phone number of name1 is : "+tbook.get("name1"));
	}

}
