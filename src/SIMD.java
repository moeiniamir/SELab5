public class SIMD {
    public static void main(String[] args) {
        int[] a = new int[400000000];
        int[] b = new int[400000000];
        int[] c = add(a, b);
        System.out.println(c[0]);
    }

    private static int[] add(int[] a, int[] b) {
        int [] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i];
        }
        return c;
    }
}
