
public class Test {

	public static void main(String[] args) {
		int[][] arr = { {1, 2, 3, 5},
						{4, 5, 6},
						{7, 8, 9, 3},
						{2, 9, 4}
					  };
	
		arr = Arr(arr); 
		
		/*int[] arr2 = arr[arr.length-1];
    	for (int i=arr.length-1; i>=0; i--) {
				
    			if(i==0) {
					arr[i] = arr2; 
					break;
				}
				
				arr[i] = arr[i-1];
		}
		 
    	
		 for(int i=0; i<arr.length; i++){
			 for(int j=0; j<arr[i].length; j++){
				 System.out.print(arr[i][j] + " ");
			 }
			 System.out.println();
		 }*/
	
	}
	
	
	
	public static int[][] Arr(int[][] arr) {
		int num[][] = new int[arr.length][];
		int k = 0;
		int num1 = arr.length-1;  
		
		for(int i=0; i<arr.length; i++){
				if(i==0){
					num[i] = new int[arr[num1].length];
					int z = arr[num1].length -1;
					for(int j=0; j<arr[num1].length; j++){
						
							num[i][j] = arr[arr.length-1][z];
							z--;
					}
					
				} else if(i == arr.length-1) {
					num[i] = new int[arr[i-1].length];
					int z = arr[i-1].length -1;
					for(int j=0; j<arr[k].length; j++){
							num[i][j] = arr[k][z];
							z--;
				}
					
				} else {
					num[i] = new int[arr[k].length];
					int z = arr[k].length - 1;
					for(int j=0; j<arr[k].length; j++){
							num[i][j] = arr[k][z];
							z--;
					}
					
				}
				
				
				if(i!=0 && i!=arr.length-1){
					k++;
				}
		}
		
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.print(num[i][j]+ " ");
			}
			System.out.println();
		}
		
		return num;
	}


}

