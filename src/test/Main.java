package test;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
	/*	Abstractnij abs = new AbctractImpl();
		abs.m1();
		AbctractImpl absImpl = new AbctractImpl(10);
		absImpl.m2();

		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(100, null);
		map.put(null, 1);
		map.put(null, 2);
		map.put(0, 3);
		
		System.out.println(map.get(100));
		System.out.println(map.get(0));
		*/
		
		Singleton s1= Singleton.getInstance;
		Singleton s2= Singleton.getInstance;
		System.out.println(s1==s2);
		
	}

}
