# CIS2430 A1 - Task Two: E-Commerce

This program provides a simple e-commerce system, and a Runner class for testing this sytem.

## Description

The Product class provides the necessary variables and methods needed to simulate a product in this
e-commerce system. Characteristics of a product include its name, product ID, wholesale cost, tax 
rate (common to all products), and markup rate (varies among products). The Product class also
provides a method for calculating the retail price of a product. The ShoppingCart class provides
the necessary variables and methods needed to simulate a shopping cart of products in this e-commerce
system. This class provides methods for adding products, removing products, finding number of products,
checking for a product, calculating subtotal (before tax) and total (after tax), checking out, and
displaying the contents of the cart. The Runner class guides the user through testing these two
classes by providing various output.

## Getting Started

### Dependencies

This program requires the use of class ArrayList.

### Executing program

* 1. Build the program
```
gradle build
```
* 2. Run the program
```
java -cp build/classes/java/main ecommerce.Runner
```
* Expected Output
```
set and get product id: 123
product id: 123
set and get product name: book
product name: book
set and get wholesale cost: 5.50
wholesale cost: 5.5
set taxRate=1.5, should remain 0.13
tax rate: 0.13
set taxRate=0.2
tax rate: 0.2
set markup=1.5, should default to 0.25
markup: 0.25
set markup=0.5
markup: 0.5
get retail price, should be 9.90
retail price: 9.9
=========================================
shopping cart with book
book: 9.90

shopping cart with book2 added
book: 9.90
book2: 12.60

shopping cart with book removed
book2: 12.60

check cart for book, should be false
false
check cart for book2, should be true
true
before tax price of cart with book added back, should be 18.75
18.75
total cart price, should be 22.5
22.5
cart size, should be 2
2
checkout function should output total cart price and clear cart
22.5
contents of shopping cart after checkout:

```

## Limitations

All functionality is complete. Based on assignment requirements, no errors are possible.

## Author Information

Thushan Subaskody (1219251)
tsubasko@uoguelph.ca

## Development History

* 0.4
    * Completed README file
        * See commit "completed Task2 readme"
* 0.3
    * Completed Runner class
        * See commits "began Runner class for Task2", "worked on Runner for Task2"
* 0.2
    * Completed Product class and ShoppingCart class
        * See commit "completed Product class, ShoppingCart class, Runner class for Task1"
* 0.1
    * Set up repository
        * See commit "set up repo"

## Acknowledgments

I used the following resources:
* 1. JavaDocs for ArrayList class
* 2. JavaDocs for Double class
