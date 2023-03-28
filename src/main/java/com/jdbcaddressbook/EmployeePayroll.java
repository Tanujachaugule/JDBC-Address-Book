package com.jdbcaddressbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class EmployeePayroll {
    public static void main(String[] args) throws Exception{
        JDBConnection con = new JDBConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = -1;
        while (choice!=0){
            System.out.println("Enter your choice:\n1. DISPLAY EMPLOYEE PAYROLL\n0. EXIT");
            choice = Integer.parseInt(br.readLine());
            switch (choice){
                case 1: con.display();
                    break;
                case 0: choice=0;
                    con.close();
            }
        }
    }

}
