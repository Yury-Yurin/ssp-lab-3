package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String digits = "0123456789";
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader("/home/yury/BSTU/lab3/text.txt"));
        Object[] lines = in.lines().toArray();
        List<Integer> allDigits = new ArrayList();
        for( Object line : lines ) {
            String str = line.toString();
            for(int i=0;i<str.length();i++) {
                for (int j = 0; j < digits.length(); j++) {
                    if (str.charAt(i) == digits.charAt(j)) {
                        allDigits.add(Integer.parseInt(String.valueOf(digits.charAt(j))));
                    }
                }
            }
        }
        System.out.println(allDigits);
        System.out.println(allDigits.get(allDigits.size()/2));
    }
}
