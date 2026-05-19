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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            head = null;
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == n){
            head = head.next;
            return head;
        }
        int s = size - n + 1;
        int i=1;
        ListNode k = head;
        while(i < size - n){
            k = k.next;
            i++;
        }
        k.next = k.next.next;
        return head;
    }
}