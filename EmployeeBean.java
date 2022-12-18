import java.io.Serializable;
class EmployeeBean implements Serializable{

    //Data Members
    private int empId;
    private String empName;
    private double empSalary;
    // private static int objCount ;
    // private static String company = "DYP";


    

    //Setter Methods
    // EmployeeBean(){
    //     objCount++;
    //     System.out.println("Object Created : "+objCount);
        
    // }
    public EmployeeBean(int empId, String empName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }



    public int getEmpId() {
        return empId;
    }



    public void setEmpId(int empId) {
        this.empId = empId;
    }



    public String getEmpName() {
        return empName;
    }



    public void setEmpName(String empName) {
        this.empName = empName;
    }



    public double getEmpSalary() {
        return empSalary;
    }



    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
   
    
    

//    public static void showCompany(){
//         System.out.println("Company : "+company);
//     }
}