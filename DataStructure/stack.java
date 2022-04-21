class stack{
    int top=-1;
    int size=100;
    int arr[]=new int[size];

    void push(int x)
    {

        if(top==size-1)
        {
            System.out.println("underflow");
        }
        else
        {
            top+=1;
            arr[top]=x;
            System.out.println("element to be inserted to the stack:"+x);
            
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("poped element:"+arr[top]);
            top-=1;
    
        }
    }
    void show()
    {
        int i;
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element present in the stack:");
            for(i=0;i<=top;i++)
                 System.out.println(arr[i]); 
       }
    }
    public static void main(String args[])
    {
        stack call=new stack();
        call.push(3);
        call.push(8);
        call.push(7);
        call.pop();
        call.show();
    }
}