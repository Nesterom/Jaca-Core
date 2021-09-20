package com.test.HT2_1;

public class Demo {
    public static void main (String[] args) {
        MonthCalc monthCalc = new MonthCalc (MonthCalc.Month.May);
        MonthCalc monthCalcText = new MonthCalc (11);

        System.out.println (monthCalc.calculateNumber());
        System.out.println (monthCalcText.calculateName ());

    }

}
