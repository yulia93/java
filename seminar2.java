/* Задача №1
 * ======================================================================================
 * Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится 
 * цифра. Определите индексы первого и последнего её вхождения.
 * ======================================================================================
 * Sample Input 1:
 * 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
 * 4
 * Sample Output 1:
 * 0
 * 28
 */

// package seminar_2.task_1;

// import java.util.Scanner;

// import javax.print.DocFlavor.STRING;

// public class MyProgram {
//     public static void main(String[] args) {
//         String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//         String num ="4";
//         System.out.println(str.indexOf(num));
//         System.out.println(str.lastIndexOf(num));


//     }
// }

// /*Дана строка, в которой через пробел перечислены цифры. 
// На следующей строке вводится цифра. 
// Определите индексы первого и последнего её вхождения.*/
// package java;

// public class Task {

//     public static void main(String[] args) {
//         String str="4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
//         String num="4";
        
//         System.out.println(str.indexOf(num));
//         System.out.println(str.lastIndexOf(num));
//     }
// }






// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, в которой перечислены слова, которые написаны в газете.
// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.
// Sample Input:
// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:
// 7
// 5

// package java;

// public class seminar_2 {
//     public static void main(String[] args) {
//         String str = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
//         String[] words = str.split(" ");
//         char _letter1 = 'а', _letter2 = 'в';
//         int count1 = 0, count2 = 0;
//         for (int i = 0; i < words.length; i++) {
//             if (words[i].indexOf(_letter1) != -1)
//                 count1++;
//         }
//         for (int i = 0; i < words.length; i++) {
//             if (words[i].indexOf(_letter2) != -1)
//                 count2++;
//         }
//         System.out.println(count1);
//         System.out.println(count2);
//     }

// }


// Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. В следующих трех строках показаны три правильных IP-адреса:
// 127.0.0.0
// 192.168.0.01
// 255.00.255.255
// Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.
// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:
// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте экранирование.
// String s = "\.";
// Sample Input 1:
// 192.168.1.2
// Sample Output 1:
// YES
// Sample Input 2:
// 192.11.690.0
// Sample Output 2:
// NO
// Sample Input 3:
// 67.67.67
// Sample Output 3:
// NO

package s2;

public class seminar2 {
    public static void main(String[] args) {
        String ip="255.00.255.255";
        String
    }


public class Main {    
    public static void main(String[] args) {        
        String ip = "188.333";        
        String[] ipe = ip.split("\\.");        
        System.out.println(ipe[0]);        
        Integer q = Integer.parseInt(ipe[0]);        
        System.out.println(q + 10);        
    }    
}


public class Main {    
    public static void main(String[] args) {        
        String ip = "188.333";        
        String[] ipe = ip.split("\\.");        
        System.out.println(ipe[0]);        
        int q = Integer.parseInt(ipe[0]);        
        System.out.println(q + 10);        
    }    
}



/*
 * Для того чтобы выходить в Интернет, каждому компьютеру присваивается так
 * называемый IP-адрес. Он состоит из четырех целых чисел в диапазоне от 0 до
 * 255,
 * разделенных точками. В следующих трех строках показаны три правильных
 * IP-адреса:
 * 127.0.0.0
 * 192.168.0.01
 * 255.00.255.255
 * Напишите программу, которая определяет, является ли заданная строка
 * правильным IP-адресом.
 * Входные данные
 * На вход программе подается строка длиной не более 15 символов,
 * которая включает цифры и точки.
 * Выходные данные
 * Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.
 */

package lesson2;

public class Task3 {
public static void main(String[] args) {
    String ip="300.00.255.255";
    String[] nums=ip.split("\\.");
    
    if(nums.length!=4)return;
    for(String s:nums){
        int num=Integer.parseInt(s);
        if(num<0||num>255){
            System.out.println("неправильный ip");
            return;
        }
    }
    System.out.println("правильный ip");
}
}