package org.example.pattern.behavioral;

public abstract class ChainOfResponsibility {

    private ChainOfResponsibility next;

    public ChainOfResponsibility(ChainOfResponsibility next) {
        this.next = next;
    }

    public void open(String extension) {
        if (next != null) {
            next.open(extension);
        }
    }

    public static class SubResponsibility
            extends ChainOfResponsibility {

        public SubResponsibility(ChainOfResponsibility next) {
            super(next);
        }

        @Override
        public void open(String extension) {
            if (extension.equals("sub")) {
                System.out.println("Open 1...");
            } else {
                super.open(extension);
            }
        }
    }

    public static class Sub2Responsibility
            extends ChainOfResponsibility {

        public Sub2Responsibility(ChainOfResponsibility next) {
            super(next);
        }

        @Override
        public void open(String extension) {
            if (extension.equals("sub2")) {
                System.out.println("Open 2...");
            } else {
                super.open(extension);
            }
        }
    }
}