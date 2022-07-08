package com.me.LambdaStream;

import java.util.ArrayList;
import java.util.List;


public class HackerrankClass {
	

	public static void main(String[] args) {
List<Integer>list=new ArrayList<>();
list.add(1);
list.add(2);
for(Integer num:list) {

	int square=num*num;
	System.out.println(square);
} list.stream().map((n)->n*n).forEach(n->System.out.println(n));

long integer=list.stream().count();
System.out.println(integer);
	}

}
