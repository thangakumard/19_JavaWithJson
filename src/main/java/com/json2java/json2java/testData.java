package com.json2java.json2java;

import java.util.Iterator;

public class testData {

	public Data[] data;
	public String testcase;
	public String type;
	
	public class Data implements Iterable<Data> {
		
		public String address;
		public String name;
		public Phone[] phones;
		public Iterator<Data> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	public class Phone implements Iterable<Data>{
		public int phone_no;

		public Iterator<Data> iterator() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}


