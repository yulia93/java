package HomeTasks2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*Task_3.*
//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате*/
public class Task3_1_log {
    public static void main(String[] args) throws IOException {
        try(FileWriter f_wr = new FileWriter("ByteTask3.txt", false)) {
            Scanner sc = new Scanner(System.in);
            System.out.print("->");
            Byte byte_n = sc.nextByte();
            f_wr.write(byte_n);

        }
        catch(Exception ex){
            Logger logger = Logger.getLogger(Task3_1_log.class.getName());
            FileHandler fh = new FileHandler("logTask3_1.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.log(Level.WARNING,ex.getMessage());
        }
        finally {

        }
    }
}
