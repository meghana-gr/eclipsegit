package com.me.LambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student(1,"ajay",87,"electrical enng"));
		list.add(new Student(2,"mrudul",78,"electrical enng"));
		list.add(new Student(3,"sharma",98,"computer enng"));
		
		Student students=StudentImplementation.getHighestPercent(list);
		System.out.println("student with highest percent");
		System.out.println(students);
		System.out.println("--");
		
		System.out.println("enter branch name");
		String branch=scan.nextLine();
	
		
		Map<String,Long>candidates=StudentImplementation.CountOfBranchStudent(branch,list);
		System.out.println("count of students in a branch");
		System.out.println(candidates);
		System.out.println("--");
		
		ArrayList<Student> filtered=StudentImplementation.listOfStudent(list);
		System.out.println("students who got less than 90 percent");
		System.out.println(filtered);
		System.out.println("--");
		
		List<String>student=StudentImplementation.Studentnames(list);
		System.out.println("students who got above 80 percent");
		 System.out.println(student);
		 System.out.println("--");
		 
		Map<String,Long>count=StudentImplementation.CountofBranch(list);
		System.out.println("students count in electrical enng branch");
		System.out.println(count);
		System.out.println("--");
		
		ArrayList<Student> name=StudentImplementation.AStudentName(list);
		System.out.println("student name start with 'a'");
		System.out.println(name);
	}

}
