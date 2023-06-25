/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.sableccCarpeta.node;

import srt.sableccCarpeta.analysis.*;

@SuppressWarnings("nls")
public final class ASub1Sub extends PSub
{
    private TEtiqueta _e1_;
    private TTexto _texto_;
    private TEtiqueta _e2_;

    public ASub1Sub()
    {
        // Constructor
    }

    public ASub1Sub(
        @SuppressWarnings("hiding") TEtiqueta _e1_,
        @SuppressWarnings("hiding") TTexto _texto_,
        @SuppressWarnings("hiding") TEtiqueta _e2_)
    {
        // Constructor
        setE1(_e1_);

        setTexto(_texto_);

        setE2(_e2_);

    }

    @Override
    public Object clone()
    {
        return new ASub1Sub(
            cloneNode(this._e1_),
            cloneNode(this._texto_),
            cloneNode(this._e2_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASub1Sub(this);
    }

    public TEtiqueta getE1()
    {
        return this._e1_;
    }

    public void setE1(TEtiqueta node)
    {
        if(this._e1_ != null)
        {
            this._e1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e1_ = node;
    }

    public TTexto getTexto()
    {
        return this._texto_;
    }

    public void setTexto(TTexto node)
    {
        if(this._texto_ != null)
        {
            this._texto_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._texto_ = node;
    }

    public TEtiqueta getE2()
    {
        return this._e2_;
    }

    public void setE2(TEtiqueta node)
    {
        if(this._e2_ != null)
        {
            this._e2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e2_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._e1_)
            + toString(this._texto_)
            + toString(this._e2_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._e1_ == child)
        {
            this._e1_ = null;
            return;
        }

        if(this._texto_ == child)
        {
            this._texto_ = null;
            return;
        }

        if(this._e2_ == child)
        {
            this._e2_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._e1_ == oldChild)
        {
            setE1((TEtiqueta) newChild);
            return;
        }

        if(this._texto_ == oldChild)
        {
            setTexto((TTexto) newChild);
            return;
        }

        if(this._e2_ == oldChild)
        {
            setE2((TEtiqueta) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
