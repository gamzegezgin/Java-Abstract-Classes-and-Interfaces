package Employee;

public class PayrollSystemTest {
    
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("john", "smith", "1-333-4", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("kaern", "price", "33-455-5", 16.75, 40);
        ComissionEmployee comissionEmployee = new ComissionEmployee("julia", "robii", "333-454-3", 10000, 0.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("holly", "molly","121-4335-3" ,  5000, 0.04, 300);
    
        System.out.println("Employees processed individually: \n");

        System.out.printf("%s\n%s: $%, .2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%, .2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%, .2f\n\n", comissionEmployee, "earned", comissionEmployee.earnings());
        System.out.printf("%s\n%s: $%, .2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        Employee employees[] = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = comissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.println("Employees processeed polymorphically:\n");

        for (Employee currentEmployee: employees){
            System.out.println(currentEmployee);

            if(currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10*oldBaseSalary);
                System.out.printf("new base salary with 10 %% increase is: $%, .2f\n",
                employee.getBaseSalary());
            }

            System.out.printf("eaarned $%, .2f\n\n", currentEmployee.earnings());
        }

        for (int j= 0; j< employees.length; j++ )
            System.out.printf("Employee %d is a %s \n", j, employees[j].getClass().getName());
    }
}
