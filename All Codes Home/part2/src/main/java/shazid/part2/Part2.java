package shazid.part2;
public class Part2 {
    double d1, d2;
    float  f1, f2;
    int    i1, i2;
    long   l1, l2;
public Part2(double d1, double d2, float f1, float f2, int i1, int i2, long l1, long l2) {
        d1 = d1;
        d2 = d2;
        f1 = f1;
        f2 = f2;
        i1 = i1;
        i2 = i2;
        l1 = l1;
        l2 = l2;
    }
    public double max(double a, double b) {
        return (a > b) ? a : b;
    }
    public float max(float a, float b) {
        return (a > b) ? a : b;
    }
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public long max(long a, long b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        Part2 obj = new Part2(1.0, 2.0, 3.0f, 4.0f, 5, 6, 7L, 8L);
        System.out.println("Max of two doubles: " + obj.max(3.0, 4.0));
        System.out.println("Max of two floats: " + obj.max(5.0f, 6.0f));
        System.out.println("Max of two ints: " + obj.max(7, 8));
        System.out.println("Max of two longs: " + obj.max(9L, 10L));    }}