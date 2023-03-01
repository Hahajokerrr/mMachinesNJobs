import java.util.ArrayList;

public class Machines {
    // Mảng các công việc mà máy đã làm.
    private ArrayList<Integer> Jb;
    // Tổng thời gian mà máy đã làm.
    private int sum;

    public Machines() {
        sum = 0;
        Jb = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getJb() {
        return Jb;
    }

    public void setJb(ArrayList<Integer> jb) {
        Jb = jb;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
