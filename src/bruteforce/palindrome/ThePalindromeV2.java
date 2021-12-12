package bruteforce.palindrome;

public class ThePalindromeV2 {
    public static void main(String[]args){
        System.out.println(find("abab"));
        System.out.println(find("abdfhdyrbdbsdfghjkllkjhgfds"));

    }
    public static int find(String s){

        for (int i = s.length(); ; i++) {
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                if((i-j-1) < s.length() &&
                        s.charAt(j)!=s.charAt(i-j-1)){
                        flag = false;
                        break;
                }
            }
            if(flag) return i;
        }

    }
}
