class Queue{ 
    int Rear=-1;
    int size=100;
    int Front=-1;
    int arr[]=new int[size];

    void enqueue(int x)
    {
        if(Rear==size-1)
        {
            System.out.println("underflow");
        }
        else
        {
            if(Front==-1)
            {
            Front=0;
            }
            Rear=Rear+1;
            arr[Rear]=x;
            System.out.println("element to be inserted to the queue:"+x);
            
        }
    }
    void dequeue()
    {
        if(Front==-1)
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element deleted from the queue:"+arr[Front]);
            Front=Front+1;
    
        }
    }
    void show()
    {
        int i;
        if(Front==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element present in the queue:");
            for(i=Front;i<=Rear;i++)
                 System.out.println(arr[i]); 
       }
    }
    public static void main(String args[])
    {
        Queue call=new Queue();
        call.enqueue(13);
        call.enqueue(25);
        call.enqueue(75);
        call.dequeue();
        call.show();
    }
}
