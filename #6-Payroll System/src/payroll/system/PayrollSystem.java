package payroll.system;

import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
        long empNo;
        String empName;
        double hourSalary, weeklyTime, weeklySalary, overTime;
        double regPay, overtimePay, netPay;
        
        System.out.printf("Enter Employee Number : ");
        empNo = in.nextLong();
        
        System.out.printf("Enter Hourly Salary : ");
        hourSalary = in.nextDouble();
        
        System.out.printf("Enter Weekly Time : ");
        weeklyTime = in.nextDouble();
        
        //Employee Data
        
        if (empNo == 10001) {
            empName = "John";
        }
        
        else if (empNo == 10002) {
            empName = "Mark";
        }
        
        else if (empNo == 10003) {
            empName = "Herb";
        }
        
        else if (empNo == 10004) {
            empName = "Timothy";
        }
        
        else {
            empName  = "Unknown Employee";
            
        }
        
        if (weeklyTime < 100) {
            weeklySalary = weeklyTime;
            overTime = 0;
            regPay = hourSalary * weeklyTime;
            overtimePay = 0;
            netPay = regPay;
        }
        
        else {
            weeklySalary = 200;
            overTime = weeklyTime - 40;
            regPay = hourSalary * weeklySalary;
            overtimePay = hourSalary * overTime;
            netPay = regPay + overtimePay;
        }
        
        System.out.println("-----------------------");
        System.out.println("=====PAYROLL SYSTEM=====");
        System.out.println("-----------------------");
        System.out.printf("Employee Number : %d\n", empNo);
        System.out.println("Employee Name : " + empName);
        System.out.println("Hourly Salary : " + hourSalary);
        System.out.println("Weekly Time : " + weeklyTime);
        System.out.println("Regular Pay : "+ regPay);
        System.out.println("Overtime Pay : " + overtimePay);
        System.out.println("Net Pay : " + netPay);
        
    }

}
