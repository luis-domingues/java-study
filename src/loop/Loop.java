package loop;

public class Loop {
    public static void main (String[] args) {
        //usando o loop for
        int n = 5;
        for (int i = 1; i <= n; ++i) {
            System.out.println ("Olá mundo");
        }

        //usando o loop while
        int j = 0;
        while (j < 10) {
            System.out.println(j + 1 + ". Opa, tudo bem?");
            j++;
        }

        //usando o loop do while
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        } while (i%2==0);
    }
}