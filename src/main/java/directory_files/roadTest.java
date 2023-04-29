package directory_files;


import java.io.File;

public class roadTest {
    public static void main(String[] args) {
        //if the path is not described,java will look were the package is located
        File file = new File("E:\\OneDrive\\Desktop\\java streams\\madeUp.dat");
        System.out.println(file.getAbsolutePath());//obtains the absolut path of the file
        System.out.println(file.exists());//returns a boolean, if is or if is not a file
    }

}
