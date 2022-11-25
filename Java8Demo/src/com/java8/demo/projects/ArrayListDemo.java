package com.java8.demo.projects;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(3,5,8,9,1);
		
		//list.forEach(System.out::println);
		
		//Collections.sort(list);  // sort data ascending order
		
		//list.forEach(System.out::println);
		
		//Collections.reverse(list);
		
		//list.forEach(System.out::println);
		
		//list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		//list.forEach(System.out::println);
		
		list.stream().filter(x->x%2==0)
		      .sorted().map(x->x*3)
		      .forEach(System.out::println);
		
		
	}
}
