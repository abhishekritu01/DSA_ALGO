package StringBuilder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class StringBuilder {


    static void compareString(){
        String a = "Hello";
        String b = "Hello";
        System.out.println(a==b); // true

        String c = new String("Hello");
        String d = new String("Hello");
        System.out.println(c==d); // false


        String e = "Hello";
        String f = new String("Hello");
        System.out.println(e==f); // false because e is in string pool and f is in heap memory


        String g = "Hello";
        String h = new String("Hello");
        System.out.println(g.equals(h)); // true because equals method compare the content of the string


        String i = "Hello";
        String j = new String("Hello");
        System.out.println(i.equals(j)); // true because equals method compare the content of the string


        String k = "Hello";
        System.out.println(k.charAt(0)); // H

        String l = "Hello";
        System.out.println(l.substring(0,2)); // He

        System.out.println(Arrays.toString(new int[]{1,2,3,4,5})); // [1, 2, 3, 4, 5]





    }


    static void printName(String str){
//      System.out.println(str);
        String a= "Hello World";
        System.out.println(a);
        a="universe";            // creating new object and assigning to a
        System.out.println(a);
    }

//    pretty print

    static void prettyPrinting(int[][] arr){
        float a = 1.23456f;
        System.out.printf("%.2f",a); // 1.23            // %.2f means 2 decimal places
        System.out.println(Math.round(a)); // 1

    }

    static void operator(){
        System.out.println('a'+'b' +"---------------------------");
        System.out.println("a" +"b");
        System.out.println((char)('a'+3));
        System.out.println("a" + 1);
        System.out.println("abhishek"+ new ArrayList<>());
    }

    static void perfomance(){
        String series ="";
        for(int i=0;i<26;i++){
            char ch =(char)('a'+i);
            System.out.println(ch);
        }
    }

//    static void stringBuilder1(){
//        StringBuilder builder = new StringBuilder();
//        for(int i=0;i<26;i++){
//            char ch =(char)('a'+i);
//            builder.append(ch);
//        }
//        System.out.println(builder);
//    }

    static void isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");

    }



    public static void main(String[] args) {
//        printName("Hello");
        compareString();
        prettyPrinting(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        operator();
        perfomance();
//        stringBuilder1();


    }
}
