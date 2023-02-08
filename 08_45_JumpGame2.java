class Solution {
    public int jump(int[] N) {
        int len = N.length - 1, curr = -1, next = 0, ans = 0;
        for (int i = 0; next < len; i++) {
            if (i > curr) {
                ans++;
                curr = next;
            };
            next = Math.max(next, N[i] + i);
        };
        return ans;
    };
};
/*
class Solution {
    public int jump(int[] nums) {
       return minJumps(nums,0,new HashMap<Integer,Integer>()); 
    }
    private int minJumps(int[]nums,int currIndex,HashMap<Integer,Integer>memo){
        if(currIndex>=nums.length-1)
        return 0;
        if(nums[currIndex]==0)
        return 100001;
        int ans=100001;
        int currKey=currIndex;
        if(memo.containsKey(currKey))
        return currKey;
        int currJumps=nums[currIndex];
        for(int x=1; x<=currJumps; x++){
            int tempAns= 1 + minJumps(nums,currIndex+x,memo);
            ans= Math.min(ans,tempAns);
        }
        memo.put(currKey,ans);
        return ans;


    }
}
*/
