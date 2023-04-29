package ReadAndWritingBytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//read the follow file, in this case a jpg. return the amount of bytes. store on a count variable,printed. and then load
// save in a new array
public class Read_Write {
    public static void main(String[] args) {
        int count = 0;// count variable. int type

        int[] dataEntrant = new int[23528];// new array

        try{// try catch if the file address is not found
            FileInputStream file_reading= new FileInputStream("E:\\OneDrive\\Desktop\\40053-c.jpg");// create a variable to deposit
            // the file
            boolean final_ar= false;// create a boolean to travel through the bytes image

            while (!final_ar){// boolean condition in a while loop
                int byte_entrant= file_reading.read();// read the byte file

                if (byte_entrant!=-1) {//if there is a value do-->
                    dataEntrant[count] = byte_entrant;// store the value
                }else final_ar=true;// if there's no value do-->
                System.out.println(dataEntrant[count]);//print all the bytes
                count++;// increment the amount of bytes file
            }
            file_reading.close();// close the reading file
        }catch (IOException e){
            System.out.println("the image is not found");
        }
        System.out.println(count);

        create_files(dataEntrant);// call the method at main class
    }
    static void create_files (int []data_entrant){//create a new method. accept an array
        try{
            // create a new file
            FileOutputStream new_file = new FileOutputStream("E:\\OneDrive\\Desktop\\40053-c_copy.jpg");
            // roam tru the file
            for (int i= 0; i< data_entrant.length;i++){
                new_file.write(data_entrant[i]);// store the byte data from the main jpg to the new file
            }
            new_file.close();
        }catch (IOException e){
            System.out.println("error to create a file");
        }


    }
}
