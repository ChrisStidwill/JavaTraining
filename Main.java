public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double population = 5000;
        double growthRate = 1.05;
        int years = 10;
        System.out.println("The population will be " + population * (growthRate * Math.pow(growthRate, years)));
    }
}