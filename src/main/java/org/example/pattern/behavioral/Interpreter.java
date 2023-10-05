package org.example.pattern.behavioral;

public interface Interpreter {

    String interpret(String context);

    class SubInterpreter
            implements Interpreter {

        @Override
        public String interpret(String context) {
            return context.toUpperCase();
        }
    }

    class Sub2Interpreter
            implements Interpreter {

        SubInterpreter subInterpreter = new SubInterpreter();

        @Override
        public String interpret(String context) {
            return subInterpreter.interpret(context + context.length());
        }
    }

    class Sub3Interpreter
            implements Interpreter {

        Sub2Interpreter sub2Interpreter = new Sub2Interpreter();

        @Override
        public String interpret(String context) {
            return sub2Interpreter.interpret(context.trim());
        }
    }
}