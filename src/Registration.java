import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ralex1 on 2/26/2018.
 */
public class Registration {

    private static ArrayList<String> course ;
    private static int loopNum = 3;
    private static Random rand = new Random();

    public static void initalizeCourses(){
        course = new ArrayList<>();

        course.add("CPSC 1710");
        course.add("CPSC 1720");
        course.add("CPSC 2730");
        course.add("MATH 1030");
        course.add("MATH 1070");
        course.add("PHIL 2040");
        course.add("PHIL 2550");
        
        //todo: instead of writing every courseNum ==> for every course randomly generate 2 or 3 courseNums per lvl
        //todo: EX) 2 or 3 1000 lvl courses (in order from smallest to largest) etc...

        randomCourses(loopNum, "AAD", course);
        randomCourses(loopNum, "HIST", course);
        randomCourses(loopNum, "THEO", course);
        randomCourses(loopNum, "BIOL", course);
        randomCourses(loopNum, "CHEM", course);
        randomCourses(loopNum, "PHYS", course);
    }

    private static void randomCourses(int loopNum, String course, ArrayList<String> c){
        Random rand = new Random();

        for (int i = 0; i < loopNum; i++) {
            int num = rand.nextInt(4000)+1000;
            c.add(course+ " " + num);
        }
    }

    private static void printCourses(){
        System.out.println("The list of courses are: ");
        for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i));
        }
    }

    private static void writeToFile(ArrayList<String> c){

    }

    private static void readFromFile(){

    }

    private static void randomizeList(ArrayList<String> c){
        Collections.shuffle(c, rand);
    }

    public static void main(String[] args) {
        System.out.println("Registration");

        initalizeCourses();
        printCourses();
        randomizeList(course);
        printCourses();
    }
}
