class InheritancePerson
{
    public String pName;
    public String pAddress;
    public int pAge;

    public InheritancePerson(String pName,String pAddress,int pAge){
        this.pName=pName;
        this.pAddress=pAddress;
        this.pAge=pAge;

        displayPerson();
        
    }

    public void displayPerson(){
        System.out.println("Name :"+pName);
        System.out.println("Address : "+pAddress);
        System.out.println("Age : "+pAge);
    }

}