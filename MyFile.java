import java.io.File;

class MyFile{
    public static void main(String[] args) 
    {
        File file  =new File("Java");

        // System.out.println(file.exists());

        if(file.exists() && file.isDirectory())
        {
            System.out.println("Number of Files present are : "+file.listFiles().length);
            System.out.println("Total Number of Character "+file.length());
            
        }
    }
}
