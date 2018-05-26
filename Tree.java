public interface Tree<T> {
    public void add(T data);
    public void remove(T data);
    public void traverse();
    public T getMinimum();
    public T getMaximum();
}