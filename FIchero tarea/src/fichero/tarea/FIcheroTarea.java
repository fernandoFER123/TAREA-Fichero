package fichero.tarea;
import java.io.FileWriter;
import java.io.IOException;

public class FIcheroTarea {

 
    public static void main(String[] args) throws  IOException{
        
        FileWriter fichero = new FileWriter ("D:/tarea/fichero.txt");
        for(int x=0;x<10;x++){
            fichero.write("fila numero " + x + "\n");
        }
        fichero.close();
    }
    
}
