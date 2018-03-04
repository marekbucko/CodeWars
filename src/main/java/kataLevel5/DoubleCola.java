package kataLevel5;

/*
* kata level 5
* link https://www.codewars.com/kata/551dd1f424b7a4cdae0001f0
* */
public class DoubleCola {
    public static String whoIsNext(String[] names, int n) {
        int queueSize = 5;
        String name = "";
        double counter = 1;

        while (n > queueSize) {
            n -= queueSize;
            queueSize = queueSize * 2;
            counter = counter * 2;
        }
        if (n <= counter) {
            name = names[0];
            System.out.println("Sheldon");
        } else if (n <= 2 * counter) {
            name = names[1];
            System.out.println("Leonard");
        } else if (n <= 3 * counter) {
            name = names[2];
            System.out.println("Penny");
        } else if (n <= 4 * counter) {
            name = names[3];
            System.out.println("Rajesh");
        } else if (n <= 5 * counter) {
            name = names[4];
            System.out.println("Howard");
        }
        return name;
    }
}
