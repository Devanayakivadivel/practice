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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode res=new ListNode(0);
    ListNode s=res;

    while(list1 !=null && list2!=null){
        if(list1.val<list2.val){
            s.next=list1;
            list1=list1.next;
        }
        else{
            s.next=list2;
            list2=list2.next;
        }
        s=s.next;
        }
        if(list1!=null) s.next=list1;
        if(list2!=null) s.next=list2;
        return res.next;
    }
}