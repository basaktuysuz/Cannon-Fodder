import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.SecurityException;
import java.util.*;

public class CreateTextFile {


    public static void calculateEnemies(ArrayList<Enemy> enemies){
        PrintWriter outputFile=null;
        try{
            outputFile = new PrintWriter("Enemies.txt");
            for(int i=0;i<enemies.size();i++){
                outputFile.println(enemies.get(i).getEnemyReference() + " | "+ enemies.get(i).isDead);
            }
        }
        catch (SecurityException securityException){
            System.err.println("Write permission denied.Terminating");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
        outputFile.close();
    }
}