public class Palindrome {
    public static boolean isPalindrome(String text) {
        // pasar a minúsculas
        text = text.toLowerCase();

        // eliminar espacios y signos
        String clean = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                clean += c;
            }
        }

        ArrayStack<Character> stack = new ArrayStack<>(clean.length());

        
        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }

        
        String reverse = "";
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        // comparar texto limpio vs inverso
        return clean.equals(reverse);
    }
}