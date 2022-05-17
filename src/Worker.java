package src;

public class Worker {

    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        int errorTask = 33;
        for (int i = 0; i < 100; i++) {
            callback.onDone("Задача " + i + " выполнена");
        }
    }
}
