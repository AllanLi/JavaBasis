package basis.II;

/*
 * 取得當前程式行數
 */

public class LineNumber {
    private static final Throwable throwable = new Throwable();
    public static synchronized int getLineNumber() {
        throwable.fillInStackTrace();
        StackTraceElement[] elements = throwable.getStackTrace();
        return (elements == null || elements.length <= 1) ? -1 : elements[1].getLineNumber();
    }
}
