package nl.utwente.di.bookQuote;

public class Quoter {
    public Quoter() {

    }
    public double getBookPrice(String celcius) {
        double i = Integer.parseInt(celcius);
        double fahrenheit = (i*1.8)+32;

        return fahrenheit;
    }
}