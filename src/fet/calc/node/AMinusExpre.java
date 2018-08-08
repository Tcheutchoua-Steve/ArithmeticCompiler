/* This file was generated by SableCC (http://www.sablecc.org/). */

package fet.calc.node;

import fet.calc.analysis.*;

@SuppressWarnings("nls")
public final class AMinusExpre extends PExpre
{
    private PExpre _expre_;
    private TMinus _minus_;
    private PTerm _term_;

    public AMinusExpre()
    {
        // Constructor
    }

    public AMinusExpre(
        @SuppressWarnings("hiding") PExpre _expre_,
        @SuppressWarnings("hiding") TMinus _minus_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setExpre(_expre_);

        setMinus(_minus_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AMinusExpre(
            cloneNode(this._expre_),
            cloneNode(this._minus_),
            cloneNode(this._term_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusExpre(this);
    }

    public PExpre getExpre()
    {
        return this._expre_;
    }

    public void setExpre(PExpre node)
    {
        if(this._expre_ != null)
        {
            this._expre_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expre_ = node;
    }

    public TMinus getMinus()
    {
        return this._minus_;
    }

    public void setMinus(TMinus node)
    {
        if(this._minus_ != null)
        {
            this._minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minus_ = node;
    }

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expre_)
            + toString(this._minus_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expre_ == child)
        {
            this._expre_ = null;
            return;
        }

        if(this._minus_ == child)
        {
            this._minus_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expre_ == oldChild)
        {
            setExpre((PExpre) newChild);
            return;
        }

        if(this._minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
