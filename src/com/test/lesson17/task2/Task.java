package com.test.lesson17.task2;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveTask<Integer> {
    private final List<Integer> list;

    public Task (List<Integer> list) {
        this.list = list;
    }

    @Override
    protected Integer compute () {
        int sum = 0;
        if (list.isEmpty ()){
            return sum;
        }

        int middle = list.size () / 2;
        List<Integer> first = list.subList (0, middle);
        List<Integer> second = list.subList (middle + 1, list.size ());

        Task one = new Task (first);
        Task two = new Task (second);
        one.fork ();
        two.fork ();

        int oneResult = one.join ();
        int twoResult = two.join ();

        sum = oneResult + twoResult + list.get (middle);




        return sum;
    }
}
