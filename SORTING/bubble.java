package SORTING;
        //TIME COMPLEXITY O(n*2)
public class bubble {

    public static void print(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
         int a [] = {45,236,84,56,45,4};
        for(int i = 0 ;i<=a.length-1;i++){
          for(int j = 0;j<a.length-i-1;j++){
            if(a[j]>a[j+1]){
                //SWAP
                int temp = a[j];
                a[j]=a[1+j];
                a[i+j] = temp;
            }
          }

        }
        print(a);
    }
    
}
