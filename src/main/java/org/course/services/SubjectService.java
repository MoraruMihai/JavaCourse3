package org.course.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SubjectService {

//    public String getContent(String chapterName, String subjectName) {
//      return dummyContent();
//    }
    public String getSubjectContent(String chapterName, String subjectName){
        if(allSubjectsContent == null){
            initSubjectsContent();
        }
        return (allSubjectsContent.get(chapterName) + allSubjectsContent.get(subjectName));
    }

        private static Map<String,String> allSubjectsContent;

    private void initSubjectsContent(){
        allSubjectsContent = new HashMap<>();
        allSubjectsContent.put("Expressions","Expressions:\n" +
                "Expressions are essential building blocks of any Java program, usually created to produce a new value,\n" +
                "although sometimes an expression assigns a value to a variable. Expressions are built using values,\n" +
                "variables, operators and method calls.\n" +
                "Types of Expressions: While an expression frequently produces a result, it doesn't always. There are\n" +
                "three types of expressions in Java:\n" +
                "1.\tThose that produce a value, i.e., the result of\n" +
                "(1\t+ 1)\n" +
                "2.\tThose that assign a variable, for example\n" +
                "(v = 10)\n" +
                "3.\tThose that have no result but might have a \"side effect\" because an expression can include a wide\n" +
                "range of elements such as method invocations or increment operators that modify the state (i.e., memory)\n" +
                "of a program.");
        allSubjectsContent.put("Variables", "Variables:\n" +
                "Variable is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of \"vary + able\" that means its value can be changed.\n" +
                "There are three types of variables in Java: local variable, instance variable, static variable.\n" +
                "Local Variable - A variable declared inside the body of the method is called local variable. You can use\n" +
                "this variable only within that method and the other methods in the class aren't even aware that the\n" +
                "variable exists. A local variable cannot be defined with \"static\" keyword.\n" +
                "Instance Variable - A variable declared inside the class but outside the body of the method, is called\n" +
                "instance variable. It is not declared as static. It is called instance variable because its value is\n" +
                "instance specific and is not shared among instances.\n" +
                "Static variable - A variable which is declared as static is called static variable. It cannot be local.\n" +
                "You can create a single copy of static variable and share among all the instances of the class. Memory\n" +
                "allocation for static variable happens only once when the class is loaded in the memory.\n");
        allSubjectsContent.put("Primitives","Primitives:\n" +
                "In Java language, primitive data types are the building blocks of data manipulation. These are the most\n" +
                "basic data types available in Java language.\n" +
                "There are 8 types of primitive data types: boolean data type, byte data type, char data typeshort data\n" +
                "type, int data type, long data type, float data type, double data type\n" +
                "Boolean - The Boolean data type is used to store only two possible values: true and false. This data type\n" +
                "is used for simple flags that track true/false conditions. The Boolean data type specifies one bit of\n" +
                "information, but its \"size\" can't be defined precisely.\n" +
                "Example: Boolean one = false\n" +
                "Byte - The byte data type is an example of primitive data type. It isan 8-bit signed two's complement integer. Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. Its default value is 0.\n" +
                "The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer. It can also be used in place of \"int\" data type.\n" +
                "Example: byte a = 10, byte b = -20\n" +
                "Short - The short data type is a 16-bit signed two's complement integer. Its value-range lies between -32,768 to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.\n" +
                "Example: short s = 10000, short r = -5000\n" +
                "Int - The int data type is a 32-bit signed two's complement integer. Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0. The int data type is generally used as a default data type for integral values unless if there is no problem about memory.\n" +
                "Example: int a = 100000, int b = -200000\n" +
                "Long - The long data type is a 64-bit two's complement integer. Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. Its default value is 0. The long data type is used when you need a range of values more than those provided by int.\n" +
                "Example: long a = 100000L, long b = -200000L\n" +
                "Float - The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. The float data type should never be used for precise values, such as currency. Its default value is 0.0F.\n" +
                "Example: float f1 = 234.5f\n" +
                "Double - The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data type is generally used for decimal values just like float. The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.\n" +
                "Example: double d1 = 12.3\n" +
                "Char - The char data type is a single 16-bit Unicode character. Its value-range lies between '\\u0000' (or 0) to '\\uffff' (or 65,535 inclusive).The char data type is used to store characters.\n" +
                "Example: char letterA = 'A'.\n");
        allSubjectsContent.put("Casting", "Casting:\n" +
                "Casting is the action of converting between two different data types such as converting an int to a double and vice versa. Examine the code below for examples of casting.\n" +
                "**CastingExample.java\n" +
                "package exlcode;\n" +
                "\n" +
                "public class CastingExample {\n" +
                "\n" +
                "  // this converts 15.23 into an integer\n" +
                "  public static int exampleVariableOne = (int) 15.23;\n" +
                "  public static double exampleVariableTwo = exampleVariableOne;\n" +
                "\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(exampleVariableOne);\n" +
                "    System.out.println(exampleVariableTwo);\n" +
                "  }\n" +
                "\n" +
                "}\n" +
                "We just converted the double value 15.23 into an integer, which left only the whole number and the decimal places to be cut off. There is no rounding, it just ignores the numbers after the decimal point during casting. When you convert an int to a double, a decimal point will be added to match with the structure of a double. For example, double varOne = (double) 15; assigns 15.0 to varOne.\n" +
                "Even though it is possible to convert an int to a double without casting, it is best practice to always use casting for precision and thorough logic. Also, be careful with the loss of precision when converting data types. i.e. losing decimal points is losing precision.\n" +
                "\uF0D8\tTernary Operator");
        allSubjectsContent.put("Logical Operators","Logical Operators:\n" +
                "Logical operators are mainly used to control program flow. Usually, you will find them as part of an if, a while, or some other control statement (Chapter 6)\n" +
                "The Logical operators are:\n" +
                "op1 && op2\n" +
                "-- Performs a logical AND of the two operands.\n" +
                "op1 || op2\n" +
                "-- Performs a logical OR of the two operands.\n" +
                "!op1\n" +
                "-- Performs a logical NOT of the operand.\n" +
                "The concept of logical operators is simple. They allow a program to make a decision based on multiple conditions. Each operand is considered a condition that can be evaluated to a true or false value. Then the value of the conditions is used to determine the overall value of the op1 operator op2 or !op1 grouping. The following examples demonstrate different ways that logical conditions can be used.\n" +
                "The && operator is used to determine whether both operands or conditions are true and.pl.\n" +
                "For example:\n" +
                "if ($firstVar == 10 && $secondVar == 9) {\n" +
                "\n" +
                "    print(\"Error!\");\n" +
                "\n" +
                "};\n" +
                "If either of the two conditions is false or incorrect, then the print command is bypassed.\n" +
                "The || operator is used to determine whether either of the conditions is true.\n" +
                "For example:\n" +
                "if ($firstVar == 9 || $firstVar == 10) {\n" +
                "\n" +
                "    print(\"Error!\");\n" +
                "If either of the two conditions is true, then the print command is run.\n" +
                "Caution If the first operand of the || operator evaluates to true, the second operand will not be evaluated. This could be a source of bugs if you are not careful.\n" +
                "For instance, in the following code fragment:\n" +
                "if ($firstVar++ || $secondVar++) { print(\"\\n\"); }\n" +
                "variable $secondVar will not be incremented if $firstVar++ evaluates to true.\n" +
                "The ! operator is used to convert true values to false and false values to true. In other words, it inverts a value. Perl considers any non-zero value to be true-even string values. For example:\n" +
                "\n" +
                "    $firstVar = 10;\n" +
                "    $secondVar = !$firstVar;\n" +
                "    if ($secondVar == 0) {\n" +
                "        print(\"zero\\n\");\n" +
                "    }\n" +
                "is equal to 0- and the program produces the following output:\n" +
                "zero\n" +
                "You could replace the 10 in the first line with \"ten,\" 'ten,' or any non-zero, non-null value.");
        allSubjectsContent.put("Ternary Operator", "Ternary Operator:\n" +
                "The if Statement\n" +
                "Use the if statement to specify a block of Java code to be executed if a condition is true.\n" +
                "\n" +
                "^^Syntax\n" +
                "if (condition) {\n" +
                "  // block of code to be executed if the condition is true\n" +
                "}\n" +
                "\n" +
                "!! Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.\n" +
                "\n" +
                "In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:\n" +
                "\n" +
                "**Example\n" +
                "if (20 > 18) {\n" +
                "  System.out.println(\"20 is greater than 18\");\n" +
                "}\n" +
                "\n" +
                "We can also test variables:\n" +
                "\n" +
                "**Example\n" +
                "int x = 20;\n" +
                "int y = 18;\n" +
                "if (x > y) {\n" +
                "  System.out.println(\"x is greater than y\");\n" +
                "}\n" +
                "\n" +
                "Example explained\n" +
                "In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that \"x is greater than y\".\n" +
                "\n");
        allSubjectsContent.put("Keywords", "Keywords:\n" +
                "Java keywords are also known as reserved words. Keywords are particular words which acts as a key to a code. These are predefined words by Java so it cannot be used as a variable or object name.\n" +
                "A list of Java keywords or reserved words are given below:\n" +
                "1.\tabstract: Java abstract keyword is used to declare abstract class. Abstract class can provide the implementation of interface. It can have abstract and non-abstract methods.\n" +
                "2.\tboolean: Java boolean keyword is used to declare a variable as a boolean type. It can hold True and False values only.\n" +
                "3.\tbreak: Java break keyword is used to break loop or switch statement. It breaks the current flow of the program at specified condition.\n" +
                "4.\tbyte: Java byte keyword is used to declare a variable that can hold an 8-bit data values.\n" +
                "5.\tcase: Java case keyword is used to with the switch statements to mark blocks of text.\n" +
                "6.\tcatch: Java catch keyword is used to catch the exceptions generated by try statements. It must be used after the try block only.\n" +
                "7.\tchar: Java char keyword is used to declare a variable that can hold unsigned 16-bit Unicode characters\n" +
                "8.\tclass: Java class keyword is used to declare a class.\n" +
                "9.\tcontinue: Java continue keyword is used to continue the loop. It continues the current flow of the program and skips the remaining code at the specified condition.\n" +
                "10.\tdefault: Java default keyword is used to specify the default block of code in a switch statement.\n" +
                "11.\tdo: Java do keyword is used in control statement to declare a loop. It can iterate a part of the program several times.\n" +
                "12.\tdouble: Java double keyword is used to declare a variable that can hold a 64-bit floating-point numbers.\n" +
                "13.\telse: Java else keyword is used to indicate the alternative branches in an if statement.\n" +
                "14.\tenum: Java enum keyword is used to define a fixed set of constants. Enum constructors are always private or default.\n" +
                "15.\textends: Java extends keyword is used to indicate that a class is derived from another class or interface.\n" +
                "16.\tfinal: Java final keyword is used to indicate that a variable holds a constant value. It is applied with a variable. It is used to restrict the user.\n" +
                "17.\tfinally: Java finally keyword indicates a block of code in a try-catch structure. This block is always executed whether exception is handled or not.\n" +
                "18.\tfloat: Java float keyword is used to declare a variable that can hold a 32-bit floating-point number.\n" +
                "19.\tfor: Java for keyword is used to start a for loop. It is used to execute a set of instructions/functions repeatedly when some conditions become true. If the number of iteration is fixed, it is recommended to use for loop.\n" +
                "20.\tif: Java if keyword tests the condition. It executes the if block if condition is true.\n" +
                "21.\timplements: Java implements keyword is used to implement an interface.\n" +
                "22.\timport: Java import keyword makes classes and interfaces available and accessible to the current source code.\n" +
                "23.\tinstanceof: Java instanceof keyword is used to test whether the object is an instance of the specified class or implements an interface.\n" +
                "24.\tint: Java int keyword is used to declare a variable that can hold a 32-bit signed integer.\n" +
                "25.\tinterface: Java interface keyword is used to declare an interface. It can have only abstract methods.\n" +
                "26.\tlong: Java long keyword is used to declare a variable that can hold a 64-bit integer.\n" +
                "27.\tnative: Java native keyword is used to specify that a method is implemented in native code using JNI (Java Native Interface).\n" +
                "28.\tnew: Java new keyword is used to create new objects.\n" +
                "29.\tnull: Java null keyword is used to indicate that a reference does not refer to anything. It removes the garbage value.\n" +
                "30.\tpackage: Java package keyword is used to declare a Java package that includes the classes.\n" +
                "31.\tprivate: Java private keyword is an access modifier. It is used to indicate that a method or variable may be accessed only in the class in which it is declared.\n" +
                "32.\tprotected: Java protected keyword is an access modifier. It can be accessible within package and outside the package but through inheritance only. It can't be applied on the class.\n" +
                "33.\tpublic: Java public keyword is an access modifier. It is used to indicate that an item is accessible anywhere. It has the widest scope among all other modifiers.\n" +
                "34.\treturn: Java return keyword is used to return from a method when its execution is complete.\n" +
                "35.\tshort: Java short keyword is used to declare a variable that can hold a 16-bit integer.\n" +
                "36.\tstatic: Java static keyword is used to indicate that a variable or method is a class method. The static keyword in Java is used for memory management mainly.\n" +
                "37.\tstrictfp: Java strictfp is used to restrict the floating-point calculations to ensure portability.\n" +
                "38.\tsuper: Java super keyword is a reference variable that is used to refer parent class object. It can be used to invoke immediate parent class method.\n" +
                "39.\tswitch: The Java switch keyword contains a switch statement that executes code based on test value. The switch statement tests the equality of a variable against multiple values.\n" +
                "40.\tsynchronized: Java synchronized keyword is used to specify the critical sections or methods in multithreaded code.\n" +
                "41.\tthis: Java this keyword can be used to refer the current object in a method or constructor.\n" +
                "42.\tthrow: The Java throw keyword is used to explicitly throw an exception. The throw keyword is mainly used to throw custom exception. It is followed by an instance.\n" +
                "43.\tthrows: The Java throws keyword is used to declare an exception. Checked exception can be propagated with throws.\n" +
                "44.\ttransient: Java transient keyword is used in serialization. If you define any data member as transient, it will not be serialized.\n" +
                "45.\ttry: Java try keyword is used to start a block of code that will be tested for exceptions. The try block must be followed by either catch or finally block.\n" +
                "46.\tvoid: Java void keyword is used to specify that a method does not have a return value.\n" +
                "47.\tvolatile: Java volatile keyword is used to indicate that a variable may change asynchronously.\n" +
                "48.\twhile: Java while keyword is used to start a while loop. This loop iterates a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop.\n");
        allSubjectsContent.put("Statements, whitespace & Indentation","Statements, White Spaces and Indentation:\n" +
                "     Java statements\n" +
                "-\tare instructions that tell the programming language what to do. A basic statement, like an assignment statement, assigns a value to a variable, as shown below:\n" +
                "**Example:\n" +
                "double entryFee = 15.75;\n" +
                "All Java statements must end in a semicolon (;). This tells Java that it should attempt to process all information up to that semicolon.\n" +
                "In our example, we declared a variable and gave it a value. For the next couple of examples, we'll look at some Java methods that offer a different way to declare a variable.\n" +
                "White Spaces\n" +
                "White space consists mostly of the space character that you produce by hitting the space bar on your keyboard and that is commonly used to separate words in sentences. There are four other white space characters in Java, the horizontal tab, the form feed, the carriage return, and the linefeed. Depending on your platform, when you hit the return or enter key, you get either a carriage return (the Mac), a linefeed (Unix) or both (DOS, Windows, VMS). This produces a hard line break in the source code text.\n" +
                "\n" +
                "Outside of String literals Java treats all white space and runs of white space (more than one white space character in immediate succession) the same. It's used to separate tokens, and one space is as good as seven spaces, a tab and two carriage returns. Exactly which white space characters you use is primarily a result of what's convenient for human beings reading the code. The compiler doesn't care.\n" +
                "  Indentation\n" +
                "Indentation is used to make our code readable to other users, easier to edit, display how the braces match up and show the logic of the program in an organized fashion. Please look at the example below to see how indentation of the if-else statement makes it easy to see what is happening.\n" +
                "** IndentationExample.java\n" +
                "package exlcode;\n" +
                "public class IndentationExample {\n" +
                "  // standard indenting increases by 2 spaces as shown below\n" +
                "  // braces are used even when optional\n" +
                "  public static void main(String[] args) {\n" +
                "    // neat indenting:\n" +
                "    // if-else will be explained in Unit 5\n" +
                "    if (true) {\n" +
                "      System.out.println(\"True\");\n" +
                "    } else {\n" +
                "      System.out.println(\"False\");\n" +
                "    }\n" +
                "    // no indenting:\n" +
                "    if(true)          System.out.println(\"True\");\n" +
                "    else    System.out.println(\"False\");\n" +
                "  }\n" +
                "}\n" +
                "The goal of indentation is to show the logic of our program. Keeping indentation consistent throughout a program is essential. For statements inside a left and right brace, increase the indenting by two spaces. When another pair of braces is nested inside those braces, increase the indentation by another two spaces. It is a good idea to line up the braces vertically. Keep in mind that the function of indentation is to make the program more readable and understandable, which saves an immense amount of time when editing or refining your code.\n" +
                "\uF0D8\tMethods\n" +
                "Java methods are blocks of code that perform a task, and can be used by other parts of a computer program, such as a declaration statement. For example, one basic function of a computer is display information to the screen. Why should we have to re-write that logic over and over? Instead, this Java declaration statement uses a delivered function to display information on multiple lines.\n" +
                "\n" +
                "System.out.println(\"Line 1\");\n" +
                "System.out.println(\"Line 2\");\n" +
                "And the output of the previous code.\n" +
                "Remember, each Java statement ends with a semicolon.\n" +
                "We've just seen the basic variable declaration statement in action. Now let's look at another example you'll see a lot: a Java string statement, or a collection of characters or objects. For the purposes of this lesson, we won't be delving into the nitty gritty of Java classes or blueprints and objects. We'll just focus on the statements themselves and how they're formulated.\n" +
                "\n" +
                "String entryCode = new String();\n" +
                "Now that we've covered some basic Java statements, let's take a look at some others that you're likely to see. There are always some exceptions to the rules, like the semicolon rule.\n");
        allSubjectsContent.put("Code Blocks","Code Blocks:\n" +
                "A block is a group of zero or more statements between balanced braces and can be used anywhere a single\n" +
                "statement is allowed. Java likes to keep things between the lines, no make that curly braces({}).\n" +
                "This how we can start and stop a code block in Java. Braces gives the compiler a heads up of where we want to start({) and end(}).\n" +
                "\n" +
                "package com.javablocks;\n" +
                "\n" +
                "public class JavaCodeBlocks {\n" +
                "\t\tpublic static void main (String arg[]) {\n" +
                "\t\t\tSystem.out.println(“Inside the Java code block”);\n" +
                "\t\t\t\t}\n" +
                "}\n" +
                "\n" +
                "In our first example we have not one but two code blocks. First, for the JavaCodeBlock class with the open brace on line 3. Next on line 4 we open the main method with another open brace. Then we close it up on line 6 for the main method and line 7 for the class. A pro tip, most IDEs will highlight the closing brace when you put your cursor by the open brace and vice versa too.\n" +
                "package com.javablocks;\n" +
                "\tpublic class void main(String arg[]) {\n" +
                "\t\tBoolean check = true;\n" +
                "\t\t\tIf(check) {\n" +
                "\t\t\t\tSystem.out.println(“Check is true”);\n" +
                "\t\t\t}else {\n" +
                "\t\t\t\tSystem.out.println(“Check is false”);\n" +
                "\t\t\t}\n" +
                "\t\t\t{\n" +
                "\t\t\t\tSystem.out.println(“Just a random code block”);\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "In this example we have an if else with each having their own code block. We don’t have to but helps with readability. Later on we have a random code block too. It looks like it should be wrong if you are new to development but it is perfectly legitimate.\n" +
                "Java has a few types of code blocks :\n" +
                "anonymous - Anonymous code blocks really stand out. They are also called instance initialization blocks. They are run before the constructor is called.\n" +
                "named - We can also create blocks of code and give them a name.\n" +
                "static - Java has another code block called static code block as we use the static keyword for them.\n");
    }

    private String dummyContent(){
        return "Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type. In short constructor and method are different(More on this at the end of this guide). People often refer constructor as special type of method in Java. Constructor has same name as the class and looks like this in a java code.\n" +
                "public class MyClass{\n" +
                "           //this is the constructor\n" +
                "\tMyClass(){\n" +
                "\t}\n" +
                "\t..\n" +
                "}\n" +
                "To understand the working of constructor, lets take an example. lets say we have a class MyClass.\n" +
                "When we create the object of MyClass like this:\n" +
                "MyClass obj = new MyClass();\n" +
                "The new keyword here creates the object of class MyClass and invokes the constructor to initialize this newly created object.\n";
    }

}
