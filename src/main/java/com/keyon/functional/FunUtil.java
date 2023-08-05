package com.keyon.functional;

import java.util.function.Predicate;

public class FunUtil {

    public static ThrowExceptionFunction isTrue(boolean b) {
        return (errMsg) -> {
            if (!b) throw new RuntimeException(errMsg);
        };
    }

    public static BranchHandler isTrueOrFalse(boolean b) {
        return (trueHandler, falseHandler) -> {
            if (b) trueHandler.run();
            else falseHandler.run();
        };
    }

    public static PresentOrElseHandler<?> isPresent(String obj) {
        return ((action, handler) -> {
            if (obj != null) action.accept(obj);
            else handler.run();
        });
    }

}
