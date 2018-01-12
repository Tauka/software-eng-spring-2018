package com.NU.composite.base;

/**
 * Created by tauyekel on 1/12/18.
 */
public class Vals extends Term {
    private double myValue;

    public Vals(double m) {
        this.myValue = m;

    }

    public double getValue() {
        return myValue;
    }

    public double getDepth() {
        return 1;
    }

}
