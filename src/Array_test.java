public class Array_test {
    public int[] insAtAnyPos(int [] arr, int n, int data, int pos){
        int newarr[]= new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<pos-1){
                newarr[i]=arr[i];
            }
            else if(i==pos-1){
                newarr[i]=data;
            }
            else {
                newarr[i]=arr[i-1];
            }
        }
        return newarr;

    }
    public static void main(String []args){
        int a[]= {10,20,30,40};
        System.out.println("Printing old arrays values");
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
            Array_test atest=new Array_test();
            int arr[]= atest.insAtAnyPos(a,a.length,25,3);

            System.out.println("Printing new array values");
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);

            }
    }
}
