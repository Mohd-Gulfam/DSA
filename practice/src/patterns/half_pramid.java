package patterns;

public class half_pramid {
    public static void pramid(int n)
    {
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
             System.out.print(" * ");
         }
         System.out.println();
     }

    }

    public static void main(String[] args) {
        int n=5;
        pramid(n);
    }
}
