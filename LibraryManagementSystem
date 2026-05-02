/**
 * 2431-CCS-4 - DATA STRUCTURE AND ALGORITHMS
 * GROUP MEMBERS: Fatmah Mhmmad, Ghadah Ali Almalki, Buthainah Mohammed
 * SECTION: 2217
 */

public class LibraryManagementSystem {

    // Nested Node Class
    private static class BookNode {
        String title;
        BookNode next;

        public BookNode(String title, BookNode next) {
            this.title = title;
            this.next = next;
        }
    }

    private BookNode head = null;

    // Operation: Empty Check
    public boolean isEmpty() { return head == null; }

    // Operation: Insertion
    public void addBook(String title) {
        head = new BookNode(title, head);
        System.out.println("[Action] Added Book: " + title);
    }

    // Operation: Deletion
    public void removeBook() {
        if (isEmpty()) {
            System.out.println("[Error] Library is empty.");
            return;
        }
        System.out.println("[Action] Removing: " + head.title);
        head = head.next;
    }

    // Operation: Finding Size (Linear Recursion)
    public int getSizeRecursive(BookNode node) {
        if (node == null) return 0; // Base Case
        return 1 + getSizeRecursive(node.next); // Recursive Step
    }

    // Operation: Searching (Linear Recursion)
    public boolean searchBook(BookNode node, String target) {
        if (node == null) return false; // Base Case: Not found
        if (node.title.equalsIgnoreCase(target)) return true; // Base Case: Found
        return searchBook(node.next, target); // Recursive Step
    }

    // Operation: Printing (Linear Recursion)
    public void printRecursive(BookNode node) {
        if (node == null) return; // Base Case
        System.out.print("[" + node.title + "] -> ");
        printRecursive(node.next); // Recursive Step
    }

    public void display() {
        System.out.print("Current Library: ");
        if (isEmpty()) System.out.println("Empty");
        else {
            printRecursive(head);
            System.out.println("null");
        }
        System.out.println("Total Books: " + getSizeRecursive(head));
    }

    public static void main(String[] args) {
        // --- STUDENT DETAILS ---
        System.out.println("====================================================");
        System.out.println("  KING KHALID UNIVERSITY - COMPUTER SCIENCE DEPT");
        System.out.println("  1. Fatmah Mhmmad     (ID: 439808948)");
        System.out.println("  2. Ghadah Ali Almalki (ID: 445803914)");
        System.out.println("  3. Buthainah Mohammed (ID: 445808592)");
        System.out.println("  SECTION: 2217");
        System.out.println("====================================================\n");

        LibraryManagementSystem library = new LibraryManagementSystem();

        // --- SCENARIO 1: INSERTION ---
        System.out.println("--- SCENARIO 1: Adding Books ---");
        library.addBook("Data Structures");
        library.addBook("Recursive Logic");
        library.addBook("Java Programming");
        library.display();
        System.out.println();

        // --- SCENARIO 2: RECURSIVE SEARCH ---
        System.out.println("--- SCENARIO 2: Searching for Books ---");
        String searchTarget = "Recursive Logic";
        System.out.println("Searching for '" + searchTarget + "': " + 
            (library.searchBook(library.head, searchTarget) ? "Found" : "Not Found"));
        library.display();
        System.out.println();

        // --- SCENARIO 3: DELETION & FINAL STATE ---
        System.out.println("--- SCENARIO 3: Deletion & Empty Check ---");
        library.removeBook();
        library.removeBook();
        System.out.println("Is Library Empty? " + library.isEmpty());
        library.display();
    }
}
