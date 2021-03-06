/* This file was generated by SableCC (http://www.sablecc.org/). */

package fet.compiler.node;

import fet.compiler.analysis.*;

@SuppressWarnings("nls")
public final class AAxiomS extends PS
{
    private TLpar _lpar_;
    private PL _l_;
    private TRpar _rpar_;

    public AAxiomS()
    {
        // Constructor
    }

    public AAxiomS(
        @SuppressWarnings("hiding") TLpar _lpar_,
        @SuppressWarnings("hiding") PL _l_,
        @SuppressWarnings("hiding") TRpar _rpar_)
    {
        // Constructor
        setLpar(_lpar_);

        setL(_l_);

        setRpar(_rpar_);

    }

    @Override
    public Object clone()
    {
        return new AAxiomS(
            cloneNode(this._lpar_),
            cloneNode(this._l_),
            cloneNode(this._rpar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAxiomS(this);
    }

    public TLpar getLpar()
    {
        return this._lpar_;
    }

    public void setLpar(TLpar node)
    {
        if(this._lpar_ != null)
        {
            this._lpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lpar_ = node;
    }

    public PL getL()
    {
        return this._l_;
    }

    public void setL(PL node)
    {
        if(this._l_ != null)
        {
            this._l_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._l_ = node;
    }

    public TRpar getRpar()
    {
        return this._rpar_;
    }

    public void setRpar(TRpar node)
    {
        if(this._rpar_ != null)
        {
            this._rpar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rpar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lpar_)
            + toString(this._l_)
            + toString(this._rpar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lpar_ == child)
        {
            this._lpar_ = null;
            return;
        }

        if(this._l_ == child)
        {
            this._l_ = null;
            return;
        }

        if(this._rpar_ == child)
        {
            this._rpar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lpar_ == oldChild)
        {
            setLpar((TLpar) newChild);
            return;
        }

        if(this._l_ == oldChild)
        {
            setL((PL) newChild);
            return;
        }

        if(this._rpar_ == oldChild)
        {
            setRpar((TRpar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
