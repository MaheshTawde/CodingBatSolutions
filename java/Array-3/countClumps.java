public int countClumps(int[] nums) {

  int currentNum=0, clumpCount=0;
  boolean clumpFlag = false;
  
  for(int i=0;i<nums.length;i++){
    
    if(i==0){
      currentNum = nums[i];
      continue;
    }
    
    if(currentNum==nums[i]){
      if(!clumpFlag){
        clumpFlag=true;
        clumpCount++;
      }
    }
    
    else{
      currentNum=nums[i];
      clumpFlag = false;
    }
    
  }
  
return clumpCount;
}
