/**
 * ralex1 on 4/26/2018.
 */
public class ATuringAwardMain {
    public static void main(String[] args) {
        System.out.println("A Turing Award App");

        TuringAward tree1 = new TuringAward("1966 Alan J. Perlis", 1995);

        //todo: figure out how to just read the year (from the shuffled list) in order to create binary tree effectively
        //todo: random list of strings ==> key year to start sorting from ==> create bst based on random award winners
        String[] names = {"1966 Alan J. Perlis", "1967 Maurice Wilkes", "1968 Richard Hamming", "1969 Marvin Minsky",
                "1970 James H. Wilkinson", "1971 John McCarthy", "1972 Edsger W. Dijkstra", "`1973 Charles W. Bachman",
                "1974 Donald E. Knuth", "1975 Allen Newell and Herbert A. Simon",
                "1976 Michael O. Rabin and Dana S. Scott", "1977 John Backus", "1978 Robert W. Floyd",
                "1979 Kenneth E. Iverson", "1980 Tony Hoare", "1981 Edgar F. Codd", "1982 Stephen A. Cook",
                "1983 Ken Thompson and Dennis M. Ritchie", "1984 Niklaus Wirth", "1985 Richard M. Karp",
                "1986 John Hopcroft and Robert Tarjan", "1987 John Cocke", "1988 Ivan Sutherland", "1989 William Kahan",
                "1990 Fernando J. Corbató", "1991 Robin Milner", "1992 Butler W. Lampson",
                "1993 Juris Hartmanis and Richard E. Stearns", "1994 Edward Feigenbaum and Raj Reddy",
                "1995 Manuel Blum", "1996 Amir Pnueli", "1997 Douglas Engelbart", "1998 Jim Gray",
                "1999 Frederick P. Brooks, Jr.", "2000 Andrew Chi-Chih Yao", "2001 Ole-Johan Dahl and Kristen Nygaard",
                "2002 Ronald L. Rivest, Adi Shamir and Leonard M. Adleman", "2003 Alan Kay",
                "2004 Vinton G. Cerf and Robert E. Kahn", "2005 Peter Naur", "2006 Frances E. Allen",
                "2007 Edmund M. Clarke, E. Allen Emerson and Joseph Sifakis", "2008 Barbara Liskov",
                "2009 Charles P. Thacker", "2010 Leslie G. Valiant", "2011 Judea Pearl",
                "2012 Silvio Micali Shafi Goldwasser", "2013 Leslie Lamport", "2014 Michael Stonebraker",
                "2015 Martin E. Hellman Whitfield Diffie", "2016 Tim Berners-Lee",
                "2017 John L. Hennessy David A. Patterson"};

        for(String i : names){
            tree1.addNode(i);
        }

        tree1.printNamesRandomOrder(names);
    }
}
