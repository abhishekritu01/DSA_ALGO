package Array;

import java.util.Stack;

public class LeaderOfArray {
    void leader(int [] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    };

    public static void main(String[] args) {

        int [] arr = { 16, 17, 4, 3, 5, 2 };
        LeaderOfArray leaderOfArray = new LeaderOfArray();
        leaderOfArray.leader(arr);

    }
}
