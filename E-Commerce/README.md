# E-Commerce

This program provides a general-purpose e-commerce system.

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
