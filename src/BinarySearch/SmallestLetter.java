package BinarySearch;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'b';
        System.out.println(new SmallestLetter().nextGreatestLetter(letters, target));


    }

    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // If start is within the bounds, return letters[start],
        // else return letters[0] (cyclically)
        return start < letters.length ? letters[start] : letters[0];
    }


}
