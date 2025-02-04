package OOPS; // Add this only if your file is in the OOPS package 
class Solution
{
    void walk()
    {
      System.err.println("I am waliking");
    }
}
class Bird extends  Solution
{
    void fly()
    {
        System.err.println("I am fly");
    }
    void sing()
    {
        System.err.println("I am sing");
    }

}

public class Soluion
{
    public static void main(String[] args) {
        Bird bird = new Bird();

        bird.walk();
        bird.fly();
        bird.sing();
    }
}