package com.araj.datastructures;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class Recursion {

	public Recursion() {
		// TODO Auto-generated constructor stub
	}

	public static int Summation(int n){
		if (n>0){
			return n + Summation(n-1);
		}
		else {
			return 0;
		}
	}

	public static int Factorial(int n){
		if(n>0){
			return n * Factorial(n-1);
		}
		else {
			return 1;
		}
	}

	public static int Exponential(int n, int p){
		if (p>0) {
			return n * Exponential(n,p-1);
		}
		else {
			return 1;
		}
	}

	public static void printHashMap(Map<Integer,Integer> m1){
		Iterator it1 = m1.entrySet().iterator();
		while(it1.hasNext()){
			Map.Entry<Integer,Integer> pair1 = (Map.Entry<Integer,Integer>) it1.next();
			System.out.println(pair1.getKey()+"=>"+pair1.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m = new LinkedHashMap <Integer,Integer>();
		Map<Integer,Integer> m1 = new LinkedHashMap <Integer,Integer>();
		Map<Integer, Integer> m2 = new LinkedHashMap <Integer, Integer>();

		Scanner in = new Scanner(System.in);
		int n = 0;
		int s = 0;
		int f = 0;
		int e = 0;
		while (in.hasNextInt()){
			n = in.nextInt();
			s = Recursion.Summation(n);
			f = Recursion.Factorial(n);
			e = Recursion.Exponential(n,3);
			m.put(n,s);
			m1.put(n,f);
			m2.put(n,e);
		}
		in.close();

		System.out.println("Summation");
		Recursion.printHashMap(m);

		System.out.println("Factorial");
		Recursion.printHashMap(m1);

		System.out.println("Exponential");
		Recursion.printHashMap(m2);
	}

}
