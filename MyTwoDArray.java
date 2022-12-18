class MyTwoDArray
{
    public static void main(String args[])
    {
        int num[][]={{1,2,3,4},{6,7,8,9},{10,11,12,13}};  //Declaration

        for(int row=0;row<num.length;row++)
        {
            for(int col=0;col<num[row].length;col++)
            {
                System.out.print(num[row][col]+" ");
            }
            System.out.println(" ");
        }
    }
}
