package directory_files;
//create and write a new file."" and eliminate a new directory
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create {
    public static void main(String[] args) throws IOException {
        //file.separator is equals to =\\
        File ruta= new File("E:\\OneDrive\\Desktop\\java streams"+ File.separator+"new_directory");
        ruta.mkdir();//create the directory

        File ride= new File("E:\\OneDrive\\Desktop\\java streams"+ File.separator+"newFile.txt");
        ride.createNewFile();//create the file

        String archivo_destino= ride.getAbsolutePath();//almacena the route de la folder

        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);//it pass por parameter la ruta al method
        // instancia.metodo(parametro)
        ruta.delete();//delete the file, if and only if the directory is empty

    }

}
class Escribiendo {
    public void escribir(String ruta_archivo){
        String phrase="this is an example";
        try{
            FileWriter escritura = new FileWriter(ruta_archivo);
            for (int i=0; i<phrase.length();i++){
                escritura.write(phrase.charAt(i));
            }
            escritura.close();
        }catch (IOException e){}
    }
}/*String s = File.separator;
    String ruta = "C:/Java/PruebaFile/";

ruta.replace("/", s);
        File fCarpeta = new File(ruta);*/
