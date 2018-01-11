# coding-interview-guide
coding interview preparation materials



Data structures and algorithms

![alt text](http://scanftree.com/Data_Structure/pic.png "Data Structures")

1. [Linked List](#linked-list)
2. [Stack](#stack)
3. [Queue](#queue)
4. [Binary Tree](#binary-tree)

=======================================================

Topics to read before starting - Random-access-machine model, time/space complexity (Big O notation)

## Linked List
Node - container contains a data part and a link part.

1. Singly linked list - only one pointer in a node pointing to the next node
    1. head pointer - only one pointer pointing to the first node of the linked list. (points to null if empty)
    2. head and tail pointer - head pointer points to the first node while the tail pointer points to the last node (both points to null if empty)
2. Doubly linked list - two pointers in a node. one pointing to the next node while the other pointing to the previous node
3. Circular linked list - the last node in the linked list points to the first node in the list

### Operations on linked list
1. Add node
    1. Add at the head
    2. Add at the tail
2. Delete node
    1. Delete at the head
    2. Delete at the tail
    3. Delete based on the value of the node
3. Search
4. Enumerate
5. Clear list


## Stack
LIFO -- Last In First Out

Key works - push, pop, peek, top of the stack, depth of the stack

1. Implementation using Linked List
2. Implementation using Array

### Operations on stack
1. Push
2. Pop
3. Peek
4. Count
5. Clear
6. Enumerate

### Postfix calculator
using stack to implement postfix calculator

Postfix is unambiguous of the priority of the operation.

Eg -
```
    Infix - 5+7*6-1
    Postfix - 576*+1-
```

### Infix transformation to Postfix
using stack to transform infix to postfix expression

### Infix transformation to Prefix
using stack to transform infix to prefix expression

## Queue
FIFO -- First In First Out

Key works - enqueue, dequeue, peek, head of the queue

1. Implementation using Linked List
2. Implementation using Array

### Operations on queue
1. Enqueue
2. Dequeue
3. Peek
4. Count
5. Clear
6. Enumerate

### Priority Queue
Not FIFO. The items are added into the queue at specific locations based on their priority

Other queues - Dequeue (Double ended queue), circular queue

## Binary Tree
Startes with a root node. Each node has 0-2 children. Tree - only one path between any two nodes in a tree.

### Binary Search Tree
Sorted hierarchy of data. 

Left child - Value less than the parent node

Right child - Value greater than or equal to the parent node

### Operations
1. Adding data
2. Finding data -- no need to search the entire tree, only one subset is enough. So better than linked list
3. Removing data -- 3 cases to consider
4. Traversal
    1. Pre order - process node, visit left, visit right
    2. In order - visit left, process node, visit right -- gives list in ascending sort order
    3. Post order - visit left, visit right, process node
5. Clear

## Hash Tables
associative array - key/value paid. Key is unique

Useful links -
1. http://scanftree.com/Data_Structure/
2. https://cathyatseneca.gitbooks.io/data-structures-and-algorithms/content/


## Java implemetation
1. [singly linked list - no count variable](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/linked-list/com/cig/ds/SinglyLinkedList.java)
2. [singly linked list](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/linked-list/com/cig/ds/SinglyLinkedList2.java)
3. [doubly linked list](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/linked-list/com/cig/ds/DoublyLinkedList.java)
4. [stack - implemented using array](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/stack/com/cig/ds/StackArray.java)
5. [stack - implemented using linked list](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/stack/com/cig/ds/StackLinkedList.java)
6. [stack - implemented using linked list](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/stack/com/cig/ds/StackLinkedList.java)
7. [postfix calculator - using stack](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/stack/PostfixCalculator.java)
8. [infix to postfix conversion - using stack](https://github.com/NithinBiliya/coding-interview-guide/blob/master/java-implementation/stack/InfixToPostfix.java)
9. infix to prefix conversion - using stack
10. postfix to infix conversion - using stack
11. prefix to infix conversion - using stack
12. queue - implemented using linked list
13. queue - implemented using array
14. priority queue
15. binary search tree
16. sorting works - using BST

