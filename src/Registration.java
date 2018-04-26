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
    private ArrayList<String> classification;
    private Random rand = new Random();
    private int loopNum = 3;
    private int numCoursesToGrad = 42;
    private int semesterCount = 0;
    private int classifNum = 0;

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

        randomCourses(loopNum, "BIOL", course);
        randomCourses(loopNum, "CHEM", course);
        randomCourses(loopNum, "PHYS", course);
        randomCourses(loopNum, "AADS", course);
        randomCourses(loopNum, "HIST", course);
        randomCourses(loopNum, "THEO", course);

        while (course.size() < numCoursesToGrad) {
            randomCourses(loopNum, "CPSC", course);
            randomCourses(loopNum, "MATH", course);
        }

        classification = new ArrayList<>();

        classification.add("Freshman");
        classification.add("Sophmore");
        classification.add("Junior");
        classification.add("Senior");
    }

    public void printCoursesListSize(){
        System.out.println("\nThere are about " + course.size() + " courses needed to graduate");
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

        numClasses = rand.nextInt(3) + 4;

        mathCPSCRequiredCourses(coursesTaken, "CPSC 1710", "CPSC 1720", "CPSC 2730");

        //todo: what about the courses that have already been taken from the list (cant take the same course twice in a semester)
        //todo: use a set collection to get rid of duplicates then put into an arraylist (coursesTaken)
        //todo: also make sure CPSC an MATH classes follow the correct order (cant take 1710 and 1720 or 2730 in the same semester)

        //todo: this needs to be repeated x amount of times
        addingCourseTaken(numClasses, c);

        return coursesTaken;
    }

    private void mathCPSCRequiredCourses(ArrayList<String> c, String cName1, String cName2, String cName3){
        if (!c.contains(cName1)) {
            c.add(cName1);
        }
        else if (c.contains(cName1) && !c.contains(cName2)) {
            c.add(cName2);
        }
        else if (c.contains(cName1) && c.contains(cName2)
                && !c.contains(cName3)) {
            c.add(cName3);
        }
    }

    private void addingCourseTaken(int numClasses, ArrayList<String> course){
        for (int i = 0; i < numClasses - 1; i++) {
            coursesTaken.add(course.get(i));
        }
    }

    //todo: keep track of semester and year count (1st semester freshman year...)
    public void printCoursesTaken(){
        int sc = 1;

        if (semesterCount == 1) {
            System.out.println(sc + "st Semester " + classification.get(classifNum) + " year");
            semesterCount++;
        }
        else if (semesterCount == 2){
            System.out.println(sc + "nd Semester " + classification.get(classifNum) + " year");
            classifNum++;
        }

        for (int i = 0; i < coursesTaken.size(); i++) {
            System.out.println(coursesTaken.get(i));
        }
    }


}
