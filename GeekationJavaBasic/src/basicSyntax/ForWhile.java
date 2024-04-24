package basicSyntax;

public class ForWhile {
    public static void main(String[] args) {
        // 1〜100までの数字を順にコンソールに出力してください。ただし、下記の条件を満たしてください。
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        String array[] = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "javascript"};
        //繰り返し処理を行って、条件によって処理
        //equalsメソッドとは、文字列の比較を行うことができる命令文です。
        for (String language : array) {
            if (language.equals("Java")) {
                System.out.println("現在学習中の言語はJavaです。");
            } else if (language.equals("HTML")) {
                System.out.println("HTMLはプログラミング言語ではありません。");
            } else {
                System.out.println("対象のプログラミング言語");
            }
        }
    }
}

