# MakeChangeProject
## Description
A cash register app that will take user input and calculate how much currency needs to be tendered in correct denominations. Intended for use is java ver 1.8
## Technologies used
Scanner - The scanner was used to receive the user input to be calculated.

Double - Doubles were used to store the user input data as these are cash transactions and require the use of a decimal point.

Float - Casted double values from user input to floats to have values rounded up to the nearest hundredth

Int - Ints were used to store the amount of each individual currency and make the end product look cleaner when printed, since they will always be whole numbers as you can't have a fraction of a quarter or dime.

If statement - used to execute certain functions when their corresponding denominations of money are used.

Switch statement - used to create a menue to restart the program should the user wish to make another transaction, and close it if they do not.

While loop - used to count how much of each bill and or coin to return by incrementing the amount tendered and subtracting from the remainder of change left each loop.
## What i learned
I learned that while loops can use the same variables when located in the same statement or method and that you can use += to add multiple variables to concatenated strings.
