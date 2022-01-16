package Assignment4;


import org.w3c.dom.Node;

public class SingleLinkedList<E> {
    private Node<Integer> head= null;
    private int size=0;

    public static class Node<E>{
        private Integer data;
        private  Node<E>next;


        public Node(int data, Node<E> next){
            this.data=data;
            this.next=next;
        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }


    }
    private void add(int item){
        Node <Integer>value= new Node<>(item,head);
        head=value;
        size++;
    }
    private Node <Integer>getNode(int index){
        Node <Integer>node= head;

            for (int i = 0; i < index && node !=null;  i++) {
                node= node.next;
            }

            return  node;

    }

    private int size(){
        return size;
    }
    private boolean find(int item){
        for (int i = 0; i < size; i++) {
            if(getNode(i).data==item)
                return  true;
        }
        return false;

    }
    public int max(){
       int max=getNode(0).data;
        Node <Integer>node=head;
        while(head!= null){
            if(max<head.data)
            max = head.data;
            head=head.next;
        }

        return max;
    }
    public int min(){
        int min=getNode(0).data;
        Node<Integer> node= head;
        while(node!= null){
            if(min>node.data)
                min = node.data;
            head=head.next;
        }

        return min;
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer>sll= new SingleLinkedList<Integer>();
        sll.add(45);
        sll.add(67);
        sll.add(99);
        sll.add(89);
        System.out.println(sll);
        System.out.println(sll.size());
        System.out.println(sll.find(6));
        System.out.println(sll.find(45));
        System.out.println(sll.max());
        System.out.println(sll.min());
    }

}
