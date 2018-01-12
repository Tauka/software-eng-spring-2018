package com.NU.composite.implementation;

import com.NU.composite.base.Opers;
import com.NU.composite.base.Term;

/**
 * Created by tauyekel on 1/12/18.
 */
public class Multiplying extends Opers {

    public Multiplying(Term l, Term r) {
        super(l, r);
    }

    @Override
    public double getValue() {
        return this.leftVal.getValue() * this.rightVal.getValue();
    }
}
