package lambdas;

public class RunnableDemo {
    public static void main (String args[])
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is runnable, anonymous class");
            }
        }).start();

        //Expression Lambda
        new Thread(() -> System.out.println("This is expression lambda")).start();

        //Block Lambda
        new Thread(() -> {
            System.out.println("this is block lambda");
        }).start();

        //Assign Lambda to a variable
        Runnable runnable = () -> System.out.println("lambda assigned to a variable");
        new Thread(runnable).start();
    }

}
