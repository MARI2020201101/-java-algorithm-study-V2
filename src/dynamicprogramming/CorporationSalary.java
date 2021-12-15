package dynamicprogramming;

public class CorporationSalary {

    public static void main(String[] args) {
        String[] relations = {
                "NNNNNN",
                "YNYNNY",
                "YNNNNY",
                "NNNNNN",
                "YNYNNN",
                "YNNYNN"
        };
        CorporationSalary corporationSalary = new CorporationSalary();
        long[] salaries = new long[relations.length];
        corporationSalary.getSalary(0, relations, salaries);

        for (long salary : salaries) {
            System.out.print(salary + " ");
        }

    }

//어디가 문제인지를. 모르겠네... 아아아...왜 똑같이 해도. 안나오냐? 어이가 . 없어......
    public long getSalary(int i, String[] relations ,long[] salaries){
        if(salaries[i]==0){

            long salary = 0;
            String relation = relations[i];

            for (int j = 0; j < relation.length(); j++) {
                if(relation.charAt(j)=='Y'){
                    salary += getSalary( j, relations, salaries);
                }
            }

            if(salary==0) salary = 1;
            salaries[i] = salary;
        }
        return salaries[i];
    }
}
