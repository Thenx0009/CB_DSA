package Leetcode;

public class Reorder_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	// Approach
	// 1--> find the mid
	// 2--> reverse the second half of the list
	// 3--> reorder the list by traversing on both the list
	class Solution {
		public void reorderList(ListNode head) {
			if (head == null || head.next == null) {
				return;
			}

			// Find the middle of the linked list
			ListNode slow = head;
			ListNode fast = head;
			while (fast.next != null && fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}

			// Reverse the second half of the linked list
			ListNode prev = null;
			ListNode curr = slow.next;
			slow.next = null;
			while (curr != null) {
				ListNode nextTemp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = nextTemp;
			}

			// Merge the two halves
			ListNode first = head;
			ListNode second = prev;
			while (second != null) {
				ListNode firstNext = first.next;
				ListNode secondNext = second.next;
				first.next = second;
				second.next = firstNext;
				first = firstNext;
				second = secondNext;
			}
		}
	}
}
