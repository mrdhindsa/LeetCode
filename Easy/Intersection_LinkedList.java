public ListNode brute_getIntersectionNode(ListNode headA, ListNode headB) { // O(m*n) time, O(1) space
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

public ListNode optimized2_getIntersectionNode(ListNode headA, ListNode headB) { // O(m+n) time, O(m) space 
        if(headA == null || headB == null) return null;
        ListNode temp1 = headA, temp2 = headB;
        ArrayList<ListNode> arr = new ArrayList<ListNode>();
        while(temp1 != null){
            arr.add(temp1);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            if(arr.contains(temp2)) break;
            temp2 = temp2.next;
        }
        return temp2;
    } 

// Optimized time
public ListNode optimized_getIntersectionNode(ListNode headA, ListNode headB) { // O(m+n) time, O(1) space 
    if(headA == null || headB == null) return null;
    ListNode temp1 = headA, temp2 = headB;
    while(temp1 != temp2){
        temp1 = (temp1 == null) ? headB : temp1.next;
        temp2 = (temp2 == null) ? headA : temp2.next;
    }
    return temp1;
} 
