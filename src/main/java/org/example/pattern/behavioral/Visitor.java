package org.example.pattern.behavioral;

import java.util.ArrayList;
import java.util.List;

public interface Visitor {

    void visit(SuperVisitor superVisitor);

    class VisitorImp
            implements Visitor {

        @Override
        public void visit(SuperVisitor superVisitor) {
            superVisitor.message();
        }
    }

    interface SuperVisitor {

        String message();

        void accept(Visitor visitor);
    }

    class SubVisitor
            implements SuperVisitor {

        @Override
        public String message() {
            return "subVisitor...";
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    class Sub2Visitor
            implements SuperVisitor {

        @Override
        public String message() {
            return "sub2Visitor...";
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    class Sub3Visitor
            implements SuperVisitor {

        private List<SuperVisitor> superVisitorList = new ArrayList<>();

        public Sub3Visitor() {
            superVisitorList.add(new SubVisitor());
            superVisitorList.add(new Sub2Visitor());
            superVisitorList.add(new SubVisitor());
        }

        @Override
        public String message() {
            StringBuilder result = new StringBuilder();
            for (SuperVisitor v : superVisitorList) {
                result.append(v.message()).append("\n");
            }
            return result.toString();
        }

        @Override
        public void accept(Visitor visitor) {
            superVisitorList.forEach(v -> v.accept(visitor));
            visitor.visit(this);
        }
    }
}