package Employee;

public class ComissionEmployee extends Employee {
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String fName, String lName, String ssn, double grossSales, double comissionRate){
        super(fName, lName, ssn);
        setGrossSales(grossSales);
        setComissionRate(comissionRate);
    }

    public void setGrossSales(double grossSales){
        this.grossSales = (grossSales < 0.0) ? 0.0 : grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setComissionRate(double comissionRate){
        this.comissionRate = (comissionRate > 0.0 && comissionRate < 1.0) ? comissionRate: 0.0;
    }

    public double getComissionRate(){
        return comissionRate;
    }

    @Override
    public double earnings(){
        return getComissionRate()*getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%, .2f; %s: %.2f", "comission employee", super.toString(), "gross sales", getGrossSales(), "comission rate", getComissionRate());
    }
    
    
}
