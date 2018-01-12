package com.NU.composite.implementation;

import com.NU.composite.base.Opers;
import com.NU.composite.base.Term;

import static java.lang.Double.max;

/**
 * Created by tauyekel on 1/12/18.
 */
public class Adding extends Opers {

    public Adding (Term l, Term r) {

        super(l, r);
    }


    @Override
    public double getValue() {
        return this.leftVal.getValue() + this.rightVal.getValue();
    }

}
