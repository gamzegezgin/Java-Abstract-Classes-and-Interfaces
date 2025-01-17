package Employee;

public abstract class Employee {
    private String fName;
    private String lName;
    private String ssn;

    //construction tanımladım
    public Employee(String fName, String lName, String ssn){
        this.fName=fName;
        this.lName=lName;
        this.ssn=ssn;
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

    //sout(employee) dedigimizde düzgün çıktı almamızı sağlar
    public String toString(){
        return String.format("%s %s\nsocial security number: %s",
        getFName(), getLName(), getSSN() );
    }

    //subclasslara aktarmak ve orada override etmek için abstract metod tanımladık
    public abstract double earning();


}
