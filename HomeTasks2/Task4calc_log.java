package HomeTasks2;
/*Task_4.* К калькулятору из предыдущего дз добавить логирование.*/
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task4calc_log {
    public static void main(String[] args) throws IOException {
        boolean flag =true;
        System.out.println("Вас приветсвует ИИ Calc1.");
        func_add_log("Вас приветсвует ИИ Calc1.");
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите первое число:");
            double firstNum = sc.nextDouble();
            System.out.print("Введите второе число:");
            double secondNum = sc.nextDouble();
            System.out.print("Введите операцию (+,-,/,*,q-выход:");
            String op = sc.next();
            String result =null;
            switch (op) {
                case "+" -> {
                    result = firstNum + op + secondNum + " = " + (firstNum + secondNum);
                    System.out.println(result);
                    func_add_log((result));
                }
                case "-" -> {
                    result = firstNum + op + secondNum + " = " + (firstNum - secondNum);
                    System.out.println(result);
                    func_add_log((result));
                }
                case "*" -> {
                    result = firstNum + op + secondNum + " = " + (firstNum * secondNum);
                    System.out.println(result);
                    func_add_log((result));
                }
                case "/" -> {
                    result = firstNum + op + secondNum + " = " + (firstNum / secondNum);
                    System.out.println(result);
                    func_add_log((result));
                }
                case "q" -> flag = false;
                default -> {
                    result = firstNum + op + secondNum + " = " + "Неизвестная операция";
                    System.out.println(result);
                    func_add_log((result));
                }
            }
        }
        func_add_log("Работа ИИ Calc1 завершена.");
    }
    public static void func_add_log(String record) throws IOException {
        Logger logger = Logger.getLogger(Task4calc_log.class.getName());
        FileHandler fh = new FileHandler("logTask4calc.txt",true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.INFO,record);
        logger.setUseParentHandlers(false);
        fh.close();
    }
}
