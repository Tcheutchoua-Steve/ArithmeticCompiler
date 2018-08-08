
import fet.calc.lexer.Lexer;
import fet.calc.node.Start;
import fet.calc.parser.Parser;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TcheutchouaSteve on Jun 29, 2018
 */
public class EvaluationMain {
    public static void main(String[] args) {
         try {
            System.out.println("Type a String");
            String str = new Scanner(System.in).nextLine();
            
            // Define a parser 
            // first convert the string in a form where chunks or bits can be formed.
            Parser p = new Parser(new Lexer(new PushbackReader(new StringReader(str),1024)));
            Start tree = p.parse();
             //System.out.print("The value of  " + str + " is ");
            tree.apply(new Evaluation());
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error occurs " + e.getMessage() + e.toString()+ "\nThe word is not part of the language");
        }
    }
}
