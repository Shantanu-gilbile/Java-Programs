
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class FileSerialization{
    public void writeFile(){
        try{

            FileOutputStream fileOutPutStream = new FileOutputStream("Shantanu.txt",true);
            ObjectOutputStream ObjectOutputStream = new ObjectOutputStream(fileOutPutStream);

            EmployeeBean employeeBean = new EmployeeBean(101, "Shantanu", 60000);      
            
            
            ObjectOutputStream.writeObject(employeeBean);

            ObjectOutputStream.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void readFile() throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("Shantanu.txt");
        ObjectInputStream objectInput = new ObjectInputStream(fileInputStream);

        EmployeeBean employeeBean = (EmployeeBean)objectInput.readObject();
        System.out.println(employeeBean);
        objectInput.close();
        fileInputStream.close();


    }
}

