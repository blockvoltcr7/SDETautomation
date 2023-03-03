arraylist:
This collection uses a one-dimensional resizable array to store elements.
The initial size of a collection upon creation is set to 10 elements by default.
Elements in a collection are placed in memory next to each other.
Accessing an element of a collection by index takes constant time.
Insertion at the end of a list takes, on average, constant time. Sometimes re-creation and copying are required.
Removing the last element of a collection takes constant time.
Inserting and removing collection elements in the middle of a list causes elements placed "to the right" in this list to be overwritten.
Removing elements does not reduce the size of an array. You can use the trimToSize() method, which truncates the size of an array to the current number of elements in the list.


linkedlist:
A linear data structure where elements containing data of the same type
are linked using pointers
each item in the linked list is called a node
a node contains data and a reference to the next element in the list
if a next node reference is null, then it is the last item in the list.

Since the elements are connected by pointers, the items do not need to be stored at contiguous memory locations. this means
insertion and deletion are less expensive.

Singly linked lists: contains a pointer pointing to the next node.
Doubly linked lists: contain a pointer pointing to the next node and a pointer pointing to the previous node.


This uses a bidirectional, cyclic linked list with a header element.
A collection element is accessed by index in linear time. This is due to the search for the element's position that starts from the header.
The first and last elements in a list are always accessed for constant time.
Insertion and deletion of an element occur in constant time (the position search is not taken into account here).
Insertion and deletion of an element are performed by reconfiguring the references of the previous and next elements, and the element is inserted or deleted between them.
The number of elements is potentially unlimited but depends on the amount of available memory.



ArrayList	LinkedList

Advantages	- Fast random access to elements<br>- Good for frequent reads and infrequent writes<br>- Memory efficient for storing large number of objects	- Fast insertion and deletion at any point in the list<br>- Good for frequent writes and infrequent reads<br>- Memory efficient for storing small number of objects


Disadvantages	- Slow insertion and deletion at any point in the list due to element shifting<br>- Not memory efficient for storing small number of objects<br>- Poor performance for very large lists with frequent insertions or deletions	- Slow random access to elements<br>- Poor performance for very large lists with frequent reads<br>- Uses more memory than ArrayList for storing the same number of objects
