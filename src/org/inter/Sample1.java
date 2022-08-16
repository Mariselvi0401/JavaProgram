package org.inter;

public class Sample1 implements LoginDetails {
	@Override
	public void userName() {
		System.out.println("Username:selvi@gmail.com");
		
	}
	@Override
	public void password() {
		System.out.println("124563");
		
	}
	@Override
	public void age() {
		System.out.println("age is:30");
		
	}
	@Override
	public void firstName() {
	System.out.println("Mariselvi");
		
	}
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.firstName();
		s1.age();
		s1.userName();
		s1.password();
	}

}
