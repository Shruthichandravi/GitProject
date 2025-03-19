package org.add;
public class GreensTech {
	// argument depend on datatype
	private void greensOmr(int id) {
		System.out.println("Id is "+id);
	}
	// argument depend on datatype count
	private void greensOmr(String name,long phone) {
		System.out.println("Name is "+name+"\nPhone is "+phone);
	}
	// argument depend on datatype order
	private void greensOmr(int student,String address) {
		System.out.println("Number of Students is"+student+"\nAddress is "+address);
	}
	private void method4() {
		System.out.println("4");
	}
	private void method5() {
		System.out.println("5");

	}
	private void method6() {
		System.out.println("6");

	}
	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOmr(20);
		g.greensOmr("Greens OMR branch", 8569782365l);
		g.greensOmr(50,"Chennai");
	}}
