// package java.java_HackerRank;

import java.util.Scanner;

public class Java_sumOfTheDivision {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;
        int square = (int) Math.sqrt(N);

        for(int i = 1 ; i <= square ; i++)
        {
            if( N % i == 0 )
            {
                sum += i + N / i;
            }
        }
        if(square * square == N)
        {
            sum -= square;
        }
        System.out.println(sum);

    }
}