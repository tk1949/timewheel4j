public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer(1, 10);
        System.out.println("start\t" + System.currentTimeMillis());
        timer.addTask(new TimerTask(10000, () -> {
            System.out.println("task\t" + System.currentTimeMillis());
        }));
        System.out.println("stop\t" + System.currentTimeMillis());
    }
}
