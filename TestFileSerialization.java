import java.io.IOException;

class TestFileSerialization{
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileSerialization fileSerialization = new FileSerialization();
        fileSerialization.writeFile();

        fileSerialization.readFile();
    }
}