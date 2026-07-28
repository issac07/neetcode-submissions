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
        
        ListNode res = new ListNode(0);
        ListNode ans = res;
        while (list1 != null && list2 != null)
        {
            int l1 = list1.val;
            int l2 = list2.val;

            if (l2 > l1)
            {
                ListNode newN = new ListNode(l1);
                res.next = newN;
                res = res.next;
                list1 = list1.next;
            }
            else
            {
                ListNode newN = new ListNode(l2);
                res.next = newN;
                res = res.next;
                list2 = list2.next;
            }
        }

        if (list1 != null || list2 != null)
        {
            res.next = list1 != null ? list1 : list2;
        }

        return ans.next;
    }
}