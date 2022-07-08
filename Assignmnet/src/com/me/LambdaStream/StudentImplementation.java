package com.me.LambdaStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentImplementation {
public static Student getHighestPercent(ArrayList<Student>list){
	
	Student stud=list.stream().max((x, y) -> (int)(x.getPercent()-y.getPercent())).get();

            

	return stud;
}
public static Map<String,Long> CountOfBranchStudent(String branch,List<Student>list) {
	Map<String,Long>students=new HashMap<>();
	long count=0;
	
	List<String>categ=list.stream().filter((n)->n.getBranch().equalsIgnoreCase(branch)).map((n)->n.getBranch()).collect(Collectors.toList());
	
	for(String cat:categ) {
		count=list.stream().filter((n)->n.getBranch().equalsIgnoreCase(cat)).count();
		students.put(cat,count);
	}
	return students;
}
public static ArrayList<Student> listOfStudent(List<Student>list) {
	
	List<Student>filtered =list.stream().filter((n)->n.getPercent()<90).collect(Collectors.toList());
	 ArrayList<Student>array=new ArrayList<>();
	 array.addAll(filtered);
	return array;
	
}
public static ArrayList<String> Studentnames(List<Student>list) {
	
	List<String>names =list.stream().filter((n)->n.getPercent()>80).map((n)->n.getName()).collect(Collectors.toList());
	ArrayList<String>name=new ArrayList<>();
	name.addAll(names);
	return name;
	
}
public static Map<String,Long> CountofBranch(ArrayList<Student>list) {
	Map<String,Long>branches=new HashMap<>();
	long count=0;
	
	List< String>branch=list.stream().filter((n)->n.getBranch().equalsIgnoreCase("electrical enng")).map((n)->n.getBranch()).collect(Collectors.toList());
	for(String string:branch) {
		count=list.stream().filter((n)->n.getBranch().equalsIgnoreCase(string)).count();
		 branches.put(string,count);
	}
	
	return branches;
	
	
}
public static ArrayList<Student> AStudentName(ArrayList<Student>list) {
	
	ArrayList<Student>productnames=(ArrayList<Student>) list.stream().filter((n)->n.getName().startsWith("A")||n.getName().startsWith("a")).collect(Collectors.toList());
	return productnames;
}
}
