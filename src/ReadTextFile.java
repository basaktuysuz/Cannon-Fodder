
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTextFile {
    public static void readRecords(){
        System.out.println("Enemy Board");
        System.out.printf("%s%s%s%s%s%s%n"," ","reference "," | ","Current situation");
        Scanner s = null;
        try {
            s = new Scanner(new File("enemies.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        ArrayList<String> enemies = new ArrayList<String>();
        while (true){
            assert s != null;
            if (!s.hasNext()) break;
            enemies.add(s.next());
        }
        for (int i=0;i<enemies.size();i++) {
            if(i%5==0){
                System.out.println();
            }
            System.out.print(" "+enemies.get(i));

        }
        System.out.println();
        s.close();

    }
}