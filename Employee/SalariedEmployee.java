package Employee;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String fName, String lName, String ssn, double weeklySalary){
        super(fName, lName, ssn);
        setWeeklySalary(weeklySalary);
        
    }

    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary < 0.0 ? 0.0 : weeklySalary;

    }
    
    
    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public double earnings(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("salaried employee: %s\n%s: $%, .2f", super.toString(), "weekly salary", getWeeklySalary());
    }

}
