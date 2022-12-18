public class Example {
    public static void main(String[] args) {

       Shantanu sh = new Shantanu(1,"Shantanu", 50000);
        System.out.println(sh.annualSalary());
    }
}

class Shantanu{
    public int employeeId;
    public String employeeName;
    public int employeeSalary;
    Shantanu (int employeeId,String employeeName,int employeeSalary){
        this.employeeId = employeeId;  
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public int annualSalary(){
        return(this.employeeSalary*12);
    }
}