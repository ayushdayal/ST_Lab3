package st.project;

public class Payroll {
    public static Double getPayroll(Double salary , Double expense){
        double tax=0 , surcharge=0;
        if(salary < 70000 && expense <= 30000)
            tax = 0.1* salary;
        if( salary >60000 && salary <=200000 && expense <=40000)
            tax = 0.2 * salary;
        if(salary > 200000)
            surcharge = 0.05 * salary;
        if(expense > 40000)
            surcharge = 0.09 * salary;
        return tax +surcharge;
    }

    public static void main(String[] args) {
        System.out.println(getPayroll(500000d,60000d));
    }
}
