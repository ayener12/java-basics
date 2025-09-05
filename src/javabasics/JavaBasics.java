/*
Welcome to COMP 127!

Students come into this class with prior programming experience, but that experience is not
always in Java. This file is a reading assignment designed to catch you up on some basics of Java
if it’s new to you, and introduce everyone to some key concepts for the course.

If you have not coded in Java before: Use this reading to apply your existing knowledge to this
unfamiliar language.

If you _do_ already know some Java: Be on the lookout for vocabulary, concepts, and details you may
have missed along the way. This reading is still for you.

────────────────────────────────────────────────

In addition to being a reading, this file is also code. You can run it! You can change it! You can
experiment with it! Please follow these instructions:

    https://docs.google.com/document/d/1ihULLCsFm59TgIML0BBOERLI899MKRqDcr-NBOIRZGs/edit

When you run it, you will see the program’s output, beginnig with the message “Hello there!”.
Where did that output come from? What is it demonstrating? Read on.

────────────────────────────────────────────────

Note that even though this file is code, Java will ignore these English instructions. Why?
Because they are inside a comment. Java has two different ways to write comments:

The first way is the slash-asterisk syntax. This comment you are reading right now started with the
slash-asterisk sequence at the top of this file. The comment can continue across many lines. It
extends until the next asterisk-slash, like this:
*/

// This is also a comment. It starts with the double slash, and extends only to the end of the line.
// To keep this comment going on another line, we need another double slash.

/*
Whatever programming language(s) you already know doubtless also have some way to write comments,
but it might not look the same. In Python, for example, the # character denotes a comment. Not so
in Java! This is a difference in _syntax_:

    SYNTAX refers to the rules for expressing code in some fixed form (usually text).

    SEMANTICS is what code _means_ in a given language, the rules for what each building block of
    the language _does_ when the program runs.

When you are learning a new programming language, or when you are learning to program for the first
time, syntax will consume a lot of your attention at first. Syntax can be overwhelming. Even if you
are an experienced programmer, syntactic differences can be overwhelming when you learn a new
and different language.

Hang in there! As you gain experience in a language, syntax becomes easier and easier, and it is
the _semantic_ differences that come to the forefront. What tools does this language offer? What are
its building blocks? What kind of mistakes does it help prevent, or make more likely? How does this
language encourage you to _think_?

────────────────────────────────────────────────

Java is a language that encourages you to think about details. It is not concise; it loves to make
you to have to spell everything out. That can be a source of frustration for developers, but its
explicitness makes it a great learning tool. That’s one of the reasons we chose it for COMP 127.

If you are used to Python, if you took COMP 123 at Macalester, then you know that to print a
friendly greeting in Python, you don’t need any more code than this:

  print("Hello there!")

Not so in Java.

In Java, there is a long series of hoops we have to jump through to get to the point where we can
print a string. We have to:

- include a “package declaration” that names the folder this file is supposed to be inside, then
- include a “class declaration” that creates a container in which code can live, then
- “declare a main method” that says where the program should start.

Package? Class? Declaration? Method? Huh?? That’s a lot!

Why?? Why is Java so complicated?? The short answer is that Java is designed to help you write
_large_ programs, not small ones, and is concerned with providing and encouraging you to use
structures that can help keep large programs manageable.

Over the coming weeks, you will learn about every one of these structures this reading just
mentioned. But for now, you can treat all of these hoops you have to jump through as a magic
incantation that you use to write Java code.

Ready? Here we go!
*/

// 🎉 ACTUAL JAVA CODE BEGINS HERE 🎉

package javabasics;  // Note that “javabasics” matches the name of the directory containing this file

