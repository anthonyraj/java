package com.araj.datastructures;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Phonebook {
	Map<String,Integer> pb = new HashMap<String,Integer>();
	Map<String,Integer> pb1 = new HashMap<String,Integer>();

	public Phonebook() {
		// TODO Auto-generated constructor stub
	}
	
	public void setPhoneno(String key, Integer value){
		this.pb.put(key, value);
	}
	
	public Integer getPhoneno(String key){
		if (this.pb.containsKey(key)){
			return this.pb.get(key);
		}
		else
			return 0;
	}
	
	public void readPhonebook(Scanner s){		
		Boolean hasData = s.hasNextLine();
		
		while(hasData){
			String data = s.nextLine();
			if ( !data.isEmpty() ) {
				//System.out.println(data);
				String a[] = data.split(" ");
				
				if (a.length==2){
					this.setPhoneno(a[0],Integer.valueOf(a[1]));
					hasData = s.hasNextLine();
				}
				else if (a.length==1)
					System.out.println("Name and Phoneno not available");
			}
			else {
				hasData=false;
			}
				
		}
		//System.out.println(this.getPhoneBook());
	}
	
	public void askPhonebook(){
		
	}
	
	public Map<String,Integer> getPhoneBook(){
		return this.pb;
	}
	
	public Map<String,Integer> getPhoneBook1(){
		return this.pb1;
	}
	
	public void printPhoneBook1(){
		Iterator <Entry <String,Integer> > it = this.pb1.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String,Integer> pair = (Map.Entry<String,Integer>)it.next();
			if (pair.getValue() == 0)
				System.out.println("Not found");
			else
				System.out.println(pair.getKey()+"="+pair.getValue());
		}
	}
		
	public void queryPhoneBook(Scanner s1){	
		Boolean hasData1 = s1.hasNextLine();
		//int[] a = new int[100];
		//int i = 0;
		int phoneno = -1;
		while(hasData1){
			String name = s1.nextLine();
			if ( !name.isEmpty() ) {
				phoneno = this.getPhoneno(name);
				pb1.put(name,phoneno);
				hasData1 = s1.hasNextLine();							
			}
			else {
				hasData1=false;
			}
				
		}

		//System.out.println(this.getPhoneBook1());
		this.printPhoneBook1();
	}	
	
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);
		//IMPORTANT Lesson:
		//		The input buffer can be opened only once and closed only once
		Phonebook pb = new Phonebook();			
		System.out.println("Creating Phone Book");
		pb.readPhonebook(s);	
		System.out.println("Query Phone Book");
		pb.queryPhoneBook(s);
		s.close();
	}

}
