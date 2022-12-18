class AggregationEmp
{

    private int empId;
    private String empName;
    private double empSalary;
    public AggregationDept aggregationDept;

    
    AggregationEmp(AggregationDept aggregationDept)
    {
        this.aggregationDept=aggregationDept;    
    }

    //Setter Methods

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

   
}