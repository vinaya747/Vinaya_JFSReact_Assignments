package CoreJavaAssignment2;


import java.util.Scanner;
public class Q2 {
	public static void main(String args[]) {
	Manager manager = new Manager();
	 Labour labour = new Labour();
	 
	 manager.addSalary();
	 manager.addIncentive();
	 
	 labour.addSalary();
	 labour.addOverTime();
	 
	 manager.salary();
	 labour.salary();
}

}

class Employee{

int salary;
Scanner sc = new Scanner(System.in);
public void salary() {
	System.out.println(salary);
}	
}

class Manager extends Employee{
int incentive;

public void addSalary() {
	System.out.println("Enter salary to add for Manager:");
	salary= sc.nextInt();
}
public void addIncentive() {
	System.out.println("Add incentive:");
	incentive = sc.nextInt();
}
public void salary() {
	System.out.println("Salary of Employee : "+(salary+incentive));
}
}


class Labour extends Employee{

int overTime;

public void addSalary() {
	System.out.println("Enter salary to add for Labour:");
	salary= sc.nextInt();
}
public void addOverTime() {
	System.out.println("Add over time:");
	overTime = sc.nextInt();
}
public void salary() {
	System.out.println("Salary of Labour : "+(salary+overTime));
}
}

