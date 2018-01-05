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

### Operations on stack
1. Enqueue
2. Dequeue
3. Peek
4. Count
5. Clear
6. Enumerate

### Priority Queue
Not FIFO. The items are added into the queue at specific locations based on their priority


## Binary Tree
Startes with a root node. Each node has 0-2 children.

### Binary Search Tree
Sorted hierarchy of data. 

Left child - Value less than the parent node

Right child - Value greater than or equal to the parent node

### Operations
1. Adding data
2. Finding data -- no need to search the entire tree, only one subset is enough. So better than linked list
3. Removing data
4. Traversal
    1. Pre order - process node, visit left, visit right
    2. In order - visit left, process node, visit right -- gives list in ascending sort order
    3. Post order - visit left, visit right, process node


Useful links -
1. http://scanftree.com/Data_Structure/
