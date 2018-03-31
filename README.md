# -CSC275-Lab08
CSC 275 Lab 8
Instructor: Andrew S. Webb
Question Subject Line: CSC 275 Online Lab 8 Question

Write a program that asks the user to answer some questions. First, you should ask the user if they want to load answers from a previously saved file. If they respond yes you should look for the file name of your choosing in the path of your choosing and try to load that. If no file was previously saved or they answered no, the user must answer 8 questions of your choosing. They can be simple (i.e. What is your favorite color?) or they can be difficult (i.e. When the zombie apocalypse comes would you sacrifice your friend for your own survival if need be?). 

In your file you should save the questions and the answers on the same line so it will look like this:

What is your favorite color? Blue
How old are you? 25

By doing this we can read in an entire line and simply separate the question based on the location of the question mark, anything before it and including it is the question and anything after it is the answer.

If the user wants to load previous questions and the file exists you should print out the question on one line and the answer on another.
