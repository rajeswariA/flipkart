package com.flipkartday2.Test;

import java.util.HashMap;
import java.util.Map;

public class practise {
public static void main(String[] args) {
	practise p=new practise();
	System.out.println(p.map1().values());
	System.out.println(p.map2().values());
	System.out.println(p.map1().values().equals(p.map2().values()));
}
public Map<Integer, String> map1(){
	Map<Integer, String> m=new HashMap<>();

	m.put(1, "Ankush");
	
	//m.put(2, "Agrawal1");
	m.put(2, "Agrawal");
	
	return m;
}
public Map<Integer, String> map2(){
	Map<Integer, String> m=new HashMap<>();
	m.put(1, "Ankush");
	
	m.put(2, "Agrawal");
	
	return m;
}
}