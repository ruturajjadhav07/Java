public class Main { // Fixed class name typo: Strinngs -> Strings
    public static void main(String[] args) {

        // StringBuilder used to change or modify the string
        StringBuilder sb = new StringBuilder("Rutu");
        System.out.println(sb); // Printing the original string
        System.out.println(sb.charAt(0)); // Printing the character at index 0

        sb.setCharAt(0, 'T'); // Changing the character at index 0
        System.out.println(sb); // Printing the modified string

        sb.insert(4, 'u'); // Inserting a character at index 4
        System.out.println(sb); // Printing the modified string

        sb.delete(3, 4); // Deleting the character from index 3 to 4 (exclusive)
        System.out.println(sb); // Printing the modified string

        sb.append('u'); // Adding a character at the end
        System.out.println(sb); // Printing the final string
    }
}
