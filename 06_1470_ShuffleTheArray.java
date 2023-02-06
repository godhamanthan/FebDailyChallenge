class Solution {
    public int[] shuffle(int[] nums, int n) {
        if(n==1)
            return nums;
        
        int firstPointer=0,secondPointer=n;
        int[] arr= new int[nums.length];
        for(int i=0;i<2*n;i++)
        {   if(i%2==0){
            arr[i]=nums[firstPointer];
            firstPointer++;
            }
         else{
                arr[i]=nums[secondPointer];
                secondPointer++;
            }
        }
        return arr;
        
    }
}
