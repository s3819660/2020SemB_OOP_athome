package wk5.demo;

public class Math {
    public static int sqrt(int num) throws InvalidParamException {
        if(num < 0)
            throw new InvalidParamException();

        for (int i = 0; i < num; i++) {
            if (i*i == num)
                return i;
        }
        throw new InvalidParamException();
    }

    public static int sqrt2(int num) {
        if(num < 0)
            throw new RuntimeException();

        for (int i = 0; i < num; i++) {
            if (i*i == num)
                return i;
        }
        throw new RuntimeException();
    }

    static void user() throws InvalidParamException {
        Math.sqrt(-1);
    }

    public static void main(String[] args) {
        try {
            user();
            Math.sqrt(-1);
            Math.sqrt(16);
        } catch (InvalidParamException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("haha");
        }

        Math.sqrt2(-1);

        System.out.println("Completed!");

    }
}
