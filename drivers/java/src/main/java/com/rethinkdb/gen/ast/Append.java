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



public class Append extends ReqlExpr {


    public Append(Object arg) {
        this(new Arguments(arg), null);
    }
    public Append(Arguments args){
        this(args, null);
    }
    public Append(Arguments args, OptArgs optargs) {
        this(TermType.APPEND, args, optargs);
    }
    protected Append(TermType termType, Arguments args, OptArgs optargs){
        super(termType, args, optargs);
    }
}
