public class Converter {

    int steps;
    double kilometers;
    double kilocalories;

    public Converter() {
        this.steps = steps;

    }


    public double getKilometers(int steps) {

        kilometers = steps * 75/100/1000;
        return kilometers;
    }

    public double getKilocalories(int steps) {

        kilocalories = steps * 50/1000;
        return kilocalories;
    }

}
