class MaxSalary{
    public int empId;
    public String empName;
    public int empSalary;

    MaxSalary(int empId,String empName,int empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    
    public void display(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Employee Name : "+empName);
        System.out.println("Employee Salary : "+empSalary);

    }

    

}
