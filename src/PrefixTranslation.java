/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TcheutchouaSteve on Jun 28, 2018
 */
import fet.calc.analysis.DepthFirstAdapter;
import fet.calc.node.*;

public class PrefixTranslation extends  DepthFirstAdapter{

    @Override
    public void inAExpreFactor(AExpreFactor node) {
        //super.inAExpreFactor(node); //To change body of generated methods, choose Tools | Templates.
        //System.out.println(node);
        System.out.print("(");
        
    }

    @Override
    public void outAExpreFactor(AExpreFactor node) {
        super.outAExpreFactor(node); //To change body of generated methods, choose Tools | Templates.
        System.out.println(")");
    }
    
    

    @Override
    public void inADivTerm(ADivTerm node) {
        super.inADivTerm(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getDiv());
    }

    @Override
    public void inAMultTerm(AMultTerm node) {
        super.inAMultTerm(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getMult());
    }

    @Override
    public void inAMinusExpre(AMinusExpre node) {
        //super.inAMinusExpre(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getMinus());
    }

    @Override
    public void inAPlusExpre(APlusExpre node) {
        System.out.print(node.getPlus());
    }


    @Override
    public void caseTNumber(TNumber node) {
        super.caseTNumber(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node);
    }

    
    
    
}
