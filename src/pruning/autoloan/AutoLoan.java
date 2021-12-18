package pruning.autoloan;

public class AutoLoan {
    public static void main(String[] args) {
        System.out.println(interestRate(2000,510,4));
    }

    public static double interestRate(double price, double monthlyPayment, int loanTerm){

        double high = 100;
        double low = 0;
        double mid = 0;

        while((1e-9<high-low) && (1e-9<(high-low)/high)){
            double balance = price;//이거 위치 가 왜 여기여야 하지?? 아~~~~ 리셋해야하는구나....바부...
            mid = (high+low)/2;

            for (int i = 0; i < loanTerm; i++) {
                balance = balance + (balance*mid)/(12*100); //이자가 더해지고
                balance -= monthlyPayment; //지불액을 뺀다 --를 대출개월만큼 반복
            }

            if(balance < 0) high = mid;
            else low = mid;

        }

        return mid;
    }
}
