package com.Part1.Enumerations;

//An improved version of the "Decision Maker"
// This version uses an enum, rather than interface variables, to
// represent the answers.

import java.util.Random;

// an enumeration of the possible answers.
enum Answers{
    NO, YES, MAYBE, LATER, SOON, NEVER;

}

class  Questions{
    Random rand = new Random();
    Answers ask(){
        int prob = (int)(100* rand.nextDouble());

        if (prob<15)
            return Answers.MAYBE;
        else if(prob<30)
            return Answers.NO;
        else if(prob<60)
            return Answers.YES;
        else if(prob<75)
            return Answers.LATER;
        else if(prob<98)
            return Answers.SOON;
        else
            return Answers.NEVER;
    }
}
public class AskMe {
}
