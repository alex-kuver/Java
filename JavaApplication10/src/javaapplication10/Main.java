package javaapplication10;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static class BaseCouple {

        int base;
        int finalIntersection;

        BaseCouple(int base, int finalIntersection) {
            this.base = base;
            this.finalIntersection = finalIntersection;
        }
    }

    private final List<BaseCouple> bases;

    private Main() {
        bases = new ArrayList<>();
        bases.add(new BaseCouple(2, 2));
        bases.add(new BaseCouple(3, 3));
    }

    private void fillNBase(int N) {
        while (bases.size() < N) {
            addNextBase();
        }
    }

    private void addNextBase() {
        int applicant = bases.get(bases.size() - 1).base + 1;
        for (int i = 1; i*i < bases.size(); i++) {
            BaseCouple p = bases.get(i);
            while (p.finalIntersection < applicant) {
                p.finalIntersection += p.base;
            }
            if (p.finalIntersection == applicant) {
//restart
                applicant += 1;
                i = -1;
            }
        }
        System.out.println(applicant);
        bases.add(new BaseCouple(applicant, applicant));
    }
    public static void main(String[] args) {
        Main test = new Main();
        test.fillNBase(1000);
    }
}
