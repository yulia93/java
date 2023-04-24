public static void main(String[] args) throws IOException {
    String result = showTotalAmount(5);
}

public static String showTotalAmount(int value) {
    int result = 0;
    for (int i = 1; i <= value; i++) {
        result += i;
    }
    return String.valueOf(result);
}