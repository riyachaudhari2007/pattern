class pattern {
    public static void main(String args[]) {
        int a, b;
        a = 1;
        while (a <= 5) {
            b = 1;
            while (b <= a) {
                System.out.print("* ");
                b = b + 1;
            }
            System.out.println();
            a = a + 1;
        }
    }
}