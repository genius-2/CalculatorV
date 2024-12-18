public class Complex {
    private double re = 1;
    private double im = 1;
    private String[] str;
    public Complex(){
    }
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }
    public Complex(String in){
        str = in.split(" ");
        re = Double.parseDouble(str[0]);
        im = Double.parseDouble(str[2]);
    }
    public Complex Plus(Complex b) {
        Complex a = this;
        double Real = a.re + b.re;
        double Imag = a.im + b.im;
        Complex sum = new Complex(Real, Imag);
        return sum;
    }
    public Complex Times(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }
    public Complex Minus(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public Complex Reverse() {
        double scale = re * re + im * im;
        return new Complex(re / scale, -im / scale);
    }
    public Complex Divides(Complex b) {
        Complex a = this;
        return a.Times(b.Reverse());
    }
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im < 0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }
}
