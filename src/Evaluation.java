/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TcheutchouaSteve on Jun 29, 2018
 */

import fet.calc.analysis.DepthFirstAdapter;
import fet.calc.node.ADivTerm;
import fet.calc.node.AExpreFactor;
import fet.calc.node.AFactorTerm;
import fet.calc.node.AIdFactor;
import fet.calc.node.AMinusExpre;
import fet.calc.node.AMultTerm;
import fet.calc.node.ANumberFactor;
import fet.calc.node.APlusExpre;
import fet.calc.node.ATermExpre;
import fet.calc.node.Node;
import fet.calc.node.Start;
import java.util.HashMap;
import java.util.Scanner;
public class Evaluation extends DepthFirstAdapter {
    
    HashMap<Node, Integer> hash = new HashMap<>();

    @Override
    public void outStart(Start node) {
        //hash.put(node,Integer.parseInt(node.toString().trim()));
            System.out.print( "The result is "+ getPrim(node.getPExpre()) + " \n");
    }
    // General method to avoid repetitive hash.get
    private int getPrim(Node node){
        return (hash.get(node));
    }

    @Override
    public void outAExpreFactor(AExpreFactor node) {
        hash.put(node, getPrim(node.getExpre()));
    }

    @Override
    public void outANumberFactor(ANumberFactor node) {
        hash.put(node, Integer.parseInt(node.toString().trim()));
    }

    @Override
    public void outADivTerm(ADivTerm node) {
        hash.put(node, (getPrim(node.getTerm())) / (getPrim(node.getFactor())));
    }

    @Override
    public void outAMultTerm(AMultTerm node) {
        hash.put(node, (getPrim(node.getTerm())) * (getPrim(node.getFactor())));
    }

    @Override
    public void outAFactorTerm(AFactorTerm node) {
        hash.put(node, getPrim(node.getFactor()));
    }

    @Override
    public void outAMinusExpre(AMinusExpre node) {
        hash.put(node, (getPrim(node.getExpre())) - (getPrim(node.getTerm())));
    }

    @Override
    public void outAPlusExpre(APlusExpre node) {
        hash.put(node, (getPrim(node.getExpre())) + (getPrim(node.getTerm())));
    }

    @Override
    public void outATermExpre(ATermExpre node) {
        hash.put(node, getPrim(node.getTerm()));
    }

    @Override
    public void inAIdFactor(AIdFactor node) {
        super.inAIdFactor(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print("What is the value of " + node.getId() + ": ");
        String id_value = new Scanner(System.in).nextLine();
        hash.put(node, Integer.parseInt(id_value.toString().trim()));
    }

    
}
