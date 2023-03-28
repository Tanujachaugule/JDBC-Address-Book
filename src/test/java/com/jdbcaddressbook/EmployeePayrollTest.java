package com.jdbcaddressbook;


import org.junit.Assert;
import org.junit.Test;
public class EmployeePayrollTest {
    EmployeePayrollObj employeePayrollObj = new EmployeePayrollObj();
    @Test
    public void  afterUpdatingSalaryShouldReturnTrue() throws Exception{
        JDBConnection con = new JDBConnection();
        Assert.assertEquals(300000.0, con.getSalaryFromJDBC("Tanuja"), 0.0);
    }

}
