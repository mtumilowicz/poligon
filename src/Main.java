public class Main {

    public static void main(String[] args) {
        try {
//            StringDrawer sd = getSawDrawer(SawDrawerName.SAW1, "01234567890123456", 4, 8);
//            sd.draw();
//
//            StringDrawer sd2 = getSawDrawer(SawDrawerName.SAW2, "01234567890123456", 4, 8);
//            sd2.draw();
//
//            StringDrawer sd3 = getSawDrawer(SawDrawerName.SAW3, "01234567890123456", 3, 8);
//            sd3.draw();
//
//            BalanceChecker balanceChecker = BalanceChecker.BalanceCheckerFactory.get(ImmutableMap.of(']', '[', '}', '{', ')', '('));
//            System.out.println(balanceChecker.check("[{[]()(({[()]}))}]"));
//
//            BalancedBracketsGenerator.print(2);
//
//            CombinationWithRepetitionsGenerator.print("(){}", 6);
//
//            BalancedMixedBracketsGenerator.print(3);
//
//            MinimalBracketFlipsToBalance.print(")(");

//            BalancedBracketsGrouper.print("ab");

//            TwoArgumentBracketsGrouper.print("abc");

        } catch (IllegalArgumentException | IllegalStateException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
