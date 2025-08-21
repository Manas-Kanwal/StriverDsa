package array;
public class CheckIfTheArrayIsSorted {
    public static boolean check(int[] nums) {
       int n = nums.length ;
       int counter = 0 ;
       for(int i = 1 ; i < n ; i++)
       {
            if(nums[i]<nums[i-1])//pattern follow decreasing to increasing if the pattern is any different then increase the counter ;
            {
                counter++;
            }

       }
       if(counter == 1 && nums[0]<nums[n-1])
       {
        return false ;
       }
       if(counter <= 1)
       {
        return true ;
       }
       return false ;
    }
    
    
    public static void main(String[] args) {
        int arr [] = {2,1,3,4};
        boolean ans = check(arr);
        System.out.println(ans);
    }
}
