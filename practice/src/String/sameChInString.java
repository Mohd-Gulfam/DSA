package String;

public class sameChInString {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "acs";

        int[] freq = new  int[26];
        for(int i= 0; i<str1.length();i++){
            freq[str1.charAt(i)-'a'] = 1;

        }
        String ans = "";
        for(int i= 0; i<str2.length();i++){
            if(freq[str2.charAt(i)-'a'] == 1){
                ans += str2.charAt(i);

                freq[str2.charAt(i)-'a'] = 0;

            }
        }
        System.out.println(ans);
        System.out.println(ans.length());
    }
}
