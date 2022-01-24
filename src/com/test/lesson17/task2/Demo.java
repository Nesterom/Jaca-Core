package com.test.lesson17.task2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Demo {
    public static void main (String[] args) {
        ForkJoinPool pool = new ForkJoinPool ();
        List<Integer> list = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9);
        Task task = new Task (list);
        pool.submit (task);

        System.out.println (task.join ());

        List<Integer> list2 = Arrays.asList (1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Task task2 = new Task (list2);
        pool.submit (task2);

        System.out.println (task2.join ());

    }
}
