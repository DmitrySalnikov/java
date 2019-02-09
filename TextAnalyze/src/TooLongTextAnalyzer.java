public final class TooLongTextAnalyzer implements TextAnalyzer {
    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    public Label processText(String text) {
        if (text.length() > maxLength)
            return Label.TOO_LONG;
        return Label.OK;
    }

    private final int maxLength;
}
