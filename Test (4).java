// Find the "Kth" max and min element of an array ?
// using second metthod

class Test {
  public static void main (String []args){
    
    int max=2;
    
    int arr[]={1,5,8,2,0,7,9,5,3,81};
    
    for(int i=0;i<max;i++){
      
      // Sorting elements in decreasing order for maximum element
      for(int j=i+1;j<arr.length;j++){
        
        if(arr[i]<arr[j]){
         
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
          
        }
      }
    }
    System.out.println(arr[max-1]);
    // for minimum elements -------------------------------------------- 
    
    System.out.println();
      int min=3;
      
      for(int i=0;i<min;i++){
      
      // Sorting elements in increasing  order for maximum element
      for(int j=i+1;j<arr.length;j++){
        
        if(arr[i]>arr[j]){
         
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
          
        }
        
      }
      
    }
    System.out.println(arr[min-1]);
  }
}