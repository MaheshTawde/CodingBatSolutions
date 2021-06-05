/*This solution iterates through array only with one loop the second loop only runs for all the 4s overall complexity is O(n)*/

public int[] fix45(int[] nums) {

		List<Integer> positionOf4s = new ArrayList<Integer>();
		List<Integer> positionOf5s = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==4) {
			  if(nums[i+1]==5){
			    continue;
			  }
				positionOf4s.add(i);
				continue;
			}
			
			if(nums[i]==5) {
			  if(i>0){
			    if(nums[i-1]==4){
			    continue;
			  }
			  }
				positionOf5s.add(i);
				continue;
			}
		}
		
		for(int i=0;i<positionOf4s.size();i++) {
			doSwap(nums, positionOf4s.get(i)+1, positionOf5s.get(i));
		}
		
		return nums;
	}

	public int[] doSwap(int[]nums, int p1, int p2) {
		int temp = nums[p1];
		nums[p1]=nums[p2];
		nums[p2]=temp;
		return nums;
	}
	
