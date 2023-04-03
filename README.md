# quine
Project for Secure Coding class to make a self-reproducing program.

## Quine
Simply prints a copy of its source code to terminal.

## QuineEC
Creates copies of original file and runs them to reproduce a set amount of times. The default amount of duplicates created is 21. However, any other number is also possible by giving a number input to the program as argument 0. eg, java QuineEC 13. This program does not guard against negative input. so if a custom argument is given which has a value less than 0, the program will create infinite duplicates.

## Resources:
1. [Java API: ProcessBuilder](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/lang/ProcessBuilder.html)
2. [stackoverflow: Making sure ProcessBuilders wait on completion of previous work](https://stackoverflow.com/questions/69701719/java-process-builder-not-executing-multiple-commands)