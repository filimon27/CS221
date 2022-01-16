package Assignment4;

public class DoubleLinkedList<E> {
    private DNode first;
    private DNode last;
    public int size=0;

    public DoubleLinkedList() {
        first = null;
        last = null;
    }
    public static class DNode<E> {
        public E  dData;
        public DNode<E> next;
        public DNode<E> prev;

        public DNode(E d)
        {
            dData = d;
        }
        @Override
        public String toString() {
            return dData+" ";
        }
    }


    private void addFirst(E item) {    //  add node at the front in the list
        DNode newNode = new DNode(item);
        if (first == null){
            last  = newNode;
            size++;
        }

        else
        {
            first.prev = newNode;
            newNode.next = first;
            size++;
        }
        first = newNode;
    }
    //
    private void addAfter(DNode<E> node, E item){    // adding node after a specified node in the list
//           if(last==null);
//                addFirst(item);
        DNode newNode=new DNode(item);
        if(node.next==null){
            addLast(item);
        }
        else{
            newNode.next=node.next;
            newNode.prev=node.next.prev;
            node.next.prev=newNode;
            node.next=newNode;
            size++;
        }
    }
    //
    private  E removeFirst(){   // remove the first node in the list
        DNode temp=first;
        if(temp==null)
            return null;
        if(first.next==null){
            last=null;
            first=null;
            size--;
        }
        else{
            first=first.next;
            first.prev=null;
            size--;
        }
        return (E) temp;

    }
    private  E removeLast(){    // remove the last node in the list
        DNode temp=last;
        if(temp==null)
            return null;
        if(last.prev==null){
            last=null;
            first=null;
        }
        else{
            last=last.prev;
            last.next=null;
            size--;
        }
        return (E) temp;

    }
    //
    private  E removeAfter(DNode<E> node){  // remove a node after a specified node in the list
        DNode temp=node.next;
        if(temp.next==null)
            return null;
        else{
            node.next=node.next.next;
            node.next.next.prev=node;
            node.next=null;
            temp.prev=null;
            size--;
        }
        return (E) temp;
    }

    private DNode<E> getNode(int index){   //  get a node at some index and return the node
        DNode node = first;
        if(node==null)
            return null;
        if(node!=null)
            for (int i=0; i<index; i++) {
                node = node.next;
            }
        return node;
    }

    public  E get(int index){           //  get a node at some index and return the item
        E data=null;
        if(index<0||index>size)
            throw new ArrayIndexOutOfBoundsException();
        DNode node=getNode(index);
        if(node!=null)
            data= (E) node.dData;
        return data;
    }

    public void add(int index, E item){  //adding node in the list
        if(index<0||index>size)
            throw new ArrayIndexOutOfBoundsException();
        DNode node=getNode(index);
        if(node.next==null)
            addLast(item);
        else if(node.prev==null)
            addFirst(item);
        else if(node.prev!=null&&node.next!=null){
            DNode newNode=new DNode(item);
            newNode.next=node;
            newNode.prev=node.prev;
            node.prev.next=newNode;
            node.prev=newNode;
            size++;
        }
    }
    //
    public  boolean addLast(E item){    //add a node at the end of the list
        DNode temp=new DNode(item);
        if(last==null){
            first=temp;
            size++;
            return true;
        }
        else{
            temp.prev=last;
            last.next=temp;
            size++;
        }
        last=temp;
        return true;
    }
    //
    public E remove(int index){   // remove a node in the list

        if(index<0||index>size)
            throw new ArrayIndexOutOfBoundsException();
        DNode node=getNode(index);
        E temp= (E) node.dData;
        if(node==null)
            return null;
        if(node.next==null)
            removeLast();

        if(node.prev==null){
            removeFirst();
        }
        if(node.next!=null && node.prev!=null){
            node.prev.next=node.next;
            node.next.prev=node.prev;
            node.next=null;
            node.prev=null;
            size--;
        }
        return temp;
    }

    public int size(){     // get the size
        return size;
    }

    @Override
    public String toString() {     // String builder
        StringBuilder sb = new StringBuilder();
        DNode p = first;
        if (p != null) {
            while (p.next != null) {
                sb.append(p.dData.toString()+" ");
                p = p.next;
            }
            sb.append(p.dData.toString());
        }
        return sb.toString();
    }
    public static void main(String []args){
        DoubleLinkedList<Integer> doubleList=new DoubleLinkedList<>();
        doubleList.addFirst(45);
        doubleList.addFirst(74);
        doubleList.addLast(66);
        doubleList.addLast(87);
        doubleList.addLast(93);
        doubleList.addFirst(44);
        System.out.println(doubleList+" ");
        doubleList.add(5,17);//
        System.out.println(doubleList+" ");
        doubleList.add(2,37);
        System.out.println(doubleList+" ");
        doubleList.remove(3);
        System.out.println(doubleList+" ");
        System.out.println(doubleList.get(2)+" ");
    }

}
