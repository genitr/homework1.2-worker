package src;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        int errorTask = 33;
        for (int i = 0; i < 100; i++) {
            if (i == errorTask) errorCallback.onError("Задача " + i + " не выполнена");
            callback.onDone("Задача " + i + " выполнена");
        }
    }
}
