# Java_RMI
![Screenshot](illustration.jpg)

## Overview
In this project we have three machines, the first machine represents the client that reads an integer N then sends values from 0 to N to the server1 and the server2. The server1 is responsible of computing the Fibonacci of a given number and returning it to the client. The server2 is responsible of calculating the square of a given number and also returning it to the client, these operations work concurrently. 

## Example 
Lets say that the client reads the number 5 as N, it sends 0 then 1, then 2...5, it will receive the Fibonacci numbers of these values and the their squares in the same time.

## Deployment
In my case, I have a Ubuntu Linux distribution as an OS, also, I have created two windows 10 virtual machines. these 3 machines connect over a my home LAN network, each one has it's IP address.

## How to run the project?
First of all, you must compile the code by entring to the project directory and running the following command:

      javac *.java
      
After that you open a terminal in each machine, for machine 1 and machine 2 you run the server 1 and the server 2

      java Server1
      java Server2
      
for machine 3 (client), you pass the IP addresses of the servers as arguments like this:

      java Client 192.168.1.9 192.168.1.25
      
to get the ip address of a server, you just need to open a terminal and type:

      ifconfig

## Any contribution is welcomed
