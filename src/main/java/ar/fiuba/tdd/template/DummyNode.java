package ar.fiuba.tdd.template;

class DummyNode<T> extends Node<T> {

    public boolean emptyNode() {
        return true;
    }

    public DataNode<T> linkFinalNode(T item) {
        return new DataNode<>(item);
    }

    public T getElement() {
        throw new AssertionError("The queue is empty");
    }

    public Node<T> nextNode() {
        throw  new AssertionError("The queue is empty");
    }








}
