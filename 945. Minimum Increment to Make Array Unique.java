class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                int increment= nums[i]-nums[i+1]+1;
                nums[i+1]+= increment;
                cnt+=increment;
            }
        }
        return cnt;
    }
}
