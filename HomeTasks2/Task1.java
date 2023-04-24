package HomeTasks2;
// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
public class Task1 {
    public static void main(String[] args) {
            String s= "cda";
        int[] index = {3,2,1};
        System.out.println(shuffle(s,index));
    }
    public static String shuffle(final String s, final int[] index){
        StringBuilder builder = new StringBuilder();
        int count =0;
        for(int i : index){
            builder.append(s.charAt(i-1));
        }
        return builder.toString();
    }
}
