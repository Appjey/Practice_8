import java.util.concurrent.ConcurrentLinkedDeque;


public class UnfairWaitList<E> extends WaitList<E> {


    public UnfairWaitList() {
        content = new ConcurrentLinkedDeque<>();
    }

    /**
     * Удаляет элемент, переданный в качестве параметра, из очереди
     * @param element элемент, котоырй необходимо удалить
     */
    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Перемещает элемент в конец очереди
     * @param element элемент, который необходимо удалить
     */
    public void moveToBack(E element) {
        content.remove(element);
        content.addLast(element);
    }

}
