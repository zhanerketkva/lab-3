# lab-3
# MyArrayListQueue
# Enquequ
The enqueue method in a queue data structure is used to add an element to the end of the queue. 
```
public void enqueue(E element) {
        list.add(element);
    }
 ```
# Dequeue
The dequeue method in a queue data structure is used to remove and return the element at the front of the queue.
```
public E dequeue() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }
 ```
# Peek
The peek method in a queue data structure is used to retrieve the element at the front of the queue without removing it.
 ```public E peek() {
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
    }
 ```
# isEmpty
The isEmpty method in a queue data structure is used to check if the queue is empty or not.
```public boolean isEmpty() {
        return list.isEmpty();
    }
 ```
# Size
The size method in a queue data structure is used to retrieve the number of elements currently stored in the queue.
```public int size() {
        return list.size();
    }
```

# MyArrayListStack
# Push
The push() method is used to add an element to the top of the stack.
# Pop
The pop() method is used to remove and return the element at the top of the stack.
# Peek
The peek() method is used to retrieve, but not remove, the element at the top of the stack.
# isEmpty
The isEmpty() method is used to check whether the stack is empty or not. It returns true if the stack is empty, and false otherwise.
# Size
The isEmpty() method is used to check whether the stack is empty or not. It returns true if the stack is empty, and false otherwise.
