public ListNode brute_getIntersectionNode(ListNode headA, ListNode headB) { // O(n*n) runtime, O(1) space
    if(headA == null || headB == null) return null;
    ListNode temp1 = headA, temp2 = headB;
    while(temp1 != null){
        while(temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp2 = temp2.next;
        }
        temp1 = temp1.next;
        temp2 = headB;
    }
    return null; // Unreachable
} 

// Optimized time
public ListNode optimized_getIntersectionNode(ListNode headA, ListNode headB) { // O(n) runtime, O(1) space
    if(headA == null || headB == null) return null;
    ListNode temp1 = headA, temp2 = headB;
    while(temp1 != temp2){
        temp1 = (temp1 == null) ? headB : temp1.next;
        temp2 = (temp2 == null) ? headA : temp2.next;
    }
    return temp1;
} 
