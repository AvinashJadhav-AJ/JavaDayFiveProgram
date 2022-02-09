package com.BridgeLabz.java;

import java.util.Scanner;

public class OddAndEven {
	public static void main(String[] args) {
		Scanner Number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Number.nextInt();

        if(num % 2 == 0)
            System.out.println(num + "Number is even");
        else
            System.out.println(num + "Number is odd");
        Number.close();
	}

}
