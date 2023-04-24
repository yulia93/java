package HomeTasks2;
//Task0
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
public class Task0 {
    public static void main(String[] args) {
        String jewels = "aB", stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels,stones));
    }
    public static String findJewelsInStones(String jewels, String stones) {
            StringBuilder builder = new StringBuilder();
            char [] jew = jewels.toCharArray();
            char [] st = stones.toCharArray();
                for (char i:jew){
                    int count = 0;
                    for(char j:st){
                        if (i==j) count++;
                    }
                    builder.append(i);
                    builder.append(count);
                }
                return builder.toString();
    }
}
