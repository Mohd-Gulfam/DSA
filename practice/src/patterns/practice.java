package patterns;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class practice {
    public static void main(String[] args) {
        int i=1;
        int j =1;
        int k = i++  +  ++i + i-- + --i;
        boolean b = i++ == 1 && ++j ==2  &&  i++ ==2;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(b);
        int n=20;
        int sum =0;
        for(int j1;i<=n;i++){
            if(i == i/2*2){
                System.out.println("even +"+i);
                sum+=i;
            }else {
                System.out.println("odd -"+i);
                sum-=i;
            }
        }
        System.out.println(sum);



        int a = 5;
        int c = 4;
//       xor 1^1 = 0 , 1^0 = 0
        a = a ^ c;
        c = a ^ c;
        a = a ^ c;
        System.out.println(a);
        System.out.println(c);

    }
}