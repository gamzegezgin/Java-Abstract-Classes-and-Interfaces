package Employee;

public class BasePlusCommissionEmployee extends ComissionEmployee {
    
    private double baseSalary;

    public BasePlusCommissionEmployee(String fName, String lName, String ssn, double grossSales, double comissionRate, double baseSalary){
        super(fName, lName, ssn, grossSales, comissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = (baseSalary < 0.0) ? 0.0 : baseSalary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s %s; %s: $%, .2f", "base salaried", super.toString(), "base salary", getBaseSalary());
    }
}
