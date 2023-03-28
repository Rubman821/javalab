class Stack{

    int[] ele;

    int top;



    void initStack(int size){

        ele=new int[size];

        top=-1;

    }



    void initStack(Stack another){

        ele=new int[another.ele.length];

        top=-1;

        for(int item:another.ele)

            push(item);

    }



    void initStack(int[] a){

        ele=new int[a.length];

        top=-1;

        for(int item:a)

            push(item);

    }



    void push(int item){

        if(top<ele.length){

            ele[++top]=item;

            System.out.println("Pushed element is "+item);

        }

        else

            System.out.println("Stack overflow");

    }



    int pop(){

        if(top==-1){

            System.out.println("Stack underflow");

            return -1;

        }

        else{

            int item=ele[top--];

            return item;

        }

    }

    int peek(){

        return ele[top];

    }

}

public class TW5a {

    public static void main(String[] args) {

        Stack s1=new Stack();

        Stack s2=new Stack();

        s1.initStack(5);

        s1.push(10);

        s1.push(20);

        s1.push(30);

        s1.push(40);

        s1.push(50);

        s2.initStack(s1);

        int[] array={1,2,3,4};

        Stack s3=new Stack();

        s3.initStack(array);

        System.out.println("Popped element in S1 object is "+s1.pop());

        System.out.println("Element on top of the stack of object s1 is "+s1.peek());

        System.out.println("Element on top of the stack of object s2 is "+s2.peek());



    }

}
