package basicSyntax;

public class ComparisonLogicalOperators {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        boolean isSunny = true;
        boolean isWarm = true;

        int x = 10;
        int y = 4;

        boolean hasPermission = false;

        boolean isGreater = (a > b);
        boolean isSunnyAndWarm = (isSunny && isWarm);
        boolean Sum = (x >= 0 && y % 2 == 0);
        boolean nothasPermission = !hasPermission;

        System.out.println(isGreater);
        System.out.println(isSunnyAndWarm);
        System.out.println(Sum);
        System.out.println(nothasPermission);
    }

}

