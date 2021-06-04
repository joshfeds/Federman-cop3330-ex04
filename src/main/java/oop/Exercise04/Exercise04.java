package oop.Exercise04;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 */
public class Exercise04 {
    static Scanner input = new Scanner(System.in);

    public static String EnterNoun() {
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        return noun;
    }
    public static String EnterVerb() {
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        return verb;
    }
    public static String EnterAdjective() {
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        return adjective;
    }
    public static String EnterAdverb() {
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        return adverb;
    }
    public static void main(String[] args){
        String noun = EnterNoun();
        String verb = EnterVerb();
        String adjective = EnterAdjective();
        String adverb = EnterAdverb();
        System.out.print("Do you " + verb.replace("verb", verb) + " your "
                        + adjective.replace("adjective", adjective) + " "
                        + noun.replace("noun", noun) + " "
                        + adverb.replace("adverb", adverb)
                        + "? That's hilarious!");
    }
}
