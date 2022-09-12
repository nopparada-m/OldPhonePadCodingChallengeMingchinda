import java.util.*;

class Combinations 
{
    public static String OldPhonePad(ArrayList<String> numberInput)
    {
        LinkedList<String> letterOutput = new LinkedList<>();//append the letter and number matches here
        LinkedList<String> twoLetters = new LinkedList<>(); //FIFO

        twoLetters.add("a");
        twoLetters.add("b");
        twoLetters.add("c");
        //sanity check:
        //System.out.println(twoLetters); //just replace "two" with another number for other lists
        //["a", "b", "c"]
        
        LinkedList<String> threeLetters = new LinkedList<>();

        threeLetters.add("d");
        threeLetters.add("e");
        threeLetters.add("f");
        //["d", "e", "f"]

        LinkedList<String> fourLetters = new LinkedList<>();

        fourLetters.add("g");
        fourLetters.add("h");
        fourLetters.add("i");
        //["g", "h", "i"]

        LinkedList<String> fiveLetters = new LinkedList<>();

        fiveLetters.add("j");
        fiveLetters.add("k");
        fiveLetters.add("l");
        //["j", "k", "l"]

        LinkedList<String> sixLetters = new LinkedList<>();

        sixLetters.add("m");
        sixLetters.add("n");
        sixLetters.add("o");
        //["m", "n", "o"]

        LinkedList<String> sevenLetters = new LinkedList<>();

        sevenLetters.add("p");
        sevenLetters.add("q");
        sevenLetters.add("r");
        sevenLetters.add("s");
        //["p", "q", "r", "s"]

        LinkedList<String> eightLetters = new LinkedList<>();

        eightLetters.add("t");
        eightLetters.add("u");
        eightLetters.add("v");
        //["t", "u", "v"]

        LinkedList<String> nineLetters = new LinkedList<>();

        nineLetters.add("w");
        nineLetters.add("x");
        nineLetters.add("y");
        nineLetters.add("z");
        //["w", "x", "y", "z"]
        

        String result; //stores result
        //String temp; //temporary storage for manipulating items on a list

        for(int i = 0; i < numberInput.size(); i++)
        {
            numberInput.get(i);

                   
                    if (numberInput.get(i) == "2")
                    {
                        result = twoLetters.get(0); //first item in the list (a in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    //If pressed twice
                    //Where the next element will be the same as the current index
                    else if (numberInput.get(i) == "2" && numberInput.get(i + 1) == "2")
                    {
                        twoLetters.remove(0); //removes a
                        result = twoLetters.get(0); //retrieves b
                        letterOutput.add(result); //add result to the output
                    }

                    //If pressed thrice
                    //Where the element at the current index is the same as the element next to it and the following element
                    else if (numberInput.get(i) == "2" && numberInput.get(i + 1)== "2" && numberInput.get(i + 2) == "2")
                    {
                        twoLetters.remove(0); //removes a
                        twoLetters.remove(1); //removes b
                        result = twoLetters.get(0); //retrieves b
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "3")
                    {
                        result = threeLetters.get(0); //first item in the list (d in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "3" && numberInput.get(i + 1) == "3")
                    {
                        threeLetters.remove(0);//removes d
                        result = threeLetters.get(0);//retrieves e
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "3" && numberInput.get(i + 1) == "3" && numberInput.get(i + 2) == "3")
                    {
                        threeLetters.remove(0); //removes d
                        threeLetters.remove(1); //removes e
                        result = threeLetters.get(0); //retrieves f
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "4")
                    {
                        result = fourLetters.get(0); //first item in the list (g in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "4" && numberInput.get(i + 1) == "4")
                    {
                        fourLetters.remove(0);//removes g
                        result = fourLetters.get(0);//retrieves h
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "4" && numberInput.get(i + 1) == "4" && numberInput.get(i + 2) == "4")
                    {
                        fourLetters.remove(0); //removes g
                        fourLetters.remove(1); //removes h
                        result = fourLetters.get(0); //retrieves i
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "5")
                    {
                        result = fiveLetters.get(0); //first item in the list (j in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "5" && numberInput.get(i + 1) == "5")
                    {
                        fiveLetters.remove(0);//removes j
                        result = fiveLetters.get(0);//retrieves k
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "5" && numberInput.get(i + 1) == "5" && numberInput.get(i + 2) == "5")
                    {
                        fiveLetters.remove(0); //removes j
                        fiveLetters.remove(1); //removes k
                        result = fiveLetters.get(0); //retrieves l
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "6")
                    {
                        result = sixLetters.get(0); //first item in the list (m in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "6" && numberInput.get(i + 1) == "6")
                    {
                        sixLetters.remove(0);//removes m
                        result = sixLetters.get(0);//retrieves n
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "6" && numberInput.get(i + 1) == "6" && numberInput.get(i + 2) == "6")
                    {
                        sixLetters.remove(0); //removes m
                        sixLetters.remove(1); //removes n
                        result = sixLetters.get(0); //retrieves o
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "7")
                    {
                        result = sevenLetters.get(0); //first item in the list (p in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "7" && numberInput.get(i + 1) == "7")
                    {
                        sevenLetters.remove(0);//removes p
                        result = sevenLetters.get(0);//retrieves q
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "7" && numberInput.get(i + 1) == "7" && numberInput.get(i + 2) == "7")
                    {
                        sevenLetters.remove(0); //removes p
                        sevenLetters.remove(1); //removes q
                        result = sevenLetters.get(0); //retrieves r
                        letterOutput.add(result); //add result to the output
                    }

                    //If pressed four times
                    //Where the element at the current index is the same as the element next to it and the two following elements
                    else if (numberInput.get(i) == "7" && numberInput.get(i + 1) == "7" && numberInput.get(i + 2) == "7" && numberInput.get(i + 3) == "7")
                    {
                        sevenLetters.remove(0); //removes p
                        sevenLetters.remove(1); //removes q
                        sevenLetters.remove(2); //removes r
                        result = sevenLetters.get(0); //retrieves s
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "8")
                    {
                        result = eightLetters.get(0); //first item in the list (t in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "8" && numberInput.get(i + 1) == "8")
                    {
                        eightLetters.remove(0);//removes t
                        result = eightLetters.get(0);//retrieves u
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "8" && numberInput.get(i + 1) == "8" && numberInput.get(i + 2) == "8")
                    {
                        eightLetters.remove(0); //removes t
                        eightLetters.remove(1); //removes u
                        result = eightLetters.get(0); //retrieves v
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "9")
                    {
                        result = nineLetters.get(0); //first item in the list (w in this case) is the result
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "9" && numberInput.get(i + 1) == "9")
                    {
                        nineLetters.remove(0);//removes w
                        result = nineLetters.get(0);//retrieves x
                        letterOutput.add(result); //add result to the output
                    }

                    else if (numberInput.get(i) == "9" && numberInput.get(i + 1) == "9" && numberInput.get(i + 2) == "9")
                    {
                        nineLetters.remove(0); //removes w
                        nineLetters.remove(1); //removes x
                        result = nineLetters.get(0); //retrieves y
                        letterOutput.add(result); //add result to the output
                    }

                    //If pressed four times
                    //Where the element at the current index is the same as the element next to it and the two following elements
                    else if (numberInput.get(i) == "9" && numberInput.get(i + 1) == "9" && numberInput.get(i + 2) == "9" && numberInput.get(i + 3) == "9")
                    {
                        nineLetters.remove(0); //removes w
                        nineLetters.remove(1); //removes x
                        nineLetters.remove(2); //removes y
                        result = nineLetters.get(0); //retrieves z
                        letterOutput.add(result); //add result to the output
                    }

                    System.out.println(letterOutput);
            }
        
        return " ";

                           
    }     
    


    public static void main(String args[])
    {
        
        ArrayList<String> numberPressed = new ArrayList<>();

        //Change your inputs here
        //Add any number between 2 and 9
        numberPressed.add("2");
        numberPressed.add("2");
        numberPressed.add("3");
        numberPressed.add("9");
        
        OldPhonePad(numberPressed);
        
        
    }
}