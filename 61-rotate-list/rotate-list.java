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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) return head;
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        k = k % n;
        if(k == 0) return head;
        ListNode p = head;
        for(int i=1; i<n-k; i++){
            p = p.next;
        }
        temp = p.next;
        p.next = null;
        ListNode last = temp;
        while(last.next != null){
            last = last.next;
        }
        last.next = head;
        return temp;
    }
}