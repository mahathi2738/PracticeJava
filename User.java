public class User {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[]{1,2,3};
        arr[1]=new int[]{8,5};
        arr[2]=new int[]{6,7,8,9};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
       
    }
}