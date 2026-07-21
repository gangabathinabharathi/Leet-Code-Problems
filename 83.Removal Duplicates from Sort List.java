/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        
        ListNode curr, succ;
        succ = head;
        curr = succ.next;
        
        while (curr != null){
            if(succ != null && curr.val == succ.val){
                succ.next = curr.next;
                curr.next = null;
                curr = succ.next;
            }
            else {
                succ = curr;
                curr = curr.next;
            }
        }
        
        return head;
    }
}
