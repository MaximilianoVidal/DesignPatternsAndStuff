package serialization;

import java.io.FileWriter;
import java.io.IOException;
//write or overwrite a file text, also if the file name doesn't exist, it'll create a new one
public class writFile {
    public static void main(String[] args) {
        writing willSee =new writing();
        willSee.write();

    }
    static  class writing{
        public void write(){
            String phrase="This is a writing test";
            try {
                FileWriter writer = new FileWriter("E:\\OneDrive\\Desktop\\primerejemplo.txt",true);
                for (int i=0;i<phrase.length();i++){
                    writer.write(phrase.charAt(i));
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
