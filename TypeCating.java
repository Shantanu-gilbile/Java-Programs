class TypeCasting
{
    public static void main(String args[])
    {

        //Implicit TypeCasting
        System.out.println("Explicit TypeCasting");
        int iNum = 10;
        float fNum = iNum;
        System.out.println("Integer : "+iNum+" Float : "+fNum);

        char cChar = 'A';
        int cInt = cChar;

        System.out.println("Char : "+cChar+" Int : "+cInt);

        //Explicit Type Casting
        System.out.println("Explicit TypeCasting");
        double dNum = 10.5;
        int dInt = (int)dNum;

        System.out.println("Double : "+dNum+" Integer : "+dInt);

        int ichar = 65;
        char cIn = (char)ichar;

        System.out.println("Integer : "+ichar+" Char : "+cIn);

    }
}