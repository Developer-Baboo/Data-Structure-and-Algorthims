class ListNode {
    constructor(value) {
      this.value = value;
      this.next = null;
    }
  }
  
  class LinkedList {
    constructor() {
      this.head = null;
    }
  
    // Insert a new node at the head of the list
    insertAtHead(value) {
      const newNode = new ListNode(value);
      newNode.next = this.head;
      this.head = newNode;
    }
  
    // Insert a new node at the tail of the list
    insertAtTail(value) {
      const newNode = new ListNode(value);
      if (this.head === null) {
        this.head = newNode;
        return;
      }
      let current = this.head;
      while (current.next !== null) {
        current = current.next;
      }
      current.next = newNode;
    }
  
    // Insert a new node after a specific value in the list
    insertAtMiddle(afterValue, value) {
      const newNode = new ListNode(value);
      let current = this.head;
      while (current !== null && current.value !== afterValue) {
        current = current.next;
      }
      if (current !== null) {
        newNode.next = current.next;
        current.next = newNode;
      } else {
        console.log('Value not found in the list');
      }
    }
  
    // Delete the node at the head of the list
    deleteFromStart() {
      if (this.head === null) {
        console.log('List is empty');
        return;
      }
      this.head = this.head.next;
    }
  
    // Delete the node at the tail of the list
    deleteFromEnd() {
      if (this.head === null) {
        console.log('List is empty');
        return;
      }
      if (this.head.next === null) {
        this.head = null;
        return;
      }
      let current = this.head;
      while (current.next.next !== null) {
        current = current.next;
      }
      current.next = null;
    }
  
    // Delete a node with a specific value from the list
    deleteFromMiddle(value) {
      if (this.head === null) {
        console.log('List is empty');
        return;
      }
      if (this.head.value === value) {
        this.head = this.head.next;
        return;
      }
      let current = this.head;
      while (current.next !== null && current.next.value !== value) {
        current = current.next;
      }
      if (current.next !== null) {
        current.next = current.next.next;
      } else {
        console.log('Value not found in the list');
      }
    }
  }

  // Example usage
  const list = new LinkedList();

list.insertAtHead(1);
list.insertAtTail(2);
list.insertAtTail(3);
list.insertAtMiddle(2, 2.5);
list.deleteFromStart();
list.deleteFromEnd();
list.deleteFromMiddle(2.5);
console.log(JSON.stringify(list, null, 2));

