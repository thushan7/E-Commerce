# CIS2430 A1 - Task One: Book Lending

This program provides a Book class used for lending books, and a Runner class for testing the Book class.

## Description

The Book class provides the necessary variables and methods needed to simulate a book in a lending
library. Characteristics of the book include its name, author, and borrowed status. The Book class
provides methods for borrowing, returning, and outputting the details of the book (name and author).
The Runner class guides the user through testing the book class by providing various output.

## Getting Started

### Dependencies

There are no additional libraries required to run this program.

### Executing program

* 1. Build the program
```
gradle build
```
* 2. Run the program
```
java -cp build/classes/java/main book.Runner
```
* Expected Output
```
set and get title: 1984
title: 1984
set and get author: George Orwell
author: George Orwell
toString() method should output: 1984: George Orwell
1984: George Orwell
set and get borrowed status: true
true
try to borrow, should output empty string

return book, should output true
true
try to return, should output false
false
borrow book, should output title
1984
```

## Limitations

All functionality is complete. Based on assignment requirements, no errors are possible.

## Author Information

Thushan Subaskody (1219251)
tsubasko@uoguelph.ca

## Development History

* 0.5
    * Completed README file
        * See commit "completed Task1 readme"
* 0.4
    * Updated Runner class (made testing more robust)
        * See commit "updated Runner class for Task1"
* 0.3
    * Completed Runner class
        * See commit "completed Product class, ShoppingCart class, Runner class for Task1"
* 0.2
    * Completed Book class
        * See commit "completed Book class"
* 0.1
    * Set up repository
        * See commit "set up repo"

## Acknowledgments

n/a


