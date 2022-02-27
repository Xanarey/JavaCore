package Chap28.ForkJoinTask2;

import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Double> {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        return null;
    }
}

public class RecurTaskDemo {
}
