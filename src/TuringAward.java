import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * ralex1 on 4/27/2018.
 */
public class TuringAward {
    private String name;
    private TuringAward left;
    private TuringAward right;
    private int year;
    private Random rand = new Random();
    private ArrayList<String> names = new ArrayList<>();

    //todo: add year parameter so you know what year your searching for
    public TuringAward(String n, int y){
        this.name = n;
        this.left = null;
        this.left = null;
        this.year = y;
        names = new ArrayList<>();
    }

    public String[] randomizeList(String[] n) {
        Collections.shuffle(convertToList(n), rand);
        return n;
    }

    private ArrayList<String> convertToList(String[] n) {
        for (String i : n){
            names.add(i);
        }

        return names;
    }

    public void printNamesRandomOrder(String[] n){
        randomizeList(n);
        System.out.println(convertToList(n));
    }

    //todo: how do i know which side of the tree to put the name?
    //todo: is it by the year they were inducted
        //todo: ==> the year you searching for also needs to be a peramater when creating the tree
    public void addNode(String n) {
//        if (n < this.name){
//
//        }

    }


}
