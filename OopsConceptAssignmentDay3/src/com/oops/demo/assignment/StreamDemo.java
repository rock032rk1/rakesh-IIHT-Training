package com.oops.demo.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(3,6,9,1,2,7);
		
		Stream<Integer> data=list.stream();
		
		data.forEach(x->System.out.println("Fetching list using Stream API "+x));
		
		System.out.println("==================================");
		
		//System.out.println("COunt "+data.count());
		
		list.stream().filter(x->x%2==0)
		        .sorted().map(x->x*3).forEach(x->System.out.println(x));
	}
}
