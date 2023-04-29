package directory_files;

import java.io.File;
import java.util.Arrays;

public class file_access {
    public static void main(String[] args) {
        File ruta= new File("E:\\OneDrive\\Desktop\\java streams");//-> constructor
        System.out.println(ruta.getAbsolutePath());
        String[] name_files= ruta.list();


        Arrays.stream(name_files).forEach(System.out::println);
        for (int i = 0; i < name_files.length; i++){//travel across the files
            System.out.println(name_files[i]);//print on
            File f = new File(ruta.getAbsolutePath(),name_files[i]);//create the full path for each document
            if(f.isDirectory()){//ask if one of is a directory
                String[] subFolder=f.list();//if it is, save it on a variable
                for (String s : subFolder) {//move through the subfolder length
                    System.out.println(s);//printed on screen
                }
            }
        }
        //  for(int y = 0; y< Objects.requireNonNull(subFolder).length; y++)-> y< Objets.req... ni idea

        // for(int y=0;y<subFolder.length;y++){-->equalsTo.line 19
        //    System.out.println(subFolder[y]);}
    }
}
