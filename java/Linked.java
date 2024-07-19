class Linked {
    public static void red() {
        System.out.println("Red");
        blue();
    }

    public static void blue() {
        System.out.println("Blue");
        green();
    }

    public static void green() {
        System.out.println("green");
        gray();
    }

    public static void gray() {
        System.out.println("gray");
        black();
    }

    public static void black() {
        System.out.println("yellow");
    }
}
