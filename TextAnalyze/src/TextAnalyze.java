public class TextAnalyze {
    private static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; ++i) {
            Label res = analyzers[i].processText(text);
            if (res != Label.OK) {
                return res;
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String[] spam = {"loh", "pidr", "net druzey"};
        TextAnalyzer[] analyzers = {new SpamAnalyzer(spam), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(50)};
        System.out.println(checkLabels(analyzers, "trololotrololo loh pidr"));
        System.out.println(checkLabels(analyzers, "trololotrolololohpidr"));
        System.out.println(checkLabels(analyzers, "trololotrololo :("));
        System.out.println(checkLabels(analyzers, "trololotrololo:|"));
        System.out.println(checkLabels(analyzers, "trolololololololololololololololololololololololololololololololololololololololololololololololololololololololololololo"));
        System.out.println(checkLabels(analyzers, "trololotrololo"));
    }
}
