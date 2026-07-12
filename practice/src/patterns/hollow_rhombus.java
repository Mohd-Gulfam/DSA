package patterns;

public class hollow_rhombus {
    static void rhombus(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print("  ");
            }
            for(int j= 1; j<=a; j++){
                if(j==1 || j==a || i==1|| i==a){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombus(5);
    }
}
