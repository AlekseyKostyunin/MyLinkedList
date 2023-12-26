public interface MyList<E>{

    void addFirst(E element); // вставка элемента в начало
    void addLast(E element); // вставка элемента в конец списка
    int size(); // получение размера списка
    E getOfIndex(int index); // Получение элемента по индексу
}
