package basicSyntax;

public class IfSwitch {

    public static void main(String[] args) {
    	
        int num = 2;
        String pref = "東京";
        if (num % 2 == 0) {
            System.out.println("2の倍数");
        } else if (num % 3 == 0) {
            System.out.println("3の倍数");
        } else {
            System.out.println("どちらでもありません。");
        }
        switch (pref) {
            case "北海":
                System.out.println("北海道");
                break;

            case "東京":
                System.out.println("東京");
                break;

            case "京都":
                System.out.println("京都");
                break;

            default:
                System.out.println("当てはまりません。");
        }
    }
}

