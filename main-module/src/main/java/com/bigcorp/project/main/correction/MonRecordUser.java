package com.bigcorp.project.main.correction;

public class MonRecordUser {

	public static void main(String[] args) {
		Child jeanKevin = new Child("Jean-Kevin", 12);
		
		MonRecord monRecord1 = new MonRecord("Jean", 120, 30, jeanKevin);
		System.out.println("Mon record a l'age : " + monRecord1.age());
		
		System.out.println(monRecord1.toString());

		MonRecord monRecord2 = new MonRecord("Jean", 120, 30, jeanKevin);
		
		System.out.println("MonRecord1 == monRecord2 : "+ (monRecord1 == monRecord2));
		System.out.println("MonRecord1.equals(monRecord2) : "+ monRecord1.equals(monRecord2));
		System.out.println("MonRecord1.hashCode : "+ monRecord1.hashCode());
		System.out.println("MonRecord2.hashCode : "+ monRecord2.hashCode());
		MonRecord monRecord3 = new MonRecord("Jean", 120, 31, jeanKevin);
		System.out.println("MonRecord3.hashCode : "+ monRecord3.hashCode());
		
	}

}
