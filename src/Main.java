import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m;
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of machines: ");
        m = sc.nextInt();
        System.out.print("Number of jobs: ");
        n = sc.nextInt();

        Machines[] mach = new Machines[m];
        Integer[] job = new Integer[n];


        for(int i = 0; i < m; i++) {
            mach[i] = new Machines();
        }

        System.out.print("Jobs List: ");
        for(int i = 0; i < n; i++) {
            job[i] = sc.nextInt();
        }

        Solution solution = new Solution(m, n, mach, job);
        solution.sortJobs();
        solution.max();

    }
}