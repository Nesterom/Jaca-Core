package com.test.lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteAndSort {
    private List<Integer> list;

    public DeleteAndSort () {

    }

    public List DeleteAndSortMethod(List<Integer> list){
        this.list = list;
        list.stream ().filter (i -> i > 0).sorted ().collect (Collectors.toList ());

        return list;
    }
}
