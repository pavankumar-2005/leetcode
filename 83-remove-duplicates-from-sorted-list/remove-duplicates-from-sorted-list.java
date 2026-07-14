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
        if(head == null) return null;
        ListNode nn = head;
        ListNode temp = nn;
        ListNode prev = head;
         while(head != null){
            if(head.val != prev.val){
                temp.next = head;
                prev = head;
                temp = temp.next;
            }
            head = head.next;
        }
        temp.next = null;
        return nn;
    }
}