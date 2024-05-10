package mergedTwoSortedList;

public class Main {
    public static void main(String[] args) {

    }

     public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) {
         this.val = val;
     }
         ListNode(int val, ListNode next) {
         this.val = val; this.next = next;
     }
  }


   ListNode mergeTwoLists(ListNode list1, ListNode list2) {



        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        ListNode cur = returnNode;

        while(list1 != null || list2 != null) {
            if (list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }
       if (list1 == null){
           cur.next = list2;
       } else if (list2 == null) {
           cur.next = list2;
       }
       return returnNode.next;
    }

}
