# Java-Project
this project is built using java language and following the instructions in the sent youtube video.

## Key Learnings:
### 1.Function
```
public int addThree(int n){
return n+3;
}
```
#### main function
the function that gets called when executing the program.
### 2.Class 
container of functions 
```
public class Main{
}
```
### 3.Access Modifiers
public/private/..
### 4.Packages
to group classes
### 5.How java code get executed
1.intellij uses java compiler to compile our code into java bytecode.
2.jvm translate it to the native code of the operating system.
### 4.Variables 
goal: to temporarily store data.

#### Categories of types
##### Primitive
byte, short, double,char..
eg
```
private int number=4;
```
##### Reference 
eg
```
Date now= new Date();
```

##### primitive vs reference 
when we declare a primitive variable the value that we assign to that variable will be stored in that memory location.
But, when we use a reference type our variable is going to hold the address of that object in memory.
### 5.String
refernce type but declared like a primitive.
### 6.Arrays
eg
```
int[] numbers=new int[5];
```
note: cannot be displayed as primitive variables. we can use:
```
System.out.print(Arrays.toString(numbers));
```
##### multidimensional arrays
### 7.Constans
by keyword final
by convention names: ALL CAPITALS
### 8.Arithematic Expressions
piece of code that produces a number
operators in order: *,/,+,-
x++; (increment by 1 )
### 9.Casting
Implicit (automatic)

Explicit (manual)
int y = (int)1.1;

### 10.Math Class
### 11.Formatting numbers
class: NumberFormat
through: getCurrencyInstance() method or other for percent... create instance
then through format() method format the number into a String
### 12.Reading input
Scanner class
create a scanner object and read the input using methods in this class depending on the type of input
### 13.Comparison and logical operators
### 14.if statement
##### Ternary operator
eg 
```
String className= income>100_000 ? : "First" : "Economy";
```
### 15. switch statement
### 16. for loop
### 17. while/do while loops
### 18.break;
ignores everything after it and terminate from the loop
### 19.continue;
moves control to the begining of the loop
### 20.for each
to iterate over collections
eg
```
for(String fruite: fruits){
}
```
## Projects created:
1.Mortgage calculator( 2 versions)
2.FizzBuzz 




