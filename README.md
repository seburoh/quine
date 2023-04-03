# quine
Project for Secure Coding class to make a self-reproducing program.

## Quine
Simply prints a copy of it's source code to terminal.

## QuineEC
Creates copies of original file and runs them to reproduce a set amount of times. The default amount of duplicates created is 21. However any other number is also possible by giving a number input to the program as argument 0. eg, java QuineEC 13. This program does not guard against negative input. so if a custom argument is given which has a value less than 0, the program will create infinite duplicates.