public class JavaBasics {  // Note that "JavaBasics” matches the name of this file
    // If you are looking at this file in Visual Studio Code, it may show “Run | Debug” on the next
    // line. That is VS Code’s user interface, _not_ part of the code! You do not have to type it.
    public static void main(String[] args) {  // This long line means “when running, start here”
        // ...and now, three arduous lines of code later, we can finally do things!

        // Here at last is the Java syntax for printing something:

        System.out.println("Hello there!");

        // Java makes even this common task verbose! Good news: in Visual Studio Code, you can
        // type `sout` and then press the tab key, and it will write out System.out.println();
        // for you.
        
        // Note the semicolon — ; — at the end of that line of code. Java requires you to end each
        // statement with a semicolon. This is one of the most common frustrations for Java
        // newcomers. (Java does this to avoid ambiguous syntax. Designing a programming language
        // that does not need explicit end-of-statement markers is surprisingly tricky.)
        //
        // Omitting the semicolon is a _syntax error_. Let’s try it!

        System.out.println("Delete the semicolon on this line, then try to run the program →");

        // Note that Java won’t even run _any_ of your code if there is a syntax error. (If you are
        // running this code now, then add the semicolon back so that you can continue on!)

        
        System.out.println("────── Expressions and Arithmetic ──────");

        // Java’s syntax for _arithmetic expressions_ will probably feel more familiar to you:

        System.out.println(1 + 1);
        System.out.println(1 + (2 * 3));

        // You can put strings in expressions too:

        System.out.println("One plus one is " + (1 + 1));

        // As with most languages, Java has both _integers_ and _floating point numbers_. “Floating
        // point” is a way of storing approximate fractional values:

        System.out.println(1.5 * 3.5);
        
        // Note the “approximate” part!
        //
        // Floating point is only suitable when it is OK to use _approximate_ values, because it can
        // introduce surprising rounding errors. For example, what do you think this code _should_
        // print? What _does_ it print?

        System.out.println("Floating point math can be surprising:");
        System.out.println((1.0 / 49.0) * 49.0);

        // WHY??!? Take COMP 240, and you’ll find out!
        //
        // For now, just heed the warning: **floating point numbers do not always give
        // mathematically exact answers**.

        
        System.out.println("────── Variables ──────");

        // Like almost all programming languages, Java has variables. If you are used to Python,
        // you are used to creating a variable and setting its value like this:
        
        mascot = "Coo";

        // Not so in Java. Try uncommenting that line above, and see what happens.
        //
        // Ah, but Java needs each statement to end in a semicolon! Try adding a semicolon to the
        // end of the line, and _now_ see what happens. (_Read_ the error message!)
        // 
        // Still broken! Comment out that line again. This isn’t going to work.

        // In Java, you have to _declare_ a variable before you can use it. Here is the
        // _variable declaration_ we need:

        String mascot;

        // This says, “Hey Java! I am going to use a new variable here. Its name is going to be
        // `mascot`, and whatever value it has will always be a string.”
        //
        // Now that we’ve declared the variable, we can use it:

        mascot = "Coo";

        System.out.println("Our mascot is " + mascot);

        // It is so common to declare a variable and then immediately set its value that Java
        // offers a shortcut for this:

        String altMascot = "Nessie";

        System.out.println("We also embrace " + altMascot);

        // When we assign a value to a newly declared variable, we call this _initializing_ the
        // variable.
        //
        // You can declare and initialize multiple variables of the same type all at once:

        int hundred = 100, thousand = 1000;

        
        System.out.println("────── Conditionals ──────");

        // In whatever language you learned previously, there will be some kind of _conditionals_:
        // `if` statements or an equivalent. Here is the Java syntax for an `if` statement:

        if (hundred + thousand < 100000) {
            System.out.println("Arithmetic is working!");
        }

        // It can have an `else` clause:

        if (hundred + thousand < 100000) {
            System.out.println("Arithmetic is still working!");
        } else {
            System.out.println("Arithmetic appears to be broken. ?!?");
        }

        // It possible to create an if-else-if chain (note the formatting!):

        if (thousand < 99) {
            System.out.println("A thousand is teeny.");
        } else if (thousand < 999) {
            System.out.println("A thousand is not that big of a number.");
            System.out.println("Other numbers are way bigger.");
        } else if (thousand < 9999) {
            System.out.println("A thousand is a pretty big number,");
            System.out.println("at least if you ask me.");
        } else {
            System.out.println("A thousand is super duper huge!");
        }

        System.out.println("────── Code Formatting ──────");

        // Notice how the curly braces { } enclose chunks of code in Java. Java uses those braces --
        // and _only_ those braces -- to determine whether multiple lines are grouped together in
        // a block.
        //
        // Unlike Python, Java does not pay any attention to how you indent your code. Java mostly
        // ignores whitespace. (The term “whitespace” refers to spaces, tabs, carriage returns (the
        // ends of lines), and any other characters that show up as empty space.)
        //
        // Technically, the following is completely legal Java. (Try it! It runs!)

          if(                   hundred+thousand>-
        1000000
                                ){         System

                 .
                out
                 .
        


                                                                      println
(                              "Who cares about code formatting??"    )
;}
        
        // However, that code is _terrible_. Java may not care, but no _human_ wants to read that!!
        // Java’s flexibility means that _you_ are responsible for formatting your code well.
        //
        // It also means you have a choice. There are many different styles of code formatting.
        // Here is a sampling, if you’re curious:
        //
        //    https://en.wikipedia.org/wiki/Indentation_style#Notable_styles
        //
        // Programmers sometimes get Big Feelings about these styles. You are welcome to develop
        // feelings, too, but the one golden rule for which style to use is always the same:
        //
        //     Be consistent.
        //
        // If the project you’re working on already has a formatting style, stick with it! (That
        // applies even if it’s not your personal favorite.) If you are starting a new project, get
        // consensus about style on your team.
        //
        // In COMP 127, we use the style present in this document (the earlier parts, not the final
        // terrible example).

        System.out.println("────── A Puzzle ──────");
        
        // To end the reading, here’s a little puzzle for you to mull over.
        //
        // What will this code print? Guess first, then uncomment it and try it!

        /*
        if (1 > 2)
            System.out.println("Roses are red, violets are blue");
            System.out.println("If you ask me, one is greater than two");
        */

        // What is the result? Why??
    }
}
