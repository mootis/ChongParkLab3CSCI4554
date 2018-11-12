public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int[] eea(int r0, int r1) {
        // Size needs to be changed
        int[] s = new int[5];
        int[] t = new int[5];
        int[] r = new int[5];
        int[] q = new int[5];

        int i = 1;

        s[0] = 1;
        s[1] = 0;
        t[0] = 0;
        t[1] = 1;

        // Based on the loop given in the book
        do {
            i += 1;
            r[i] = r[i-2] % r[i-1];
            q[i-1] = (r[i-2] -r[i])/r[i-1];
            s[i] = s[i-2]-q[i-1]*s[i-1];
            t[i] = t[i-2] - q[i-1] * t[i-1];
        } while (r[i] != 0);

        // Will be used in return statement
        int gcd = r[i-1];
        int s = s[i-1];
        int t = t[i-1];

        return (gcd, s, t);
    }
}
