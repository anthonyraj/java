package com.araj.datastructures;

class StringManipulation {

	public void find(String inputString, String strToFind) {
		System.out.println("inputString: " + inputString);
		System.out.println("strToFind: " + strToFind);

		String[] checkIfPresent = inputString.split(strToFind);
		System.out.println("checkIfPresent="+checkIfPresent.length);

		if (checkIfPresent.length>=2) {
			System.out.println(strToFind + " string present");
		}
		System.out.println("---");
	}


	public static void main(String[] args) {
		StringManipulation m = new StringManipulation();
		String pandas = "The Pandas are cute creatures. Do you like Pandas?";	
		m.find(pandas,"Pandas");


		String fishes = pandas.replace("Pandas","Fishes");
		fishes += "Heres more to our Acquatic Fishes life !! Fishes x Fishes = more Fishes :)";
		m.find(fishes, "Fishes");
	}
}
