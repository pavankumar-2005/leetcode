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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode findKthNode(ListNode head, int k){
        ListNode temp = head;
        for(int i=1; i<k; i++){
            if(temp == null) return null;
            temp = temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode newNode = temp;
        while(temp != null){
            ListNode kth = findKthNode(temp, k);
            if(kth == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            newNode = kth.next;
            kth.next = null;
            ListNode r = reverse(temp);
            if(prev == null){
                head = r;
            }
            else{
                prev.next = r;
            }
            prev = temp;
            temp = newNode;
        }
        return head;
    }
}