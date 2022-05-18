

public class StepTracker {
    int month;
    int day;
    int steps;
    int targetSteps = 10000;
    int [][] array = new int [12][30];
    Converter converter = new Converter();

    public void addInArray(int month, int day, int steps){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[month][day-1] = steps;
                return;
            }
        }

    }

    public void getArray(int month){

        int bestSeries =0;
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[month].length; j++) {
                sum += array[i][j];
                if(array[i][j] >= targetSteps){
                    bestSeries++;
                }


            }
        }
        System.out.println("Месяц: " + month );
        System.out.println("Пройдено шагов за месяц: " + sum);
        System.out.println("Пройденная дистанция (в км): " + converter.getKilometers(sum));
        System.out.println("Количество сожжённых килокалорий: " + converter.getKilocalories(sum));
        System.out.println("Лучшая серия, максимально кол-во: " + bestSeries +" дней!");



    }

    public int changeTargetSteps(int newSteps){
        targetSteps = newSteps;
        return targetSteps;
    }



}





