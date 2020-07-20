package Amin.debugging;
public class DebugDemo4 {

    public static void main(String[] args) {
        FakeStack stack = new FakeStack(20);
        stack.push(3);
        stack.push(15);
        stack.push("K");
        stack.show();
        stack.pop();
        stack.show();
        stack.show(0); // Display first value of Stack
    }

}








