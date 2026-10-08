package Test_6;

import tr.edu.istiklal.StopWatch;

public class Test_6 {

    public static void main(String[] args) {

        double[] list = new double[100000];
        for (int i = 0; i < list.length; i++) {
            list[i] = Math.random() * 100000;
        }

        StopWatch sw = new StopWatch();

        sw.start();
        StopWatch.selectionSort(list);
        sw.stop();

        System.out.println(sw.getElapsedTime());
    }
}