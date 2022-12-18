class TestAggregation{
    public static void main(String args[]){
        AggregationDept aggregationDept = new AggregationDept();
        AggregationEmp aggregationEmp = new AggregationEmp(aggregationDept);
        AggregationEmp aggregationEmp1 = new AggregationEmp(aggregationDept);

        aggregationEmp.setEmpId(101);
        aggregationEmp.setEmpName("Shantanu");
        aggregationEmp.setEmpSalary(60000);

        aggregationEmp1.setEmpId(102);
        aggregationEmp1.setEmpName("Pratik");
        aggregationEmp1.setEmpSalary(65000);

        aggregationDept.setDeptName("AI&DS");
        aggregationDept.setDeptid(1);

        System.out.println("Employee Details");
        System.out.println(aggregationEmp.getEmpId()+" "+aggregationEmp.getEmpName()+" "+aggregationEmp.getEmpSalary());
        System.out.println("Department Assigned");
        System.out.println(aggregationEmp.aggregationDept.getDeptId()+" "+aggregationEmp.aggregationDept.getDeptName());

        System.out.println("Employee Details");
        System.out.println(aggregationEmp1.getEmpId()+" "+aggregationEmp1.getEmpName()+" "+aggregationEmp1.getEmpSalary());
        System.out.println("Department Assigned");
        System.out.println(aggregationEmp1.aggregationDept.getDeptId()+" "+aggregationEmp1.aggregationDept.getDeptName());

        
    }
}