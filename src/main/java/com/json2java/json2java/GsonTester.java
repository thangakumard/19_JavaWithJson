package com.json2java.json2java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.json2java.json2java.testData.Data;
import com.json2java.json2java.testData.Phone;

public class GsonTester { 
	   public static void main(String[] args) { 
		  convertJsonToObject();
	      convertJsonArrayToObject();
	   } 
	   
	   public static void convertJsonToObject() {
		   String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
		      
		      GsonBuilder builder = new GsonBuilder(); 
		      builder.setPrettyPrinting(); 
		      
		      Gson gson = builder.create(); 
		      Student student = gson.fromJson(jsonString, Student.class); 
		      System.out.println(student);    
		      
		      jsonString = gson.toJson(student); 
		      System.out.println(jsonString);  
	   }
	   public static void convertJsonArrayToObject() {
		   String input = "[\n" + 
		   		"  {\n" + 
		   		"    \"data\": [\n" + 
		   		"      {\n" + 
		   		"        \"address\": \"sfo\",\n" + 
		   		"        \"name\": \"name1\",\n" + 
		   		"        \"phones\": [\n" + 
		   		"          {\n" + 
		   		"            \"phone_no\": \"123\"\n" + 
		   		"          },\n" + 
		   		"          {\n" + 
		   		"            \"phone_no\": \"456\"\n" + 
		   		"          }\n" + 
		   		"        ]\n" + 
		   		"      }\n" + 
		   		"    ],\n" + 
		   		"    \"testcase\": \"test1\",\n" + 
		   		"    \"type\": \"type1\"\n" + 
		   		"  },\n" + 
		   		"  {\n" + 
		   		"    \"data\": [\n" + 
		   		"      {\n" + 
		   		"        \"address\": \"lax\",\n" + 
		   		"        \"name\": \"name2\",\n" + 
		   		"        \"phones\": [\n" + 
		   		"          {\n" + 
		   		"            \"phone_no\": \"789\"\n" + 
		   		"          },\n" + 
		   		"          {\n" + 
		   		"            \"phone_no\": \"111\"\n" + 
		   		"          }\n" + 
		   		"        ]\n" + 
		   		"      }\n" + 
		   		"    ],\n" + 
		   		"    \"testcase\": \"test2\",\n" + 
		   		"    \"type\": \"type2\"\n" + 
		   		"  }\n" + 
		   		"]";
		   
		   GsonBuilder builder = new GsonBuilder();
		   builder.setPrettyPrinting();
		   
		   Gson gson = builder.create();
		   testData[] tdata = gson.fromJson(input, testData[].class);
		   for(testData td: tdata) {
			   for(Data d: td.data) {
				   for(Phone p: d.phones) {
					   System.out.println(p.phone_no);
				   }
			   }
		   }
				   
		   
	   }
	}

class Student { 
	   private String name; 
	   private int age; 
	   public Student(){} 
	   
	   public String getName() { 
	      return name; 
	   }
	   
	   public void setName(String name) { 
	      this.name = name; 
	   } 
	   
	   public int getAge() { 
	      return age; 
	   }
	   
	   public void setAge(int age) { 
	      this.age = age; 
	   }
	   
	   public String toString() { 
	      return "Student [ name: "+name+", age: "+ age+ " ]"; 
	   }  
	}
