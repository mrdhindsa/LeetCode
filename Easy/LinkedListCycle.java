public boolean hasCycle(ListNode head){
    if(head == null) return false;
    ArrayList<ListNode> arr = new ArrayList<ListNode>();
    ListNode temp = head;
    while(temp.next != null){
        if(arr.contains(temp)){
            return true;
        }
        arr.add(temp);
        temp = temp.next;
    }
    return false;
}
