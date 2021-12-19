public class StashMergeConflictGit {
    public static void main(String[] args) {
        //   master d1 
        double d= 234.12413;
        String text = Double.toString(Math.abs(d));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        System.out.println(decimalPlaces);
        System.out.println("master d1 branch  changes");
        System.out.println("master d1 branch  commit for cherry pick");

    }

}
