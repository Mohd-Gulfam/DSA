package patterns;

public class Vpattern {
    public static void main(String[] args) {
        int n = 4;
        for(int j=1;j<=2*n-1;j++){
            for (int i=1;i<=2*n-1;i++){
                if(i==j ||i+j == 2*n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
