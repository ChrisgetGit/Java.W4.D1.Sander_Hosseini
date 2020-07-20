package Christian.Debugging;

public class DebugDemo2 {

    static float z = 0;

    public static void main(String[] args) {
        System.out.println(modernMachine(5, 2));
    }

    public static float modernMachine(float n, float m) {
        float ix;
        z = m;

        ix = n / z;
        return ix;
    }
}
