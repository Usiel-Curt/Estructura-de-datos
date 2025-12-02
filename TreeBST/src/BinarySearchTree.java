public class BinarySearchTree {

    private Node root;

    public void insert(int  value){
        //invocacion recursivo, para saber en donde se coloca el nuevo nodo
        root = insertRecursive(root, value);

    }

    private Node insertRecursive(Node current, int valor){
        //Caso base, cuando current sea null, entonces aqui se crea un nuevo nodo
        if(current==null){
            return new Node(valor);
        }

        //Si el valor a insertar es menor al actual, entonces vamos al subarbol izquierdo
        if(valor < current.value){
            current.left = insertRecursive(current.left, valor);
        }
        //Si el valor a insertar es menor al actual, entonces vamos al subarbol derecho
        
        if(valor > current.value){
            current.right = insertRecursive(current.right, valor);
        }

        return current;
    }

    public void printlnInOrder(){
        printlnInOrderRecursive(root);
    }

    public void printlnInOrderRecursive(Node current){
        if(current != null){
            printlnInOrderRecursive(current.left);
            System.out.println(current.value + " ");
            printlnInOrderRecursive(current.right);
        }
    }

}
