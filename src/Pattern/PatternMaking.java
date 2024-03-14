package Pattern;

public class PatternMaking {

    static void squarePattern(int n){
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<n ;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    static void test(){


    }




    public static void main(String[] args) {
        squarePattern(5);

    }
}
