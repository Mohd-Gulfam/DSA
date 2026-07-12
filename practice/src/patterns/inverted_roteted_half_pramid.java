package patterns;

public class inverted_roteted_half_pramid {
    static void half_pyramid(int n){
        for(int i= 1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" _ ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int n = 5;
        half_pyramid(5);
    }
}
