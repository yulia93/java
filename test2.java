

import java.math.BigInteger;
import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {
        //System.out.println(factorial(5).toString());

       /* int[] a2 = {0, 2, 2, 10, 10, 20};
        int[] a1 = {1, 3, 5, 7, 8, 10, 10};
        System.out.println(Arrays.toString(mergeArrays(a1, a2)));*/

        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука",
                "Лука Лукич"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Господи боже! Я уронил своё пасхальное яйцо от неожиданности!"
        };
        System.out.println(printTextPerRole(roles,textLines));
    }

    public static BigInteger factorial(int value) {//Расчет факториала числа рекурсией через BigInteger
        return value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {//Слияние двухмассивов с сортировкой
        int[] resArr = new int[a1.length + a2.length];
        int resCount = 0;
        int a1Count = 0;
        int a2Count = 0;
        while (resCount < a1.length + a2.length ) {
            if (a1Count < a1.length) {
                if (a2Count < a2.length) {
                    if (a1[a1Count] < a2[a2Count]) {
                        resArr[resCount] = a1[a1Count];
                        a1Count++;
                    } else {
                        resArr[resCount] = a2[a2Count];
                        a2Count++;
                    }
                }else {resArr[resCount] = a1[a1Count];
                    a1Count++;}
            } else if (a2Count < a2.length) {resArr[resCount] = a2[a2Count];
                a2Count++;}
            resCount++;
        }


        return resArr;
    }
    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder resB = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            resB.append(roles[i]).append(":\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i]+':')){
                    resB.append(j+1).append(')');
                    resB.append(textLines[j].substring(textLines[j].indexOf(':')+1));
                    resB.append('\n');
                }
            }resB.append('\n');
        }

        return resB.toString();
    }
}
