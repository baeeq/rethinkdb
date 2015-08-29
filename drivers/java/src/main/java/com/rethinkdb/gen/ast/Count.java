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



public class Count extends ReqlExpr {


    public Count(Object arg) {
        this(new Arguments(arg), null);
    }
    public Count(Arguments args){
        this(args, null);
    }
    public Count(Arguments args, OptArgs optargs) {
        this(TermType.COUNT, args, optargs);
    }
    protected Count(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
