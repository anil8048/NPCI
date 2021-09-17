public class MyClass {
    public static void main(String args[]) {
        CircularQueue cq =new CircularQueue(5);
        cq.enQueue(5);
        cq.enQueue(7);
        cq.enqueue(9);
        cq.displayQueue();
        cq.deQueue(); 
     
    }
}
public class CircularQueue
{
    int size;
    int arr[];
    int front,rear;
    CircularQueue(int size)
    {
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
        }
        else if(front==-1)
        {
            front=0;
            rear=0;
            arr[rear]=value;
        }
        else if(rear==size-1&& front!=0)
        {
            rear=0;
            arr[rear]=value;
        }
        else
        {
            rear++;
            arr[rear]=value;
        }
        
    }
    int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else if(front==rear)
        {
            front= rear=-1;
        }
        else if(front ==size-1)
        {
            front=0;
        }
        int data=arr[front];
        front++;
        return data;
    }
    void displayQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        if(rear>=front)
        {
            for(int i=front;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            for(int i=0;i<=front;i++)
            {
                System.out.println(arr[i]);
            }
            for(int i=0;i<=rear;i++)
            {
                System.out.println(arr[i]);
            }
            
        }
    }
    boolean isFull()
    {
        return ((rear==size-1&& front==0)||(rear==front-1));
       
    }
    boolean isEmpty()
    {
        return (front==-1);
    }
    
}
