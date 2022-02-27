package Chap28.ForkJoinTask2;

import java.util.concurrent.RecursiveAction;

public class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start, end;

    Transform(double[] data, int seqThreshold, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;

            invokeAll(new Transform(data, start, middle, seqThreshold),
                      new Transform(data, middle, end, seqThreshold));
        }


    }
}
