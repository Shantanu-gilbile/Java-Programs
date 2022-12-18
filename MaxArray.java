class MaxArray
{
    public static void main(String args[])
    {
        int arr[]={2,5,3,6,1};
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number is : "+max);
    }
}
