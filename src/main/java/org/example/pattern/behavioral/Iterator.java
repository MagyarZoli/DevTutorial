package org.example.pattern.behavioral;

import org.example.pattern.auxiliary.Document;

public class Iterator
        implements Iterable<Document> {

    private Document[] documents;

    public Iterator(Document... documents) {
        this.documents = documents;
    }

    public Document[] getDocuments() {
        return documents;
    }

    @Override
    public SubIterator iterator() {
        return new SubIterator(this);
    }

    public static class SubIterator
            implements java.util.Iterator<Document> {

        private Iterator iterator;
        private int index;

        public SubIterator(Iterator iterator) {
            this.iterator = iterator;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            Document[] document = iterator.getDocuments();
            if (index < document.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Document next() {
            Document[] document = iterator.getDocuments();
            if (hasNext()) {
                return document[index++];
            } else {
                return null;
            }
        }
    }
}