package dynamicprogramming.corporationsalary;

import java.util.Arrays;

public class CorporationSalaryV2 {

    public static void main(String[] args) {

        for (int i = 0; i < relations.length; i++) {
            getSalary(i,relations);
        }
        System.out.println(Arrays.toString(salaries));
        System.out.println(totalSalaries());
    }
    static String[] relations = {
            "NNNNNN",
            "YNYNNY",
            "YNNNNY",
            "NNNNNN",
            "YNYNNN",
            "YNNYNN"
    };
    static long[] salaries = new long[relations.length];

    public static long totalSalaries(){

        long total = 0;
        for (long salary :salaries) {
            total+=salary;
        }
        return total;
    }

    //해당 i번의 샐러리를 구한다.
    public static long getSalary(int i, String[] relations){
        if(salaries[i]==0){
            long salary = 0;
            String relation = relations[i];

            for (int j = 0; j < relation.length(); j++) {
                if(relation.charAt(j)=='Y'){
                    salary += getSalary(j, relations);
                }
            }

            if(salary==0) salary = 1;
            salaries[i] = salary;
        }
        return salaries[i];
    }
}
