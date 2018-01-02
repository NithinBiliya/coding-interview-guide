# coding-interview-guide
coding interview preparation materials

Data structures and algorithms

1. [Linked List](#linked-list)
2. [Stack](#stack)

=======================================================

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

Key works - push, pop, peer, top of the stack, depth of the stack

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

    Infix - 5+7\*6-1
    
    Postfix - 576\*+1-
    
