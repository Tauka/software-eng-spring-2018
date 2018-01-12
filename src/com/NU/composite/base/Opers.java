package com.NU.composite.base;

import static java.lang.Double.max;

/**
 * Created by tauyekel on 1/12/18.
 */
abstract public class Opers extends Term {
    protected Term leftVal;
    protected Term rightVal;

    public Opers(Term l, Term r) {
        leftVal = l;
        rightVal = r;
    }

    public double getDepth() {
        return max(this.leftVal.getDepth() + 1, this.rightVal.getDepth() + 1);
    }

}
