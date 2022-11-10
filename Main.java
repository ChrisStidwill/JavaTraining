import java.util.*;
public class Main {
    public static class Node {
        public int data;
        public Node left;
        public Node right;

        //constructor
        public Node() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        public Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void switchOnDay(int day){
        switch(day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("A weekday");
        }
    }

    public static void SwitchOnThirdDay(int day){
        switch(day % 7){
            case 0:
                System.out.println("Day " + day + ", Sunday");
                break;
            case 1:
                System.out.println("Day " + day + ", Monday");
                break;
            case 2:
                System.out.println("Day " + day + ", Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + ", Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + ", Thursday");
                break;
            case 5:
                System.out.println("Day " + day + ", Friday");
                break;
            default:
                System.out.println("Day " + day + ", Saturday");
        }
    }

    public static void isXGreater(int x, int y){
        if (x > y){
            System.out.println("X is Greater than Y");
        }
    }

    public static void isEqual(int x, int y){
        if (x == y) System.out.println("They are equal");
    }

    public static void equalOrUnequal(int x, int y){
        if (x == y) System.out.println("They are both equal");
        else System.out.println("They are both not equal");
    }

    public static int categoriseEquality(int x, int y){
        if (x == y) return 1;
        if (x > y) return 2;
        return 3;
    }

    public static void printEveryThirdDay() {
        int day = 3; // third day of month, wednesday

        while (day <= 31){
            SwitchOnThirdDay(day);
            day += 3;
        }
    }
    public static Integer getNumberOfNodes(Node Head){
        int numberOfNodes = 0;
        Vector<Node> ChildNodes = new Vector<Node>();
        if (Head.left != null) ChildNodes.add(Head.left);
        if (Head.right != null) ChildNodes.add(Head.right);
        while (ChildNodes.size() != 0){
            Vector<Node> GrandChildren = new Vector<Node>();
            for (int i = 0; i < ChildNodes.size(); i++){ // traverse children
                numberOfNodes++;
                if (ChildNodes.get(i).left != null){
                    GrandChildren.add(ChildNodes.get(i).left);
                }
                if (ChildNodes.get(i).right != null) {
                    GrandChildren.add(ChildNodes.get(i).right);
                }
            }
            ChildNodes = GrandChildren;
        }
        return numberOfNodes;
    }
    public static Integer countLeafNodes(Node Head){
        int leaves = 0;
        if (Head.left != null) leaves++;
        if (Head.right != null) leaves++;
        return leaves;
    }
    public static void main(String[] args) {
        // Create a basic BST
        Node Head = new Node(10);
        Head.left = new Node(5);
        Head.right = new Node(70);
        (Head.right).right = new Node(100);
        (Head.left).right = new Node(7);

        System.out.println(countLeafNodes(Head));
        System.out.println(getNumberOfNodes(Head));
    }
}


// Stuff that was once in main to test the code.
//        int x = 50;
//        int y = 40;
//        isXGreater(x, y);
//        isEqual(x, y);
//        equalOrUnequal(x, y);
//        System.out.println(categoriseEquality(x, y));
//        switchOnDay(5);
//
//        // use a while loop to print i while i < 6
//        for (int i = 0; i < 6; i++) System.out.println(i);
//
//        // do the same on a while loop
//        int i = 0;
//        while (i < 6){
//            System.out.println(i);
//            i++;
//        }

// problem: 31 day month starting on a monday. Every third day, print out what every 3rd day will be.
// output 'day 3: wednesday' etc.
//        printEveryThirdDay();

//        int[] myFaveIntegers = {3, 5, 7, 21, 88};
//        System.out.println(myFaveIntegers.length);