package ru.netology.javaqa.javaqamvn.services;

//import static java.lang.Long.sum;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long avarageSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; //номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) { // значит, в рассматриваемом i-м месяце продаж больше
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; //запомним его как маскимальный
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    public int monthsBelowAvarage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < avarageSumSales(sales)) {
                count++;

            }
        }
        return count;


    }

    public int monthsUnderAvarage(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > avarageSumSales(sales)) {
                count++;

            }
        }
        return count;
    }
}