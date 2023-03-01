import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    private int m;
    private int n;

    private Machines[] machines;
    private Integer[] jobs;

    public Solution() {
    }

    public Solution(int m, int n, Machines[] machines, Integer[] jobs) {
        this.m = m;
        this.n = n;
        this.machines = machines;
        this.jobs = jobs;
    }

    // Sắp xếp các công việc theo thứ tự giảm dần về mặt thời gian.
    public void sortJobs() {
        Arrays.sort(jobs, Collections.reverseOrder());
    }

    // Tìm máy có tổng thời gian làm việc nhỏ nhất.
    public int minMachines() {
        int temp = 0;
        for(int i = 0; i < m; i++) {
            if(machines[i].getSum() < machines[temp].getSum() ) {
                temp = i;
            }
        }
        return temp;
    }

    public static void print(Machines m) {
        for(int i : m.getJb()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Hàm chia công việc cho các máy.
    public void max() {
        // Xếp các công việc lần lượt vào máy có thời gian làm ít nhất
        for(int i = 0; i < n; i++) {
            int temp = minMachines();
            machines[temp].getJb().add(jobs[i]);
            machines[temp].setSum(machines[temp].getSum() + jobs[i]);
        }

        int max = 0;
        for(int i = 0; i < m; i++) {
            int t = i + 1;
            System.out.print("Machine no " + t + ": ");
            print(machines[i]);
            if(machines[i].getSum() > max) max = machines[i].getSum();
        }
        System.out.print("Total time: ");
        System.out.println(max);
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Machines[] getMachines() {
        return machines;
    }

    public void setMachines(Machines[] machines) {
        this.machines = machines;
    }

    public Integer[] getJobs() {
        return jobs;
    }

    public void setJobs(Integer[] jobs) {
        this.jobs = jobs;
    }
}


