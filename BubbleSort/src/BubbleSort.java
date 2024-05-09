public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={5,3,9,7,2,6,1,8};
        int[] result=bubbleSort(arr);
        printArray(result);
    }

    //Time complexity O(N^2)
    //space complexity O(1)
    static int[] bubbleSort(int[] arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0;j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
