package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.User;
import org.example.pattern.auxiliary.User2;

public abstract class TemplateMethod {

    public abstract void work();

    public void cv() {
        System.out.println("Profile:\n.\n.\n...");
    }

    public void printCV() {
        cv();
        work();
    }

    public static class SubTemplate
            extends TemplateMethod{

        private User user;

        public SubTemplate(User user) {
            this.user = user;
        }

        @Override
        public void work() {
            System.out.printf("Work with %s%n",
                    user.getWork());
        }

        @Override
        public void cv() {
            System.out.printf("[%s]%n[%d]%n[%s, %d]%n",
                    user.getName(),
                    user.getAge(),
                    user.getAddress().getCountry(),
                    user.getAddress().getZip());
            super.cv();
        }
    }

    public static class Sub2Template
            extends TemplateMethod{

        private User2 user;

        public Sub2Template(User2 user) {
            this.user = user;
        }

        @Override
        public void work() {
            System.out.printf("Work with %s%s%n",
                    user.getWork(),
                    user.isDriverLicense() ? " Driver" : "");
        }

        @Override
        public void cv() {
            System.out.printf("[%s %s]%n[%s, %d]%n",
                    user.getFirstName(),
                    user.getLastName(),
                    user.getAddress().getCountry(),
                    user.getAddress().getZip());
            super.cv();
        }
    }
}