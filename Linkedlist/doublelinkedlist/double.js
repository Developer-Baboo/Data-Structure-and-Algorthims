class ListNode {
    constructor(value) {
      this.value = value;   // Assigns the value to the current node
      this.next = null;     // Initializes the next pointer to null (default)
      this.prev = null;     // Initializes the previous pointer to null (default)
    }
  }
  
  
  class DoublyLinkedList {
    constructor() {
      this.head = null;   // Initializes the head of the list to null (empty list)
      this.tail = null;   // Initializes the tail of the list to null (empty list)
    }
  
    // Insert a new node at the head of the list
    insertAtHead(value) {
      const newNode = new ListNode(value);  // Creates a new node with the given value
      if (this.head === null) {
        // If the list is empty, set newNode as both head and tail
        this.head = newNode;
        this.tail = newNode;
      } else {
        // If the list is not empty
        newNode.next = this.head;   // Sets newNode's next pointer to the current head
        this.head.prev = newNode;   // Updates the previous pointer of the current head to newNode
        this.head = newNode;        // Updates the head of the list to newNode
      }
    }
  
    // Insert a new node at the tail of the list
    insertAtTail(value) {
      const newNode = new ListNode(value);  // Creates a new node with the given value
      if (this.tail === null) {
        // If the list is empty, set newNode as both head and tail
        this.head = newNode;
        this.tail = newNode;
      } else {
        // If the list is not empty
        newNode.prev = this.tail;   // Sets newNode's previous pointer to the current tail
        this.tail.next = newNode;   // Updates the next pointer of the current tail to newNode
        this.tail = newNode;        // Updates the tail of the list to newNode
      }
    }
  
    // Insert a new node at a specified position in the list
    insertAtPosition(position, value) {
      if (position < 0) {
        console.log('Invalid position');
        return;
      }
      const newNode = new ListNode(value);
      if (position === 0) {
        // Insert at head
        this.insertAtHead(value);
      } else {
        let current = this.head;
        let count = 0;
        while (current !== null && count < position) {
          current = current.next;
          count++;
        }
        if (current === null) {
          // Insert at tail
          this.insertAtTail(value);
        } else {
          newNode.prev = current.prev;
          newNode.next = current;
          if (current.prev !== null) {
            current.prev.next = newNode;
          } else {
            this.head = newNode;
          }
          current.prev = newNode;
        }
      }
    }
  
    // Delete a node from the list
    deleteNode(value) {
        // Start with the head of the list
        let current = this.head;
      
        // Traverse the list until either we find the node with the specified value or reach the end (current === null)
        while (current !== null && current.value !== value) {
          current = current.next;
        }
      
        // If current is null, the node with the specified value was not found in the list
        if (current === null) {
          console.log('Node not found');
          return;
        }
      
        // If the node to be deleted is the head of the list
        if (current === this.head) {
          // Move the head to the next node
          this.head = current.next;
      
          // If there's a new head, update its prev pointer to null (since it's now the first node)
          if (this.head !== null) {
            this.head.prev = null;
          }
        } 
        // If the node to be deleted is the tail of the list
        else if (current === this.tail) {
          // Move the tail to the previous node
          this.tail = current.prev;
      
          // If there's a new tail, update its next pointer to null (since it's now the last node)
          if (this.tail !== null) {
            this.tail.next = null;
          }
        } 
        // If the node to be deleted is somewhere in the middle of the list
        else {
          // Adjust the next pointer of the previous node to skip the current node
          current.prev.next = current.next;
      
          // Adjust the prev pointer of the next node to skip the current node
          current.next.prev = current.prev;
        }
    }
} 
const dll = new DoublyLinkedList();
dll.insertAtHead(1);
dll.insertAtTail(2);
dll.insertAtPosition(1, 1.5);
dll.deleteNode(1.5);
console.log(JSON.stringify(dll, null, 2));
