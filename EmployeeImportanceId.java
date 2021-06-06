/*
Create a data structure of employee information, which includes the employee's unique id, their importance value, and their direct subordinates' id.

You are given an array of employees employees where:

employees[i].id is the ID of the ith employee.
employees[i].importance is the importance value of the ith employee.
employees[i].subordinates is a list of the IDs of the subordinates of the ith employee.
Given an integer id that represents the ID of an employee, return the total importance value of this employee and all their subordinates.

 Example 1

 Input: employees = [[1,5,[2,3]],[2,3,[]],[3,3,[]]], id = 1
Output: 11
Explanation: Employee 1 has importance value 5, and he has two direct subordinates: employee 2 and employee 3.
They both have importance value 3.
So the total importance value of employee 1 is 5 + 3 + 3 = 11.

Example 2
Input: employees = [[1,2,[5]],[5,-3,[]]], id = 5
Output: -3

case=1
input = 3 3
1 5
2 3
2 3
0
3 3
0
1
output=1

 */
import java.util.*;

class Employee {
    public int id;
    public int imp;
    public ArrayList<Integer> sub;

    public Employee(int id, int imp, ArrayList<Integer> sub) {
        this.id = id;
        this.imp = imp;
        this.sub = sub;
    }

    public Employee() {

    }

    // void displayData(ArrayList<Employee> list) {
    // System.out.println("Employee Details");
    // for (Employee emp : list) {
    // System.out.println("Employee id: " + emp.id);
    // System.out.println("Employee imp: " + emp.imp);
    // System.out.println("Employee sub: " + emp.sub);
    // }
    // }
};

public class EmployeeImportanceId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nEmp = sc.nextInt();
        int req_id = sc.nextInt();
        Employee temp = new Employee();
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < nEmp; i++) {
            int emp_id = sc.nextInt();
            int emp_imp = sc.nextInt();
            sc.nextLine();
            ArrayList<Integer> emp_sub = new ArrayList<>();
            String s = sc.nextLine();
            if (s.equals("0"))
                emp_sub = new ArrayList<>();
            else {
                String sub[] = s.split(" ");
                for (String j : sub)
                    emp_sub.add(Integer.parseInt(j));
            }
            Employee e = new Employee(emp_id, emp_imp, emp_sub);
            employees.add(e);
        }

        // temp.displayData(employees);
        System.out.println(empImportance(employees, req_id));
    }

    public static int empImportance(List<Employee> emp, int id) {

        Map<Integer, Employee> hm = new HashMap<>();
        for (Employee e : emp)
            hm.put(e.id, e);
        return subImportance(id, hm);
    }

    public static int subImportance(int id, Map<Integer, Employee> hm) {
        int res = hm.get(id).imp;
        for (int i : hm.get(id).sub)
            res = res + subImportance(i, hm);
        return res;
    }

}
