/*
* Created by: Matthew Brean
* Created on: 2016-09-08
* Created for: ICS4U
* Daily Assignment: Unit #1-02
* This program calculates log number
*/

import java.util.Scanner;

public class Log {

public static void main(String[] args)
{
 Scanner log = new Scanner(System.in);

 double weightOfLogs;
 double numberOfLogs;

for (;;)
{
 System.out.println("Enter the log length in metres, possible values: 0.25, 0.5 or 1");
 double logLength = log.nextDouble();

 if (logLength == 0.5 || logLength == 0.25 || logLength == 1)
 {
 weightOfLogs = 20 * logLength;
 numberOfLogs = 1100/weightOfLogs;
 System.out.println("Number of logs the truck can carry: " + numberOfLogs);
 }
 else
 {
 System.out.println("Invalid Value");
 }
}
}
}
