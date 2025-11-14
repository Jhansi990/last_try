public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // Prints "Hello, World!" to the console
    }
}
Explanation:
public class HelloWorld: This line declares a class named HelloWorld. In Java, all code resides within classes. The public keyword makes the class accessible from any other class.
public static void main(String[] args): This is the main method, the entry point for any Java application.
public: Makes the method accessible from outside the class.
static: Allows the method to be called without creating an instance of the HelloWorld class.
void: Indicates that the method does not return any value.
main: The standard name for the main method.
(String[] args): This declares an array of String objects named args, which can be used to pass command-line arguments to the program.
System.out.println("Hello, World!");: This line prints the string "Hello, World!" to the console, followed by a new line.
System: A built-in Java class that provides access to system resources.
out: A static member of the System class, representing the standard output stream.
println(): A method of the PrintStream class (accessed via System.out) that prints a string and then a new line.
