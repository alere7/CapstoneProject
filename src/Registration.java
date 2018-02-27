import java.util.ArrayList;

/**
 * ralex1 on 2/26/2018.
 */
public class Registration {

    private static ArrayList<String> course;
    private static ArrayList<Integer> courseNum;

    public static void initalizeCourses(){
        course = new ArrayList<>();

        course.add("CPSC");
        course.add("MATH");
        course.add("AADS");
        course.add("PHIL");
        course.add("HIST");
        course.add("THEO");
        course.add("BIOL");
        course.add("CHEM");
        course.add("PHYS");
    }

    public static void initializeCourseNum(){
        courseNum = new ArrayList<>();

        courseNum.add(1710);
        courseNum.add(1720);
        courseNum.add(2730);
        courseNum.add(2740);
        courseNum.add(1030);
        courseNum.add(1070);
        courseNum.add(2040);
        courseNum.add(2550);

        //todo: instead of writing every courseNum ==> for every course randomly generate 2 or 3 courseNums per lvl
        //todo: EX) 2 or 3 1000 lvl courses (in order from smallest to largest) etc...
    }

    public static void main(String[] args) {
        System.out.println("Registration");
    }
}
