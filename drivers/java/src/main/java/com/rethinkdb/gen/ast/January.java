// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java

package com.rethinkdb.gen.ast;

import com.rethinkdb.gen.proto.TermType;
import com.rethinkdb.gen.model.TopLevel;
import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;



public class January extends ReqlExpr {


    public January(Object arg) {
        this(new Arguments(arg), null);
    }
    public January(Arguments args){
        this(args, null);
    }
    public January(Arguments args, OptArgs optargs) {
        this(TermType.JANUARY, args, optargs);
    }
    protected January(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
