/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node cur = head;
        while(cur != null){
            if(cur.child != null){
                Node next = cur.next;
                Node newNode = flatten(cur.child);
                cur.next = newNode;
                newNode.prev = cur;
                cur.child = null;
                Node tail = newNode;
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = next;
                if(next != null){
                    next.prev = tail;
                }
            }
            cur = cur.next;
        }
        return head;
    }
}