package SORTING;
//ONE SWAP PER ITERATION
public class selection {


     public static void print(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a [] = {45,236,84,56,45,4};
        for(int i = 0;i<a.length-1;i++){
            int smallest = i;
            for(int j = 1+i;j<a.length;j++){
                if(a[smallest]>a[j]){
                    int temp = a[smallest];
                    a[smallest]=a[j];
                    a[j]= temp;
                }

            }
        }

        print(a);
    }
    
}
