# ROTExample
A simple Java program showcasing the "Rotate By x Places" cipher such as ROT13 where any English characters 
inputted by a user is rotated by 13 places.  13 places since there are only 26 letters in the English alphabet.
The cipher loops back around to 'A' when any character from the second half of the alphabet starting at 'N' 
is inputted.  This simple and easily breakable substitution cipher is explained more in detail at 
https://en.wikipedia.org/wiki/ROT13.  The program uses a GUI made using the JavaFX Scene Builder integrated
into the Eclipse IDE.  Below is a quick overview of the four types of ROT ciphers from the wiki article as they
behave within the program:

- ROT5
  - rotate integers by 5 places
  - only the integers 0-9 will be rotated
  - any other input other than whitespace is not allowed
  - Example:
    - 59 -> 04
    
- ROT13
  - rotate English alphabetical characters by 13
  - only the English characters A-Z will be rotated
  - characters are case-sensitive
  - any other input other than whitespace is not allowed
  - Example:
    - Sheesh -> Furrfu
    - sHEeSh -> fURrFu
  
- ROT18/13.5
  - rotate both English alphabetical characters by 13 and integers by 5
  - a combination of both ROT5 and ROT13
  - any other input other than whitespace is not allowed such as '!'
  - Example:
    - 59 Now Is The T1me 4332 6 -> 04 Abj Vf Gur G6zr 9887 1
  
- ROT47
  - rotate any character by 47
  - this only applies to any character on the ASCII table (shown here: http://www.asciitable.com/)
    between decimal 33 which is '!' and decimal 126 which is '~'.
  - any other input other than whitespace that is not between those decimals on the table is not allowed
  - Example:
    - Bob's Billy Goat Turns 26 Years Old! @TH3 Y34R 1998 -> q@3VD q:==J v@2E %FC?D ae *62CD ~=5P o%wb *bc# `hhg

# Instructions
1. Pull the repository and run the program.
2. Input text in the first text box.
3. Choose which version of ROT to use.
4. Hit enter in the first text box and the ROTx enciphered text should show up in the text area below.
5. Make any changes to your text if you've gotten an error due to invalid characters.

# Purpose
This program was created as an exercise of Java, JavaFX and OO principles.
  
# Acknowledgements
- Wikipedia https://en.wikipedia.org/wiki/Main_Page
- asciitable.com http://www.asciitable.com 
