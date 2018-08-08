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
import fet.calc.node.ADivTerm;
import fet.calc.node.AExpreFactor;
import fet.calc.node.AMinusExpre;
import fet.calc.node.AMultTerm;
import fet.calc.node.APlusExpre;
import fet.calc.node.TNumber;

public class PostfixTranslation extends DepthFirstAdapter{


    @Override
    public void outAMinusExpre(AMinusExpre node) {
       // super.inAMinusExpre(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getMinus());
    }

    @Override
    public void outAPlusExpre(APlusExpre node) {
        //super.inAPlusExpre(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getPlus());
    }


    @Override
    public void outADivTerm(ADivTerm node) {
        super.outADivTerm(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getDiv());
    }

    @Override
    public void outAMultTerm(AMultTerm node) {
        super.outAMultTerm(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node.getMult());
    }

    

    @Override
    public void caseTNumber(TNumber node) {
        super.caseTNumber(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(node);
    }

    @Override
    public void outAExpreFactor(AExpreFactor node) {
        super.outAExpreFactor(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print(")");
    }

    @Override
    public void inAExpreFactor(AExpreFactor node) {
        super.inAExpreFactor(node); //To change body of generated methods, choose Tools | Templates.
        System.out.print("(");
    }
    
    
    
}
