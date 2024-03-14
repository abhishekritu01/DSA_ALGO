package BinarySearch;

public class SortedMatrix2D {


//search in the row provided between the column provided
    static int [] binarySearch(int[] Matrix,int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(Matrix[mid] == target){
                return new int[]{row,mid};
            }
            if(Matrix[mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int [] search(int[][] Matrix,int target){
        int r = Matrix.length;
        int c = Matrix[0].length;
        if(r == 1){
            return binarySearch(Matrix[0],0,0,c-1,target);
        }

        int rStart = 0;
        int rEnd = r-1;
        int cMid = c/2;
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(Matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(Matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        if(Matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(Matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }

        if(target <= Matrix[rStart][cMid-1]){
            return binarySearch(Matrix[rStart],rStart,0,cMid-1,target);
        }
        if(target <= Matrix[rStart][cMid-1]){
            return binarySearch(Matrix[rStart+1],rStart+1,0,cMid-1,target);
        }
        if(target <= Matrix[rStart][cMid-1]){
            return binarySearch(Matrix[rStart+2],rStart+2,0,cMid-1,target);
        }
        if(target <= Matrix[rStart][cMid-1]){
            return binarySearch(Matrix[rStart+3],rStart+3,0,cMid-1,target);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 29;

    }
}
