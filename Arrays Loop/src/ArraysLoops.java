import java.lang.module.FindException;

public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 44;
        a[3] = 5;
        a[4] = -6;

        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 5, 1, -7, 2, 3};
        System.out.println(array[0]);
        System.out.println(array[array.length - 1]);

        int[] x;
        x = new int[]{4, 5, 6, 7, 78, 3};


        int y = 4;
        if (y > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Non Positive");
        }

        System.out.println(y > 0 ? "positive" : "non positive");

        y = 6;

        if (y == 1) {
            System.out.println("One");
        } else {
            if (y == 2) {
                System.out.println("Two");
            } else {
                if (y == 3) {
                    System.out.println("Three");
                } else
                    System.out.println("Nothing");
            }

        }
        y = 2;
        switch (y) {
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("default");

        }

        System.out.println("-------");
        int counter = 1;

        while (counter < 11) {
            System.out.print(counter++ + " ");

        }

        while (y <= 4) {
            System.out.println("Barev");
            y++;
        }

        y = 1;
        System.out.println("----");
        do {
            System.out.println("Hi");
            y++;
        } while (y <= 6);

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("-----");
        String[] names = {"A1", "A2", "A3", "A4"};
        for (int index = 0; index < names.length - 1; index++) ;
        System.out.println(names);

        for (String s : names) {
            System.out.println(s);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);

        }
        int[] array2 = {4, 5, -8, 6, -9};
        for (int element : array2) {
            if (element < 0) {
                System.out.println("YES");
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                continue;
                System.out.println(i);
        }
    }
}
