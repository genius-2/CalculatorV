import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLog");
        try {
            FileHandler fh = new FileHandler("ItsLogTime.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
        } catch (SecurityException | IOException e) {
            logger.log(Level.SEVERE, "Произошла ошибка при работе с FileHandler.", e);
        }try {
            FileHandler fh = new FileHandler("ItsLogTime.log", true);
            logger.addHandler(fh);
            fh.setFormatter(new SimpleFormatter());
        } catch (SecurityException | IOException e) {
            logger.log(Level.SEVERE, "Произошла ошибка при работе с FileHandler.", e);
        }
        String Input;
        Scanner in = new Scanner(System.in);
        String[] Ex = new String[3];
        System.out.println("ВВЕДИТЕ ВЕЩЕСТВЕННОЕ ЧИЛСО 1 РАЗДЕЛЯЯ ПРОБЕЛАМИ");
        Input = in.nextLine();
        Ex[0] = Input;
        System.out.println("ВВЕДИТЕ ОПЕРАИЦЮ");
        Input = in.nextLine();
        Ex[1] = Input;
        System.out.println("ВВЕДИТЕ ВЕЩЕСТВЕННОЕ ЧИЛСО 2 РАЗДЕЛЯЯ ПРОБЕЛАМИ");
        Input = in.nextLine();
        Ex[2] = Input;
        logger.info("ввод " + Arrays.toString(Ex));
        Ex[0] = Ex[0].substring(0, Ex[0].length() - 1);
        Ex[2] = Ex[2].substring(0, Ex[2].length() - 1);
        Complex a = new Complex(Ex[0]);
        Complex b = new Complex(Ex[2]);
        Complex res = new Complex();
        if (Ex[1].equals("+")) {
            res = a.Plus(b);
        } else if (Ex[1].equals("-")) {
            res = a.Minus(b);
        } else if (Ex[1].equals("*")) {
            res = a.Times(b);
        } else {
            res = a.Divides(b);
        }
        System.out.println(res);
        logger.info("вывод " + res);
    }
}