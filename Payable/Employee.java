package Payable;

public abstract class Employee implements Payable {
   //burası bir abstract class oldugu için ınterfacein metodunu uygulamak zorunda degildir.
    private String fName;
    private String lName;
    private String ssn;

    public Employee(String fName, String lName, String ssn){
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn; 
    }

    public void setFName(String fName){
        this.fName=fName;
    }

    public String getFName(){
        return  fName;
    }

    public void setLName(String lName){
        this.lName=lName;
    }

    public String getLName(){
        return lName;
    }

    public void setSNN(String ssn){
        this.ssn=ssn;
    }

    public String getSSN(){
        return ssn;
    }

    @Override
    //sout(employee) dedigimizde düzgün çıktı almamızı sağlar
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
        getFName(), getLName(), getSSN() );
    }
}
