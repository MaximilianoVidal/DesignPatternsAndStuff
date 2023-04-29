package reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//read a file
public class filesAccess {
    public static void main(String[] args) throws IOException {
        //calls the class witch has a method
        ReadFiles access= new ReadFiles();
        //put on action the read command
        access.read();

    }
    static class ReadFiles{
        public void read() throws IOException {
            FileReader entrant= new FileReader("E:\\OneDrive\\Desktop\\primerejemplo.txt");
            BufferedReader mybuffer= new BufferedReader(entrant);
            String line="";
            while (line!=null){
                line=mybuffer.readLine();
                if(line != null)
                System.out.println(line);

            }
        }

    }


}
