import java.io.*;
/**
 * QueueP
 */
public class QueueP {

    int[] arr;
    int front, rear, capacity;

    public QueueP(){
        DataInputStream din = new DataInputStream(System.in);
        try {
            System.out.println("Enter the Capacity od the Queue: ");
            capacity=Integer.parseInt(din.readLine());
            arr = new int[capacity];
            front = -1;
            rear = -1;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return rear == capacity-1;
    }
    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;            
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = data;
        System.out.println(data +"Enqueued to queue");
    }
    public int  dequeue(){
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        arr[front] = 0;
        if (front == rear) {
            front = rear = -1;
        }else{
            front++;
        }
        return data;
    }
    public void display(){
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements: ");
        for (int i = front; i <= rear; i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String []args){
        QueueP que= new QueueP();
        int choice;
        DataInputStream din = new DataInputStream(System.in);
        try {
            do {
                System.out.println("\nQueue Operation:");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Display");
                System.out.println("4. Exit");
                System.out.println("Enter your Choive:  ");
                choice = Integer.parseInt(din.readLine());

                switch (choice) {
                    case 1:
                        System.out.println("Enter data to Enqueue: ");
                        int data = Integer.parseInt(din.readLine());
                        que.enqueue(data);
                        break;
                    case 2:
                        System.out.println("Dequeued Element: "+ que.dequeue());
                        break;
                    case 3:
                        que.display();
                        break;
                    case 4:
                        System.out.println("Existing...");
                        break;
                    default:
                        System.out.println("Invalid!, Try again :( ");
                        break;
                }
            } while (choice!=4);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}