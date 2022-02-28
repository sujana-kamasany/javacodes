### Introduction to Strings:

In Java, a String is an object that represents a sequence of characters. They're immutable i.e., cannot be changed intrinsically, although there are ways to explicitly change the value stored in a string variable. The best way to think of a String is as an array of Characters.

```java 
char[] charArray = {'t','h','i','s','i','s','a','s','t','r','i','n','g'};
String str = "thisisastring";
```
Notice the difference between the two. For starters, it looks easier to store characters in a String variable, all you have to do is surround it with double quotes instead of the obligatory single quotes that characters have. I say obligatory because that's a syntax rule for characters and Strings when you use them, in that Java will insist that you follow the "single quotes for Characters and double quotes for Strings" instruction. 

Aside from that, in both cases each character has an index value with the first one starting with 0 just like any other normal array.
But with Strings, we make use of inbuilt functions to both access individual characters and portions of the string itself that you can later intelligently manipulate. Say I wanted to get the 4th character from the String above. If I wanted to do it the old-fashioned way from the character array, I would go with something like:

```java 
char ch = charArray[3];
```

An equivalent way to do this with one of those inbuilt functions I mentioned earlier, would be with 

```java
char ch = str.charAt(3);
```

The convenience of Strings doesn't end with just picking out characters. With functions like 
```java 
substring() //to print out portions or sections of a string
split() //to section off or group parts of the string based on a separator parameter
length() //to find the length of a String
replace() //to find a particular character in the String and replace it something else
indexOf() //to find the index of a desired character in the String
```

And many more, you can operate on Strings quickly and efficiently. Speaking of efficiency, let's briefly go over *why* creating new Strings a certain way in Java is a little easier on our JVM compiler from a memory perspective. In our first codeblock section, we created a String ***literal***. If you're not new to Java, you know that literals can be haphazardly understood as "variables with values that can't be changed" as seen with variables that are created with the ***final*** keyword. But when it comes to *String* literals, the JVM checks another memory location dedicated wholly to Strings called the "String constant pool". So if I were to create a new String literal 

```java 
String firstword = "Strings are fun!";
```
And another one with the same value, 

```java 
String secondword = "Strings are fun!";
```

The JVM wouldn't go to the trouble of creating another object for *secondword* since it already exists in the String constant pool from when we created *firstword*. 

However, that being said, you *can* create a String variable with the familiar ***new*** keyword like so:

```java 
String s = new String("An even funner String!");
```

But note that this isn't a literal, and it will be treated and assigned to heap memory just like any other object when your program compiles and runs. So that means the JVM will be forced to go along with your perceived inefficient ways when you create another String object with the same content in it i.e. "An even funner String". 

Using Strings is an integral part of being a great Java Developer (they're one of the most frequently tested concepts in interviews!) and, just like any other programming paradigm, you'll have to practice using them to really understand what they are and how easy they can make life for you. The inbuilt functions I mentioned above are only a taste of what you'll be using in your journey. They all have syntaxes and parameters and use cases that will require extra care to use judiciously, but don't worry. Even experienced developers have to sneak a search on Javatpoint every now and then to remember how that one particular String function works. 

And that brings me to Javatpoint, W3Schools and Geeksforgeeks. For obvious reasons, use them! They have all the information you'll ever need and are always a good place to bring your "knowledge-transfer", as the professionals call it, up to speed in no time. 

### Resources:

- [Javatpoint: Introduction to Strings](https://www.javatpoint.com/java-string)
- [Geeksforgeeks: Strings](https://www.geeksforgeeks.org/strings-in-java/)
- [W3Schools: Strings](https://www.w3schools.com/java/java_strings.asp)

### Bonus:

Strings are immutable, like I said. But I also remembering telling you that we *could* explicitly change the value of one, in the beginning. Here's how you do it:

```java 
String str1 = "kingdom";
str1 = str1 + " come";
System.out.println(str1);
```

The output here would be: "kingdom come"

What we've done here is manually place *str1* in an update operation that'll change its value forcibly. You'll find yourself doing this a lot more often when you get to fun String programs like Palindromes, so just keep the fact that we can do this in mind. It'll come in handy later.  




