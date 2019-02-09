public final class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    private final String[] keywords = {":(", "=(", ":|"};
}
