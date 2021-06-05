public int[] seriesUp(int n) {
		  
		  int[] arr = new int[n*(n+1)/2];
		  
		  	  int counter = 0;
			  for(int j=1;j<=n;j++) {
				  for(int k=1;k<=j;k++) {
					  arr[counter++]=k; 
				  }
			  
		  }
		  return arr;
}
