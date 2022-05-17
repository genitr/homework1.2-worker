package src;

@FunctionalInterface
public interface OnTaskErrorListener {

    public void onError(String result);
}
