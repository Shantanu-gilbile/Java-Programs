import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadWrite
{
    public void readFile()
    {
        try{
            FileInputStream fileInputStream = new FileInputStream("Shantanu.txt"); // Open file in Read Mode
            while(true)
            {
                int i = fileInputStream.read();
                if(i ==-1){  //To get the End of File
                    break;
                }
                System.out.print((char)i);
            }

            fileInputStream.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void writeFile()
    {
        try{
            //FileOutputStream fileOutputStream = new FileOutputStream("Shantanu.txt"); //Open File in Read Mode(But it will override all the data)
            FileOutputStream fileOutputStream = new FileOutputStream("Shantanu.txt",true);
            String data = " \nHello Shantanu";
            fileOutputStream.write(data.getBytes());


        }catch(Exception e){
            System.out.println(e);
        }
    }


    public void copyFile()
    {
        try{
            FileInputStream fileInputStream = new FileInputStream("Shantanu.txt");
            FileOutputStream fileOutputStream = new FileOutputStream("ShantanuCopy.txt");

            while(true)
            {
                int i = fileInputStream.read();
                if(i==-1){
                    break;
                }
                fileOutputStream.write(i);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}