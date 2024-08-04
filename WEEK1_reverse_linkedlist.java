package Linkedlist;


import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        next = null;
    }

}

public class Reverse_linkedlist {

    public static void main(String[] args) {

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Given Linkedlist");
        printlist(head);

        head = reverselist(head);
        System.out.println("Reversed Linkedlist");
        printlist(head);

    }

    static void printlist(Node node) {
        while (node != null) {
            System.out.print(" " + node.data);
            node = node.next;
        }

        System.out.println();

    }

    static Node reverselist(Node head) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;

        // Push all nodes except the last node into stack
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        // Make the last node as new head of the linked list

        if (!stack.isEmpty()) {
            head = stack.pop();
            temp = head;

            // Pop all the nodes and append to the linked list
            while (!stack.isEmpty()) {
                // append the top value of stack in list
                temp.next = stack.pop();
                // move to the next node in the list
                temp = temp.next;
            }
            // Update the next pointer of last node
            // of stack to NULL

            temp.next = null;

        }


        return head;

    }


}


