package com.NU;

import com.NU.composite.base.Term;
import com.NU.composite.base.Vals;
import com.NU.composite.implementation.Adding;
import com.NU.composite.implementation.Multiplying;
import com.NU.composite.implementation.Substracting;

public class Main {

    public static void main(String[] args) {
        Term x = new Adding(new Vals(2.0), new Vals(2.0));
        Term y = new Multiplying(new Vals(3.0), x);
        Term z = new Substracting(y, x);

        System.out.println(z.getValue() + " " + z.getDepth());

    }
}


