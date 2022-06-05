import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class Score {
    private String name;
    private String gender;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    public Score(String name, String gender, int value) {
        this.name = name;
        this.gender = gender;
        this.value = value;
    }

    public Score() {
    }

    public String toString()
    {
        return   "Name=" + name + '\'' +
                ", Gender=" + gender +'\'' +
                ", Total Score=" + value;
    }
    public static void compareAndSort(ArrayList<Score> scoreArrayList){
        Collections.sort(scoreArrayList,Comparator.comparing(Score::getValue).reversed());
        //scoreArrayList.forEach(System.out::println);
    }


}
