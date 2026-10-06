package recurssion;



public class printArr {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,7,9};
        print(arr,0);
        int target= 2;
        System.out.println(isExsts(arr, target, 0));

    }

    private static boolean isExsts(int[] arr, int target, int i) {
        if(i==arr.length){
            return false;
        }
        if(arr[i]==target){
            return true;
        }
         return  isExsts(arr,target,i+1);

    }

    public static void print(int[] arr,int index){
        if(index ==  arr.length){
            return;
        }
        System.out.print(arr[index]+"  ");
        print(arr,index+1);
        System.out.print(" "+arr[index]);
    }
}
