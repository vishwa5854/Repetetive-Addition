package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTestCases = scanner.nextInt();
        ArrayList<String[]> output = new ArrayList<>();
        for(int z=0;z<numberOfTestCases;z++){
            String input = scanner.next();
            input += scanner.nextLine();
            String[] data = input.split(" ");
            int count = 0;
            while (checkLength(data)){
                reduce(data, count);
            }
            output.add(data);
        }
        for(String[] a : output){
            System.out.println(Arrays.toString(a));
        }
    }

    private static void reduce(String[] data, int count) {
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length();j++){
                count += Integer.parseInt(Character.toString(data[i].charAt(j)));
            }
            data[i] = Integer.toString(count);
            count = 0;
        }
    }

    private static boolean checkLength(String[] data){
        for(String a : data){
            if(a.length() >1){
                return true;
            }
        }
        return false;
    }
}
