public int[] squareUp(int n) {
		  
		  int[] arr = new int[n*n];
		  
		  	  int counter = 0;
		
		  	  for(int i=1;i<=n;i++) {
		  		  int temp = 0;
		  		  for(int j=n;j>=1;j--) {
		  			  
		  			  if(i==j) {
		  				  temp = i;
		  			  }
		  			  if(i>j) {
		  				  temp--;
		  			  }
		  			  arr[counter++] = temp;
		  		  }
		  	  }
		  	  return arr;
		}

