class ArrayEmp implements Comparable<ArrayEmp>{
    public static Object[] list;
    private int empId;
    private String empName;
    private double empSalary;
    

    @Override
    public String toString() {
        return "ArrayEmp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
    }

    //Setter Methods
    ArrayEmp(int empId,String empName,double empSalary){
        this.empId=empId;
        this.empName = empName;
        this.empSalary = empSalary;

        
    }
    
    public void setEmpId(int empId)
    {

        this.empId=empId;
    }

    public void setEmpName(String empName)
    {
        this.empName=empName;
    }

    public void setEmpSalary(double empSalary)
    {
        this.empSalary=empSalary;
    }

    //Getter Methods
    public int getEmpId()
    {
        return empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public double getEmpSalary()
    {
        return empSalary;
    }

    @Override
    public int compareTo(ArrayEmp emp) {
        if(empId > emp.empId){
            return 1;
        }
        else if(empId < emp.empId){
            return -1;
        }else{
            return 0;
        }
        
    }

}