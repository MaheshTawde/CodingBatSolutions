/* we are only iterating through outer and inner array only once, complexity is O(n)*/

public boolean linearIn(int[] outer, int[] inner) {

		int outerCounter = 0;
		int valuesFound = 0;
		
		for(int i=0;i<inner.length;i++) {
			
			for(;outerCounter<outer.length;outerCounter++) {
				if(inner[i]==outer[outerCounter]) {
					valuesFound++;
					break;
				}
				
				if(inner[i]<outer[outerCounter]) {
					return false;
				}
				
			}
			
		}
		
		return valuesFound==inner.length;

	}
