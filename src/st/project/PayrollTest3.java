package st.project;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayrollTest3 {

    void createAndAssert(Double salary , Double expences , Double expectedValue){
        Double actualValue= Payroll.getPayroll(salary,expences);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @org.junit.jupiter.api.Test
    void getPayroll_decision_table_1() {
        createAndAssert(30000d,5000d ,3000d);
    }   
    @org.junit.jupiter.api.Test
    void getPayroll_decision_table_2() {
        createAndAssert(120000d,10000d ,24000d);
    }
    @org.junit.jupiter.api.Test
    void getPayroll_decision_table_3() {
        createAndAssert(500000d,30000d ,25000d);
    }
    @org.junit.jupiter.api.Test
    void getPayroll_decision_table_4() {
        createAndAssert(500000d,60000d ,45000d);
    }
}