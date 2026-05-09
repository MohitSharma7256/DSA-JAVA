// ============================================================
//  JAVA — HOW JAVA CODE RUNS? (Step-by-Step)
//  DSA Notes | Beginner Level
// ============================================================
//
//  Java ka execution process do steps mein hota hai: 
//  1. Compilation  (Source Code → Bytecode)
//  2. Execution    (Bytecode → Native Code)
//
//  Isi wajah se Java ko "Platform Independent" kehte hain.
//
// ============================================================
//  STEP-BY-STEP PROCESS:
// ============================================================
//
//  1. SOURCE CODE (.java file):
//     - Hum jo code likhte hain (human-readable), usko Source Code kehte hain.
//     - File extension: .java (e.g., Hello.java)
//
//  2. COMPILER (javac):
//     - Jab hum `javac Hello.java` command chalate hain, toh Java Compiler 
//       usko check karta hai.
//     - Agar koi error nahi hai, toh wo ek naya file banata hai: .class file.
//
//  3. BYTECODE (.class file):
//     - Yeh file human-readable nahi hoti, balki Bytecode hota hai.
//     - Yeh "Platform Independent" hota hai (kisi bhi OS par chal sakta hai).
//
//  4. JVM (Java Virtual Machine):
//     - Jab hum `java Hello` command chalate hain, toh JVM Bytecode ko padhta hai.
//     - JVM Bytecode ko computer ki language (Machine Code) mein badal deta hai.
//     - Har OS (Windows, Mac, Linux) ka apna JVM hota hai.
//
// ============================================================
//  ARCHITECTURE DIAGRAM (Mind Map):
// ============================================================
//
//  [Source Code (.java)] 
//          ↓ 
//      (COMPILER - javac)
//          ↓ 
//     [Bytecode (.class)]  ←--- "Write Once, Run Anywhere"
//          ↓ 
//      (JVM - Java Virtual Machine)
//          ↓ 
//    [Native Machine Code]
//          ↓ 
//      (EXECUTION)
//
// ============================================================
//  IMPORTANT DEFINITIONS:
// ============================================================
//
//  JDK (Java Development Kit): 
//  → JRE + Development Tools (Compiler, Debugger). 
//  → Developers ke liye zaroori hai.
//
//  JRE (Java Runtime Environment): 
//  → JVM + Libraries. 
//  → Java applications ko sirf run karne ke liye zaroori hai.
//
//  JVM (Java Virtual Machine): 
//  → Main engine jo Bytecode ko run karta hai. 
//  → Iski wajah se Java safe aur platform-independent hai.
//
// ============================================================

public class Ch01_JavaExecution {

    public static void main(String[] args) {
        System.out.println("=== HOW JAVA RUNS ===");
        System.out.println("1. Programmer writes .java code");
        System.out.println("2. 'javac' command converts it to .class (Bytecode)");
        System.out.println("3. 'java' command makes JVM run the Bytecode");
        System.out.println("4. JVM converts Bytecode to Machine Code for your OS");
        
        System.out.println("\nSUCCESS: Program is running via JVM!");
    }
}

// ============================================================
//  WHY IS JAVA SLOW (Initially)?
// ============================================================
//
//  Kyunki pehle compilation hota hai, phir interpretation. 
//  Lekin aaj kal JIT (Just-In-Time) Compiler ki wajah se 
//  Java bahut fast ho gaya hai.
//
// ============================================================
