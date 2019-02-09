public final class SpamAnalyzer extends KeywordAnalyzer {
    public SpamAnalyzer(String[] words) {
        keywords = new String[words.length];
        for (int i = 0; i < words.length; ++i) {
            keywords[i] = words[i];
        }
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }

    private final String[] keywords;
}
