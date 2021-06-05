public int maxSpan(int[] nums) {
  int maxSpan=nums.length>0?1:0;
  for(int i=0;i<nums.length-1;i++){
    
    for(int j=nums.length-1;j>i;j--){
      if(nums[i]==nums[j]){
        int temp= j-i+1;
        maxSpan = temp>maxSpan?temp:maxSpan;
      }
    }
    
  }
 return maxSpan;
  
}
