public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Character> stack1 = new ArrayStack<>();
        stack1.print();
        stack1.push('A'); 
        stack1.push('B'); 
        stack1.push('C'); 
        stack1.pop();
        stack1.print();
    }
}