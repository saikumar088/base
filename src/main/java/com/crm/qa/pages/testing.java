package com.crm.qa.pages;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testing {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();   

		map.put(1,"ravi"); 

		map.put(1,"trivedi");  

		for(Map.Entry m : map.entrySet()) {    

		System.out.print(m.getKey()+" "+m.getValue());    

		}
	
	}}
