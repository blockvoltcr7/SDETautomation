package Collections.ds;

public class App {

    public static void main(String[] args) {
//        Stack theStack = new Stack(6);
//
//        theStack.push(20);
//
//
//        while(!theStack.isEmpty()){
//            char val = theStack.pop();
//            System.out.println(val);
//        }


        String str = reverseString("sami");
        System.out.println(str);
    }

    public static String reverseString(String str){
        int stackSize = str.length();//get the size of the string
        Stack stack = new Stack(stackSize);//initialize the stack
        for(int i = 0; i<stackSize;i++){ //iterate over each char in the string
            char ch = str.charAt(i); //get each char from the string by index
            stack.push(ch); //add the char to the stack
        }

        String reversedString = ""; //initalize an empty string to add the chars to
        while(!stack.isEmpty()){//while the stack is not empty iterate over it
            char ch = stack.pop();// pop out the char
            reversedString = reversedString+ch;// add the char to the empty string
        }
        return reversedString;
    }
}
