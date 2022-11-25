package com.java8.demo.projects;
@FunctionalInterface
interface ABC{
	
	void show();
	
}

//class Test implements ABC{
//
//	@Override
//	public void show() {
//		
//		System.out.println("method imple from ABC");
//	}
//	
//}

public class TestDemo {

	public static void main(String[] args) {
		
		//ABC abc=new Test();
//		ABC abc=new ABC() {
//			
//			public void show() {
//				
//				System.out.println("method imple from ABC");
//			}
//		};
		
		ABC abc=()->System.out.println("method using java 8");
		
		abc.show();
	}
}
