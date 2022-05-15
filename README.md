Project Name : The Parser
__________________________________________________


Project Team Names :
--------------------
1-Ahmed Gamal Hassan 

2-Ahmed Samir AbdElfattah

3-Abdallah Hellmy Attia

4-Abdallah Mohamed Mostafa

5-Amr Muhammed Fahim

6-Muhamed Ahmed Amin
__________________________________________________

Project Files:
--------------

1-Lexical Rules for cool Languages ==> CoolCompiler.g4 

2-To Output Tokens and Errors in Files ==> Lexer_IO.java

3-Cool Program (test case without error)==> good.cl

4-Cool Program (test case with error)==> bad.cl

5-CoolCompiler.g4 file generates ==> CoolCompiler 

6-Parser-IO

7-ParsingErrorListener
____________________________________________________

Lexer_IO:
---------

-To Output Tokens and Errors in Files

Lexer_IO Functions:
--------------------
1-Lexer_IO constructor ==> get Tokens Stream from The Input File

2-Lex() ==> To Fill OutputTokens and Errors in Two Lists

3-WriteTokens() ==> Write Tokens in The Output File

4-PrintError() ==> To Print Lexical Errors
____________________________________________________

CoolCompiler:
--------------

-Lexical Rules for cool Languages 
	Rules:
	------
	1-KeyWords
	2-Identifiers
	3-Operators

-Grammer Rules for cool Languages 
_____________________________________________________

Parser-IO:
----------
-to deal with the input file, parse it and detect the parse error


Parser_IO Functions:
--------------------

1-Parser_IO constructor ==> to get the tokenstream of the file , parse it and print errors

2-writeCST() ==> to write the CST in a file
_______________________________________________________

ParsingErrorListener:
---------------------
-to overrides the syntaxError()method in the BaseErrorListener class to print the error

ParsingErrorListener Functions:
-------------------------------

1-syntaxError() ==> This method is called when the listener detects an error
________________________________________________________

good file:
----------
-Cool Program (test case without error)

Example:
--------
Input ==>

class Main {
x : Int;
 main() : Object {
    {
     x <- 4;
    }
  } ;
} ;

Output ==> (program (class_name class Main { (body x : Int ;) (body main ( ) : Object { (expr { (expr x <- (expr 4)) ; }) } ;) } ;))
_____________________________________________________

bad file:
---------

-Cool Program (test case with error)

Example:
--------
Input ==>  


class Main {
 x : Int;
 y : Int;
 z : Int;
  main() : Object {
    {

     x <- 4;
     if (x == 3)  -- Error Here
    then y <- x
    else z <- x
    fI;
  }
  } ;
} ;


Output ==> Error in line10:extraneous input '=' expecting {IF, WHILE, NEW, NOT, TRUE, FALSE, '(', '{', NUM, ID}
