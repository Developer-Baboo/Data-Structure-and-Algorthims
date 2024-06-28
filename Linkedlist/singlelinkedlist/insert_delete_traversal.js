// Node class to represent each node in the linked list
class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the linked list
class LinkedList {
    constructor() {
        this.head = null; // Head pointer to the first node of the list
    }

    // Insert a new node at the end of the list
    insert(data) {
        let newNode = new Node(data);
        if (this.head === null) {
            // If the list is empty, set the new node as the head
            this.head = newNode;
        } else {
            // Traverse to the end of the list and add the new node
            let current = this.head;
            while (current.next !== null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete a node with the given data
    delete(data) {
        if (this.head === null) {
            // If the list is empty, return
            return;
        }

        if (this.head.data === data) {
            // If the head node is the one to be deleted, move the head to the next node
            this.head = this.head.next;
            return;
        }

        // Traverse the list to find the node to be deleted
        let current = this.head;
        while (current.next !== null && current.next.data !== data) {
            current = current.next;
        }

        if (current.next !== null) {
            // Skip the node to be deleted
            current.next = current.next.next;
        }
    }

    // Traverse the list and print each node's data
    traverse() {
        let current = this.head;
        while (current !== null) {
            console.log(current.data);
            current = current.next;
        }
    }
}

// Example usage
let list = new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
console.log("Traversal after insertions:");
list.traverse();

list.delete(20);
console.log("Traversal after deletion:");
list.traverse();