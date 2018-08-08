/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TcheutchouaSteve on Jun 28, 2018
 */
import fet.calc.lexer.Lexer;
import fet.calc.node.Start;
import fet.calc.parser.Parser;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Scanner;
public class ExerciseDemoCalc {
 public static void main(String[] args) {
        try {
            System.out.println("Type a String");
            String str = new Scanner(System.in).nextLine();
            
            // Define a parser 
            // first convert the string in a form where chunks or bits can be formed.
            Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(str),1024)));
            
            Start tree = p.parse();
            tree.apply(new PrefixTranslation());
            System.out.println("The String " + str + " is in the language");
            System.out.println("\nPostFix Translation\n");
            tree.apply(new PostfixTranslation());
            System.out.println("Evaluating and expression using attributed grammar");
            tree.apply(new Evaluation());
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error occurs " + e.getMessage() + "\nThe word is not part of the language");
        }
    }
}
