import java.io.FileReader;
import java.io.FileWriter;

public class FileChar{
    public void readFile(){
        try{

            FileReader fileReader = new FileReader("ShantanuCopy.txt");
            while(true){
                int i = fileReader.read();
                if(i == -1){
                    break;
                }System.out.print((char)i);
            }

        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void writeFile(){
        try{

            FileWriter fileWriter = new FileWriter("ShantanuCopy.txt",true);

            String data = "\nUsing File Writer";
            fileWriter.write(data);
            fileWriter.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}