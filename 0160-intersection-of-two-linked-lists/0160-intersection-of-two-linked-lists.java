/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      int lenA = size(headA);
      int lenB = size(headB);

      while(lenA > lenB){
          headA = headA.next;
          lenA--;
      }

      while(lenA<lenB){
          headB = headB.next;
          lenB--;
      }

      while(headA != headB){
          headA = headA.next;
          headB = headB.next;
      }

      return headB;
    }
    public int size(ListNode list){
        int len = 0;
        ListNode temp;
        for(temp = list ; temp!=null ; temp=temp.next)
           len++;

           return len;
    }
}

