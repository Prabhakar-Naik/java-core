package com.springboot.core.arrays;

/**
 * @author prabhakar, @Date 16-09-2024
 */
public class ArrayEmployee {

    public static void main(String[] args) {


        //I am taking size is fixed 5 employee details

        int[] ids = {101, 102, 103, 104, 105};
        String[] names = {"prabha", "srinu", "shivraj", "vishnu", "kannababu"};
        double[] salaries = {40000, 35000, 40000, 53000, 48000};
        int[] dept = {10, 20, 30, 40, 30};
        String[] location = {"hyderabad", "pune", "guntur", "bengalore", "pune"};

        System.out.println("All Employees Details: ");
        for (int i = 0; i < ids.length; i++) {

            System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);

        }

        System.out.println("All Employees Details in Reverse order: ");
        for (int i = ids.length - 1; i >= 0; i--) {

            System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);
        }

        System.out.println("Employee Details with id 102: ");
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == 102) {
                System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);
            }
        }

        System.out.println("Employees Belongs to department no 30: ");

        for (int i = 0; i < dept.length; i++) {

            if (dept[i] == 30) {
                System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);
            }
        }

        System.out.println("Employees belongs to pune location: ");

        for (int i = 0; i < location.length; i++) {
            if (location[i].equals("pune")) {
                System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);
            }
        }

        System.out.println("Employees who's salary is 40000");
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] == 40000) {
                System.out.println("Employee ID: " + ids[i] + " Employee Name: " + names[i] + " Employee Salary: " + salaries[i] + " Employee Department: " + dept[i] + " Employee Location: " + location[i]);
            }
        }

        System.out.println("Total amount of Employees salary in between 30000 to 40000");
        int TotalAmount = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] >= 30000 && salaries[i] <= 48000) {
                TotalAmount += salaries[i];
            }
        }
        System.out.println("Total Amount: " + TotalAmount);
    }
}
