package linkedlist;

public class Main {
    public static void main(String[] args) {
        ListNode node = new ListNode(1  , new ListNode(1 ,new ListNode(2 )));
        var node2 = deleteDuplicates(node);
        System.out.println(node2.val);
        System.out.println(node2.next.val);
    }

   static class ListNode{
        int val;
        ListNode next;

        public ListNode(){}

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head){
        ListNode prev= head;
        ListNode temp = head.next;
        while(temp != null){
            if (prev.val == temp.val){
                temp = temp.next;
                continue;
            }
                prev.next = temp;
                prev = temp;
                temp =temp.next;



        }
        prev.next = null;
        return head;
    }
}
