import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ralex1 on 3/4/2018.
 */
public class Registration {
    //todo: REFORMAT CODE ==> get rid of global variables and static (easier but learn how to use different classes)
    //todo: make another class seperate from main (help public/private)

    //todo: (#1) ==> write method for instructions below
    //todo: Inorder to graduate, you must take all CPSC and Math Courses plus the same # of classes equal to that total

    //todo: (info) select 6 course ==> 1 semester is 6 classes, so intervals of 6 until graduation reqirement is acheieved

    private static ArrayList<String> course;
    private ArrayList<String> coursesTaken;
    private int loopNum = 3;
    private Random rand = new Random();

    public void initalizeCourses() {
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

        randomCourses(loopNum, "AADS", course);
        randomCourses(loopNum, "HIST", course);
        randomCourses(loopNum, "THEO", course);
        randomCourses(loopNum, "BIOL", course);
        randomCourses(loopNum, "CHEM", course);
        randomCourses(loopNum, "PHYS", course);
    }

    private void randomCourses(int loopNum, String course, ArrayList<String> c) {
        for (int i = 0; i < loopNum; i++) {
            int numThousands = rand.nextInt(4) + 1;
            int numHundreds = rand.nextInt(9) + 1;
            int numTens = rand.nextInt(9) + 1;
            c.add(course + " " + numThousands + numHundreds + numTens + 0);
        }
    }

    public void printCourses() {
        System.out.println("\nThe list of courses are: ");
        for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i));
        }
    }

    public void writeToFile(ArrayList<String> c) {

    }

    public void readFromFile() {

    }

    public ArrayList<String> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<String> course) {
        Registration.course = course;
    }

    public void randomizeList(ArrayList<String> c) {
        Collections.shuffle(c, rand);
    }

    private int countMathCPSCCourses(ArrayList<String> c) {
        int count = 0;

        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).startsWith("CPSC") || c.get(i).startsWith("MATH"))
                count++;
        }

        return count;
    }

    public ArrayList<String> semesterEnrolledClasses(ArrayList<String> c) {
        coursesTaken = new ArrayList<>();
        int num = countMathCPSCCourses(c);
        int numClasses;

        //todo: pull courses from original course list to courses taken per semester
        numClasses = rand.nextInt(3) + 4;
        if (!coursesTaken.contains("CPSC 1710"))
            coursesTaken.add("CPSC 1710");
        else if (coursesTaken.contains("CPSC 1710") && !coursesTaken.contains("CPSC 1720"))
            coursesTaken.add("CPSC 1720");
        else if (coursesTaken.contains("CPSC 1710") && coursesTaken.contains("CPSC 1720")
                && !coursesTaken.contains("CPSC 2730"))
            coursesTaken.add("CPSC 2720");

        //todo: what about the courses that have already been taken from the list
        for (int i = 0; i < numClasses - 1; i++) {
            coursesTaken.add(c.get(i));
        }

        return coursesTaken;
    }

    public void printCoursesTaken(){
        System.out.println("\nThe list of courses taken are: ");
        for (int i = 0; i < coursesTaken.size(); i++) {
            System.out.println(coursesTaken.get(i));
        }
    }
}
