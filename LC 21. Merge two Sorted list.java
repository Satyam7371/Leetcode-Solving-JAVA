
class Satyam {
    ListNode mergeTwoLists(ListNode head1, ListNode head2) {
       if(head1==null) {
           return head2;
       }
       if(head2==null) {
           return head1;
       }
       if(head1.val < head2.val) {
           head1.next =  mergeTwoLists(head1.next, head2);
           return head1;
       }
       else {
           head2.next =  mergeTwoLists(head1, head2.next);
           return head2;
       }
   }
   public static void main(String[] args) {
    //    ListNode head1 = new ListNode();
    //    ListNode head2 = new ListNode();
    //    head1.head = new Solution().mergeTwoLists(head1.head,head2.head);
   }
}
