//public class DeleteNodeWithoutHead {
//}

import java.util.*;

class node {
    int data;
    node next;
}

class Main {
    static node create(int data) {
        node tmp = new node();
        tmp.data = data;
        tmp.next = null;
        return tmp;
    }

    static node deletedNode(node head, node toBeDeleted) {
        if (toBeDeleted == null)
            return null;
        else {
            if (toBeDeleted.next == null) {
                System.out.print("Last node can't be freed");
                return null;
            }
            // store or swap but ( the data of current node will be deleted)
            toBeDeleted.data = toBeDeleted.next.data;
            toBeDeleted.next = toBeDeleted.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        // create a linked list
        node head = new node();
        head = create(2);
        head.next = create(3);
        node toBeDeleted = create(4);
        head.next.next = toBeDeleted;
        head.next.next.next = create(5);
        head.next.next.next.next = create(6);
        head.next.next.next.next.next = create(7);

        System.out.print("Old Linked List: ");
        node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        head = deletedNode(head, toBeDeleted);

        System.out.print("\n" + "New Linked List: ");
        tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
/*
Time Complexity
O(1), because swapping can be down in constant time. And then we just change some pointers which is again a constant time operation.
Space Complexity
O(1), because the variables which we have used do not depend on the number of nodes in the linked list. Thus space complexity is also constant.
 */