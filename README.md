# Brute Force Password Cracker

## Description
This project is a simple brute-force password cracker that attempts to unlock a vault by trying all possible password combinations. The password consists of a fixed set of characters, and its length is known in advance. The implementation uses recursion to generate and test all possible passwords.

## Project Structure
- `Test.java` – Entry point for testing the brute-force attack.
- `BruteForceAttacker.java` – Implements the brute-force attack using recursion.
- `Thief.java` – Abstract class providing helper methods for password cracking.

## How to Run
1. Compile the project using a Java compiler (Java 21 recommended).
2. Run `Test.java` to start the brute-force attack.
3. The program will attempt all possible passwords and display the result.

## Expected Output Example
```
Trying to break password...
...click!...
[VAULT] opened, password is abcda
```

If the password is incorrect, the program will continue testing other combinations until the correct one is found.

## Notes
- The solution must use recursion.
- The vault locks itself again if an incorrect password is tested after it has been opened.
- The order of tested passwords follows the sorted order of the character set.


