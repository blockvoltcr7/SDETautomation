package Collections.StackExample;

public class Stack {

    private int maxSize; //stores the size of the stack
    private char[] stackArray; //this array will contain the list of items
    private int top; //represents the index position of the last item that was placed on top of the stack


    //constructor to initlize the data structure with the correct number of slots needed
    //initlize our stack array
    public Stack(int size){
        this.maxSize = size;
        this.stackArray = new char[maxSize]; //initilize the stack with the size
        this.top = -1; //represents the index position of the last object added to the stack
        //there is nothing on the top of the stack, once we add something to the stack it will be set to the zero index of the array

    }


    public void push(char j){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            top++;//increment the index
            stackArray[top] = j;//pushing the char to the next index of the stack
        }

    }

    //function returns the data, return the item we poped
    public char pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return '0';//return nothing if the stack is empty
        }else{
            int oldTop = top; //give oldtop the current position of the item on top of the stack
            top--; //reduce the index number because we
            return stackArray[oldTop];
        }

    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

    public boolean isFull(){
        return (maxSize-1 == top);
    }
}
