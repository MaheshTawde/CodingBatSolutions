		public boolean canBalance(int[] nums) {

			if(nums.length<=1) {
				return false;
			}
			int total = java.util.stream.IntStream.of(nums).sum();
			int sumFirstHalf = 0;
			
			
			for(int num:nums) {
				sumFirstHalf +=num;
				total -= num;
				if(sumFirstHalf==total) {
					return true;
				}
			}
			return false;
}
