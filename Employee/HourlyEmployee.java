package Employee;

public class HourlyEmployee extends Employee{
    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String fName, String lName, String ssn, double hourlyWage, double hoursWorked){
        super(fName, lName, ssn);
        setHourlyWage(hourlyWage);
        setHoursWorked(hoursWorked);
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = (hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = ((hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0) )? hoursWorked : 0.0;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }

    public double earnings(){
        if (getHoursWorked() <= 40 )
            return getHourlyWage()*getHoursWorked();
        else
            return 40*getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
    }

    public String toString(){
        return String.format("hourly employee: %s\n%s: $%, .2f; %s %, .2f", super.toString(), "hourly wage", getHourlyWage(), "hours worked", getHoursWorked());
    }
}
