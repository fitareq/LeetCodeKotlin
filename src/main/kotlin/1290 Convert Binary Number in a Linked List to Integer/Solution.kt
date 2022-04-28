package `1290 Convert Binary Number in a Linked List to Integer`

class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var res = head?.`val`
        while (head?.next != null) {
            if (res != null) {
                val h = head.next
                if (h != null) {
                    res = (res shl 1) or h.`val`
                }
            }
        }
        return res!!
    }
}



    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
