package bruteforce.palindrome;

public class ThePalindrome {
    public static void main(String[]args){
        System.out.println(find("abab"));
        System.out.println(find("abdfhdyrbdbsdfghjkllkjhgfds"));

    }
    public static int find(String s){
        int begin = 0;
        int end = s.length()-1;

        int result = s.length();

        while(begin<end){
            if(s.charAt(begin)==s.charAt(end)){
                begin++;
                end--;
            }
            else{
                begin++;
                result++;
            }
        }


        return result;
    }
}
