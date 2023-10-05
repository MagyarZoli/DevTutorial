package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Document;

public interface Command {

    void execute();

    class SubCommand
            implements Command {

        private Document document;

        public SubCommand(Document document) {
            this.document = document;
        }

        @Override
        public void execute() {
            document.save();
        }
    }

    class Sub2Command
            implements Command {

        private Document document;

        public Sub2Command(Document document) {
            this.document = document;
        }

        @Override
        public void execute() {
            document.print();
        }
    }
}