package com.sunbeam;
import java.util.Objects;

import java.util.*;
public class q4 
{
		private int id;
		private String name;
		private int salary;
	   
		public q4(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "q3 [id=" + id + ", name=" + name + ", slary=" + salary + "]";
		}
	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			q4 other = (q4) obj;
			return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
		}

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 q4[] emp = {
			            new q4(1, "John", 500),
			            new q4(2, "cena", 60000),
			            new q4(3, "Alice", 55000),
			            new q4(4, "Bob", 52000)
			        };
			Scanner sc = new Scanner(System.in);
			int choice;
			do {
		     System.out.println("1 emp id"); 
		     System.out.println("2 emp name");
		     System.out.println("3 emp salary");
		     System.out.println("enter choice");
		     choice = sc.nextInt();
			 switch(choice) {
			 case 0:
				 System.out.println("exit =========");
				 break;
			 case 1 :
			 System.out.println("enter emp id ");
//			   Scanner sc = new Scanner(System.in);
			   int idval = sc.nextInt();
		
			   for(int i = 0; i<emp.length; i++) {
				   if(emp[i].id == idval) {
					   System.out.println("emp "+emp[i]); 
					   break;
					   }else {
						   System.out.println("emp id not present"); 
						   break;
					   }
			   }
			   break;
			 case 2:
			   System.out.println("enter emp name ");
			   String empName = sc.next();
			
			  System.out.println("str"+empName); 
			   for(int i = 0; i<emp.length; i++) {
			
				   if(emp[i].name.equals(empName)) {
					   System.out.println("emp "+ emp[i]); 
					   break;
					   }else {
						   System.out.println("empName not present"); 
						  
					   }
			   }
			   break;
			 case 3:
			   System.out.println("enter emp salary ");
			   int empSalary = sc.nextInt();
			   for(int i = 0; i<emp.length; i++) {
				   if(emp[i].salary == empSalary) {
					   System.out.println("emp "+ emp[i]);  
					   break;
					   }else {
						   System.out.println("empSalary not present");  
						   break;
					   }
			   }
			   break;
			   default:
				   System.out.println("invalid option");
				   
			 }
			}while(choice != 0);
			   


			
	}

	

}
