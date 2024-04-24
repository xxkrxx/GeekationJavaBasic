package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        // int型の値aとbを定義&任意の値を代入
        int a = 10;
        int b = 5;

        //Resultに代入
        int addResult = add(a, b);
        int subtracResult = subtract(a, b);
        int multipliResult = multiply(a, b);
        int divideResult = divide(a, b);

        //printResultメソッドを使用して各結果を出力
        printResult(addResult);
        printResult(subtracResult);
        printResult(multipliResult);
        printResult(divideResult);
    }

    //メソッド１　足し算
    public static int add(int a, int b) {
        return a + b;
    }

    //メソッド2　引き算
    public static int subtract(int a, int b) {
        return a - b;
    }

    //メソッド3 掛け算
    public static int multiply(int a, int b) {
        return a * b;
    }

    //メソッド4 割り算
    public static int divide(int a, int b) {
        return a / b;
    }

    //出力
    public static void printResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }
}

