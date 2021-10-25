package io.delta.standalone.expressions;

import io.delta.standalone.data.RowRecord;
import io.delta.standalone.types.BooleanType;
import io.delta.standalone.types.DataType;

/**
 * Usage: {@code new IsNull(expr)} - Returns true if `expr` is null, else false.
 */
public class IsNull extends UnaryExpression implements Predicate {
    public IsNull(Expression child) {
        super(child);
    }

    @Override
    public Object eval(RowRecord record) { return child.eval(record) == null; }

    @Override
    public String toString() {
        return "(" + child.toString() + ") IS NULL";
    }
}