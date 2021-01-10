import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromLL {
    boolean isHeadFound=false;
    public ListNode deleteDuplicates(ListNode head) {

       ListNode dummy= new ListNode(0);
       dummy.next=head;
       ListNode prev=dummy;
        ListNode currNode=head;


       if(head == null){
           return null;
       }
       while(currNode != null){
           while(currNode.next!=null && prev.next.val==currNode.next.val) {
               currNode = currNode.next;
           }
               if(prev.next == currNode){
                   prev=prev.next;
               }else{
                   prev.next=currNode.next;

               }
           currNode=currNode.next;

       }



        head=dummy.next;

        return  head;


    }
    public void checkDuplicate(ListNode node){
        if(node.next!=null && node.val==node.next.val){
            node=node.next;
        }
    }

/*    public void push(int val, ListNode listNode){
        ListNode head=new ListNode();
        ListNode newNode= new ListNode(val, listNode);
    }*/
/*    public void delete(ListNode node){
        ListNode currNode=new ListNode();

        if(node.next!=null){
            ListNode currNode=node.next;
            if(node.val==currNode.val){
                delete(currNode);
            }

            node.next=currNode;
        }
    }*/

 /*   public void push(int new_data)
    {
        *//* 1 & 2: Allocate the Node &
                  Put in the data*//*
        ListNode head=new ListNode();
        ListNode new_node = new ListNode(new_data);

        *//* 3. Make next of new Node as head *//*
        new_node.next = head;

        *//* 4. Move the head to point to new Node *//*
        head = new_node;
    }

    *//* Function to print linked list *//*
    void printList()
    {
        ListNode head=new ListNode();
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        RemoveDuplicateFromLL llist = new RemoveDuplicateFromLL();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.println("List before removal of duplicates");
        llist.printList();

       // llist.removeDuplicates();

       // System.out.println("List after removal of elements");
        //llist.printList();
    }
*/
}


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
