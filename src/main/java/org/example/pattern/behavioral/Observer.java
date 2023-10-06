package org.example.pattern.behavioral;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Observer
        implements PropertyChangeListener {

    private List<String> statuses = new ArrayList<>();

    public void printStatuses() {
        statuses.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        statuses.add((String) evt.getNewValue());
    }

    public static class Connection {

        private String status = "";
        private PropertyChangeSupport support = new PropertyChangeSupport(this);

        public void setStatus(String status) {
            support.firePropertyChange("status", this.status, status);
            this.status = status;
        }

        public void addPropertyChangeListener(PropertyChangeListener listener) {
            support.addPropertyChangeListener(listener);
        }
    }
}