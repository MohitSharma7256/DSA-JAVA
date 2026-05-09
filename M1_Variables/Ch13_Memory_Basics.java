// ============================================================
//  CH-13: MEMORY BASICS (Stack vs Heap)
//  DSA Module 1: Variables | Deep Understanding
// ============================================================
//
//  Java mein variables memory mein do jagah store hote hain:
//
//  1. STACK MEMORY:
//     - Yahan saare "Primitive" types (int, float, etc.) store hote hain.
//     - Yeh fast hoti hai.
//     - Local variables yahan rehte hain.
//
//  2. HEAP MEMORY:
//     - Yahan saare "Objects" aur "Non-Primitives" (Strings, Arrays) store hote hain.
//     - Stack mein sirf unka "Reference" (Address) hota hai.
//
// ============================================================

public class Ch13_Memory_Basics {

    public static void main(String[] args) {
        
        // ── 1. Stack Storage ────────────────────────────────
        int age = 25;       // Ye directly Stack mein hai
        double price = 99.9; // Ye bhi Stack mein hai

        // ── 2. Heap Storage ─────────────────────────────────
        String name = "Mohit"; 
        // "Mohit" asaliyat mein HEAP mein hai.
        // Stack mein sirf 'name' naam ka ek pointer hai jo 
        // Heap ke address ko point kar raha hai.

        System.out.println("Memory Logic: Primitives are in Stack, Objects are in Heap.");
    }
}
