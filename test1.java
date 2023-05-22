import java.util.Scanner;

//* Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса,
// например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
public class test1 {
    public static void main(String[] args) {

        Combinations(inputNumberWithQuestionMark("Введите Q состоящее из цифр (0-9) или знаков вопроса(?): ") +
                "+" +
                inputNumberWithQuestionMark("Введите W состоящее из цифр (0-9) или знаков вопроса(?): ") +
                "=" +
                inputNumberWithQuestionMark("Введите E состоящее из цифр (0-9) или знаков вопроса(?): "));
    }

    public static boolean eval(String s) {
        int q = Integer.parseInt(s.substring(0, s.indexOf("+")));
        int w = Integer.parseInt(s.substring(s.indexOf("+") + 1, s.indexOf("=")));
        int e = Integer.parseInt(s.substring(s.indexOf("=") + 1));
        return q + w == e;
    }

    public static void Combinations(String s) {
        if (s.contains("?")) {
            for (int j = 0; j < 10; j++) {
                Combinations(s.replaceFirst("\\?", String.valueOf(j)));
            }
        } else {
            if (eval(s)){
                System.out.println(s);
            }
        }
    }

    public static String inputNumberWithQuestionMark(String welcome) {

        String regex = "^[1-9?]?[0-9?]+";
        Scanner scan = new Scanner(System.in);
        boolean inputError = true;
        String res = " ";
        while (inputError) {
            System.out.print(welcome);
            res = scan.nextLine();
            if (res.matches(regex)) inputError = false;
            else System.out.println("Не должно начинаться с нуля и не должно содержать " +
                    "других символов кроме цифр и знаков вопроса");
        }
        return res;
    }

}