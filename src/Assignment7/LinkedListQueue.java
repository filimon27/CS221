package Assignment7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListQueue <Customer> implements QueueInterface <Customer>, Iterable{
    private Node <Customer> head;
    private Node <Customer> tail;
    private int size;

    public static class Node <Customer>{
        private Customer data;
        private Node <Customer> next;

        public Node ( Customer data){
            this.data = data;
            this.next = null;
        }
        public Node(Customer data, Node <Customer> next) {
            this.data = data;
            this.next = next;
        }
    }


    class MyIterator <Customer> implements Iterator<Customer>{
        public Node <Customer> current = (Node <Customer>)head;
        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public Customer next() {
            Customer customer = current.data;
            current = current.next;
            return customer;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }


    @Override
    public Iterator iterator() {
        return new MyIterator<Customer> ();
    }



    @Override
    public boolean add(Customer customer) {
        Node<Customer> newNode = new Node <> (customer);
        if(head ==null){
            tail = newNode;
            head = tail;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }

    @Override
    public boolean offer(Customer customer) {
        Node <Customer> newNode = new Node<>(customer);
        if(head ==null){
            tail = newNode;
            head = tail;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
        return true;
    }

    @Override
    public Customer remove() {
        if(size == 0){
            throw new NoSuchElementException();
        }
        Customer hand = head.data;
        head = head.next;
        size--;
        return hand;
    }

    @Override
    public Customer poll() {
        if(size == 0){
            return null;
        }
        Customer hand = head.data;
        head = head.next;
        size--;
        return hand;
    }

    @Override
    public Customer peek() {
      if(size == 0 ){
          return null;
      }else{
          return head.data;
      }
    }

    @Override
    public Customer element() {
        if(size == 0){
            throw new NoSuchElementException();
        }else{
            return head.data;
        }
    }

    @Override
    public int getSize() {
        return size;
    }
    private void addFirst(Customer item){
        Node<Customer> temp = new Node<>(item, head);
        head = temp;
        size++;
    }

    private void addAfter(Customer item, Node<Customer> node){
        Node<Customer> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    private Customer removeAfter(Node<Customer> node){ // Tom
        Node<Customer> toRemove = node.next;  // toRemove --> Dean

        if(toRemove != null){
            node.next = toRemove.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private Customer removeFirst(){
        Node<Customer> toRemove = head;

        if(head != null){
            head = head.next;
            size--;
            return toRemove.data;
        }
        else
            return null;
    }

    private Node<Customer> getNode(int index){
        Node<Customer> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }


    public void add(int index, Customer item){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index ==0){
            addFirst(item);
        }
        else{
            Node<Customer> node = getNode(index - 1);
            addAfter(item, node);
        }

    }
    public void addI(Customer item){
        add(size,item);
    }

    public Customer get(int index){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        Node<Customer> node = getNode(index);
        return node.data;
    }

    public int size(){
        return size;
    }

    public Customer set (int index, Customer replaceValue){
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        Node<Customer> node = getNode(index);
        Customer hand = node.data;
        node.data = replaceValue;
        return hand;
    }

    public Customer remove(int index){ // 5
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException();

        if(index == 0)
            return removeFirst();
        else{
            Node<Customer> node = getNode(index - 1);
            return removeAfter(node);
        }
    }


    public boolean removeI(Object i){
        Customer item = (Customer) i;
        if(head ==null){
            return false;
        }

        Node<Customer> current = head;
        if(item.equals(current.data)){
            removeFirst();
            return true;
        }
        while(current.next != null){
            if(item.equals(current.next.data)){
                removeAfter(current);
                return true;
            }
            current = current.next;

        }
        return false;
    }

    public void traverse(){
        Node<Customer> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void replaceAll( Customer item, Customer itemReplaceWith){ // Dean , Muhyieddin
        Node<Customer> current = head;

        while(current != null){
            if(current.data.equals(item)){
                current.data = itemReplaceWith;
            }
            current = current.next;
        }
    }

    public void traverseTemplate(){
        Node<Customer> current = head;

        while(current != null){
            // TODO add functionality
            current = current.next;
        }
    }


    public String toString() {
        Node<Customer> current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }

}
