Project: Old phone pad's number to letter converter
Status: Incomplete (~95% complete: there are some bugs with indexing)
Author: Nopparada Mingchinda

Description: On one of those indestructable old phones, where there are letters below each number key (except for 0, 1, lower left and lower right buttoms), you can create text by pressing the button once, twice, three times or four times.

|  1  | |  2  | |  3  |
| &'( | | abc | | def |

|  4  | |  5  | |  6  |
| ghi | | jkl | | mno |

|  7  | |  8  | |  9  |
| pqrs| | tuv | | wxyz|

|  *  | |  0  | |  #  |
|     | |     | |     |

For example, to type "Hello", you will need to press "4" twice, press "3" twice, press "5" three times, press "5" three times and then press "6" three times. You will send the message by pressing "#".

In "OldPhonePad.java", you will see a class "Combinations" with the "OldPhonePad" method that takes in the parameter "numberInput" as an ArrayList of Strings. For numbers 2 to 9 (the numbers that will return a letter when pressed a certain amount of time), there is a separate LinkedList to store the possible number-letter matches. There is another list to append the number inputs, which you will need to do in order to run the program in the main() method. These numbers will be added to a LinkedList known as "lettersOutput" as Strings.

The algorithm will check each number added to lettersOutput. For each corresponding list for a number, e.g., "twoLetters" stores three items ([a, b, c]), which are the possible outputs when pressing 2 on the keypad. If the same number was input twice, the first item will be removed from the list of potential letter outputs and the updated first element of the list will be added to "lettersOutput" and printed to the console. For example, suppose the input is 22: a will be removed from [a, b, c], leaving "twoLetters" with [b, c]. b will then be added to "lettersOutput" and printed to the console. 

On the other hand, if the same number is input three times, the first two elements of a list of potential outputs of that number will be removed, leaving the last item to be added to "lettersOutput". There are exceptions for 7 and 9, where you can have four possible outcomes. The algorithm will work in the same way for the cases of 7 and 9. 