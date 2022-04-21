public class linkedlist {
       Node head;
       class Node{
                int data;
                Node next;
                Node(int value){
                    data=value;
                    next=null;
                }
       } 
       linkedlist()
       {
            head=null;
       }
        public  void insertAtBegining(int value)
       {
          Node newnode=new Node(value);
          if(head==null)
          {
             head=newnode;   
         }
         else{
             newnode.next=head;
             head=newnode;
         }
      }
      public  void display(){
          Node temp=head;
          while(temp!=null)
          {
            System.out.println(temp.data+" ");
          temp=temp.next;
          }
      }
     public  void insertAtPos(int position,int value)
      {
          if(position==0)
          {
                insertAtBegining(value);
                return;
          }
            Node newNode=new Node(value);
            Node temp=head;
            for(int i=1;i<=position-1;i++)
            {
                temp=temp.next;
                if(temp==null){
                   throw new IndexOutOfBoundsException("invalid position"+""+position);
                }
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public void deleteAtPos(int position)
       {
           if(head==null){
               throw new IndexOutOfBoundsException("Deletion attempted on empty list");
           }
           if(position==0)
           {
               head=head.next;
               return;
           }
           Node temp=head;
           Node prev=null;
           for(int i=1;i<=position;i++){
               prev= temp;
               temp=temp.next;
           }
           prev.next=temp.next;
       }
       public void insertAtEnd(int value){
           Node newnode=new Node(value);
           Node temp=head;
           while(temp.next!=null)
           {
               temp=temp.next;
           }
           temp.next=newnode;
           newnode.next=null;
       }
       public static void main(String args[])
       {
           linkedlist call=new linkedlist();
           call.insertAtBegining(7);
           call.insertAtBegining(9);
           call.insertAtBegining(4);
           call.display();
            System.out.println("");
           call.insertAtPos(1,3);
           call.display();
           System.out.println("");
           call.deleteAtPos(0);
           call.display();
           System.out.println("");
          call.insertAtEnd(5);
           call.display();
       }
}
