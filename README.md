# Java_RMI
## Overview
In this project we have three machines, the first machine represents the client that reads an integer N then sends values from 0 to N to the server1 and the server2. The server1 is responsible of computing the Fibonacci of a given number and returning it to the client. The server2 is responsible of calculating the square of a given number and also returning it to the client, these operations work concurrently. 

## Example 
Lets say that the client reads the number 5 as N, it sends 0 then 1, then 2...5, it will receive the Fibonacci numbers of these values and the their squares in the same time.
![Screenshot](illustration.jpg)
