package LinerSearch;
//    https://leetcode.com/problems/richest-customer-wealth/description/
//    Input: accounts = [[1,2,3],[3,2,1]]
//    Output: 6

// Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10

public class MaxWealth {
    static int maximumnWealth(int[][] accounts){
        int maxWealth =0;
        for(int row =0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum += accounts[row][col];

                if(sum > maxWealth){
                    maxWealth = sum;
                }
            }
        }
        return maxWealth;
    };

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,12,1},{3,6,1}};
        System.out.println(maximumnWealth(accounts) + " " + "maximum wealth");
    }
}
