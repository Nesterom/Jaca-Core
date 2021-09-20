package com.test.HT2_1;

public class MonthCalc {
    int mNumber;
    static Month month;
    String selectedMonth;

    public MonthCalc (int mNumber) {
        this.mNumber = mNumber;
    }

    public MonthCalc (Month month) {
        this.month = month;
    }

    public int calculateNumber () {
        switch (month) {
            case January:
                return 1;
            case February:
                return 2;
            case March:
                return 3;
            case April:
                return 4;
            case May:
                return 5;
            case June:
                return 6;
            case July:
                return 7;
            case August:
                return 8;
            case September:
                return 9;
            case October:
                return 10;
            case November:
                return 11;
            case December:
                return 12;
        }
        return 0;
    }
    public String calculateName () {
        if (mNumber < 0 || mNumber > 12){
            return ("Illegal value");
        } else {
            switch (mNumber) {
                case 1:
                    return String.valueOf (Month.January);
                case 2:
                    return String.valueOf (Month.February);
                case 3:
                    return String.valueOf (Month.March);
                case 4:
                    return String.valueOf (Month.April);
                case 5:
                    return String.valueOf (Month.May);
                case 6:
                    return String.valueOf (Month.June);
                case 7:
                    return String.valueOf (Month.July);
                case 8:
                    return String.valueOf (Month.August);
                case 9:
                    return String.valueOf (Month.September);
                case 10:
                    return String.valueOf (Month.October);
                case 11:
                    return String.valueOf (Month.November);
                case 12:
                    return String.valueOf (Month.December);
            }
        }
        return null;
    }

        public enum Month {January, February, March, April, May, June, July, August, September, October, November, December};
}




