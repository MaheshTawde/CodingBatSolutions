/* aim was to iterate through the loop only once and then just loop throught captured 4s and 5s to reduce the complexity of the problem*/
public int[] fix34(int[] nums) {

		List<Integer> positionOf3s = new ArrayList<Integer>();
		List<Integer> positionOf4s = new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]==3) {
				positionOf3s.add(i);
				continue;
			}
			
			if(nums[i]==4) {
				positionOf4s.add(i);
				continue;
			}
		}
		
		for(int i=0;i<positionOf3s.size();i++) {
			doSwap(nums, positionOf3s.get(i)+1, positionOf4s.get(i));
		}
		
		return nums;
	}

	public int[] doSwap(int[]nums, int p1, int p2) {
		int temp = nums[p1];
		nums[p1]=nums[p2];
		nums[p2]=temp;
		return nums;
	}
	
