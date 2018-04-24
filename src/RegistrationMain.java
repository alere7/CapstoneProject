/**
 * ralex1 on 2/26/2018.
 */

public class RegistrationMain {
    public static void main(String[] args) {
        System.out.println("RegistrationMain");

        Registration r1 = new Registration();

        r1.initalizeCourses();
        //r1.printCourses();

        r1.randomizeList(r1.getCourse());
        r1.printCourses();

        r1.semesterEnrolledClasses(r1.getCourse());
        r1.printCoursesTaken();
    }
}
