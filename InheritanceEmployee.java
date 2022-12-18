class InheritanceEmployee extends InheritancePerson
{
    public int rollNo;
    public String div;
    public float percentage;

    public InheritanceEmployee(int rollNo,String div,float percentage)
    {
        super("Shantanu","Pune",19);
        this.rollNo=rollNo;
        this.div=div;
        this.percentage=percentage;  
        displayEmployee();

    }

    public void displayEmployee(){
        System.out.println("Roll no : "+rollNo);
        System.out.println("Division : "+div);
        System.out.println("Percentage : "+percentage);
    }
}