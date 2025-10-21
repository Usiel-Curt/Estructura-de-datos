public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Integer> myStack = new ArrayStack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.printStack();
        
        myStack.pop();
        System.out.println("----------Eliminamos el ultimo en ser agregado----------");
        myStack.printStack();

        myStack.clear();
        System.out.println("----------Vaciamos todos los datos----------");
        myStack.printStack();
        
    }
}
