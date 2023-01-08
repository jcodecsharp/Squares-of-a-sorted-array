package squares.sortedarray;

public class Main {
    public static void main(String[] args) {
        int [] nums = {2,1,3,5,4};
        Solution solution = new Solution();
        int [] newArray = solution.sortedSquares(nums);
        for(int num : newArray){
            System.out.println(num);
        }


    }
}
