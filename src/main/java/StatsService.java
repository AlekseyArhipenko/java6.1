public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int minCompanySales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;

        }

        return minMonth + 1;
    }

    public int maxCompanySales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;
    }

    public int belowAverageSalesCompany(int[] sales) {
        int lessThanAverage = 0;
        for (long sale : sales) {

            if (sale < averageSum(sales)) {
                lessThanAverage = lessThanAverage + 1;

            }
        }
        return lessThanAverage;
    }

    public int aboveAverageSalesCompany(int[] sales) {
        int moreThanAverage = 0;
        for (long sale : sales) {

            if (sale > averageSum(sales)) {
                moreThanAverage = moreThanAverage + 1;

            }
        }
        return moreThanAverage;

    }

}
