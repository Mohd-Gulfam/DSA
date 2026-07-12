package patterns;

public class half_pramid_with_number {

    public static void half_pramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;
        half_pramid(n);
    }
}
