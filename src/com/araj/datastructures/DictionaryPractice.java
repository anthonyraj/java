package com.araj.datastructures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DictionaryPractice {

	public DictionaryPractice() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		Map <String, String> EnglishFrenchDict = new HashMap<String, String>();
		System.out.println("EnglishFrenchDict:");
		System.out.println("--------------------");
		
		EnglishFrenchDict.put("Monday", "Lundi");
		EnglishFrenchDict.put("Tuesday", "Mardi");
		EnglishFrenchDict.put("Wednesday", "Mercredi");
		EnglishFrenchDict.put("Thursday", "Mercredi");
		EnglishFrenchDict.put("Friday", "Vendredi");
		EnglishFrenchDict.put("Saturday", "Samedi");
		EnglishFrenchDict.put("Sunday", "Dimanche");
		
		Iterator<Entry<String, String>> it = EnglishFrenchDict.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<String,String> pair = (Map.Entry<String,String>)it.next();
			System.out.println(pair.getKey()+"="+pair.getValue());
		}
		
		System.out.println("size="+EnglishFrenchDict.size());
		System.out.println("hashCode="+EnglishFrenchDict.hashCode());
		
		Map <String,Boolean> ShoppingList = new HashMap<String,Boolean>();
		ShoppingList.put("Bread",true);
		ShoppingList.put("Eggs",Boolean.TRUE);
		ShoppingList.put("Jam",Boolean.FALSE);
		ShoppingList.put("Juice",Boolean.TRUE);
		ShoppingList.put("Bananas",Boolean.FALSE);
		
		System.out.println("--------------------");
		System.out.println("ShoppingList:");
		System.out.println("IsEmpty():"+ShoppingList.isEmpty());
		
		Iterator<Entry<String,Boolean>> it1 = ShoppingList.entrySet().iterator();
		while(it1.hasNext()){
			Map.Entry<String,Boolean> pair = (Map.Entry<String,Boolean>) it1.next();
			System.out.println(pair.getKey()+"="+pair.getValue());
		}
		ShoppingList.remove("Bread");
		
		ShoppingList.clear();
		System.out.println("IsEmpty():"+ShoppingList.isEmpty());
		//Remove a key
		
		System.out.println("--------------------");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
