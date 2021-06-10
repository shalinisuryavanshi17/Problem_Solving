/*Write a Java program to extract the name of the employee1 with minimum salary using PriorityQueue

sample input&output :
3//input: No.of employee1s 
Enter the details of employee1:1
20
4000
Manisha
Enter the details of employee1:2
25
5000
Sruthika
Enter the details of employee1:3
30
2000
Bhavitha
Bhavitha*/

import java.util.*;
class Employee1
{
    int age,sal;
    String name;
    Employee1(int a,int s,String n)
    {
        this.age=a;
        this.sal=s;
        this.name=n;
    }
}
class MyComparator1 implements Comparator<Employee1>  //descending comaparator
{
    // Write comparator logic here
    public int compare(Employee1 a,Employee1 b)
    {
       if(a.sal<b.sal)
       {
           return -1;
       }
       else if (a.sal>b.sal)
       {
           return 1;
       }
       return 0;
    }
}
class EmployeeSal
{
    public static void main(String args[])
    {
        
	MyComparator1 mc=new MyComparator1();
    PriorityQueue<Employee1> pq1=new PriorityQueue<Employee1>(mc);
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	    System.out.println("Enter the details of employee1:"+(i+1));
	  int age=sc.nextInt();
	  int sal=sc.nextInt();
	  String name=sc.next();
	  Employee1 m=new Employee1(age,sal,name);
	  pq1.add(m);
	}
	// Read the details of the 3 employee1s from user here: age,salary,name
    
    Employee1 m=pq1.poll();// call poll() method here;
    sc.close();
    System.out.println(m.name);
    }
}
