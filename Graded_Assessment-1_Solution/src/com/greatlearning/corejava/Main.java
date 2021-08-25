package com.greatlearning.corejava;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj1 = new AdminDepartment();
		System.out.println("Welcome to " + obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

		HrDepartment obj2 = new HrDepartment();
		System.out.println(" ");
		System.out.println("Welcome to " + obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());

		TechDepartment obj3 = new TechDepartment();
		System.out.println(" ");
		System.out.println("Welcome to " + obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());
	}
}