package easy;

/**
 * @author : lixiang
 * @date : 2019-12-17 9:23
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        重新定义一个新链表 开始值为-1
        ListNode head = new ListNode(-1);
        ListNode pre = head;
//        l1,l2指向的地址不为空 循环比较每个地址之间的val
        while (l2 != null && l1 != null) {
            if (l1.val <= l2.val) {
//                l1<=l2 pre的下一个地址指向l1
                pre.next = l1;
//                l1指向下一个地址
                l1 = l1.next;
            } else {
                pre.next = l2;
                l2 = l2.next;
            }
//            pre指向下一个地址
            pre = pre.next;
        }
//       l1是否为空 为空就把l2补到pre.next 反之亦然
        pre.next = l1 == null ? l2 : l1;
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}
