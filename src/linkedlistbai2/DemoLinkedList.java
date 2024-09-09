
package linkedlistbai2;

public class DemoLinkedList {
    private static Node head;
    
    private static int length(Node head){
        int cnt = 0;
        while(head != null){
            cnt ++;
            head = head.next;
        }
        return cnt;
    }
    
    private static void display(Node head){
        while(head != null){
            System.out.print(" " + head.data);
            head = head.next;
        }
        System.out.println("");
    }
    
    private static void sort(Node head){
        Node i, j;
        for(i = head; i != null; i = i.next){
            for(j = i.next; j != null ; j = j.next){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }
    
    public static void deletePosition(Node head, int value){
        if(value == head.data){
            head = head.next;
        } else {
            Node temp = head;
            while (temp.next != null){
                if(temp.next.data == value){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }        
        }
    }
    
    public static void main(String[] args) {
        Node n9 = new Node(9);
        Node n3 = new Node (3);
        Node n5 = new Node (5);
        head = new Node (7);
        head.next = n9;
        n9.next = n3;
        n3.next = n5;
        
        //1. length
        System.out.println("Length: " + length(head));
        
        //2. display
        System.out.print("Display:");
        display(head);
        
        //3. xoa node sau node head
        System.out.print("Xoa node sau node head:");
        head.next = head.next.next;
        display(head);
        
        //4. them node gtri 10 vao sau head
        System.out.print("Them node gtri 10 vao sau head:");
        Node n10 = new Node (10);
        n10.next = head.next;
        head.next = n10;
        display(head);
        
        //5. tim node gia tri 3 va xoa di
        System.out.print("Tim node gia tri 3 va xoa di:");
        deletePosition(head, 3);
        display(head);
        
        //6. sap xep gia tri
        System.out.print("Sort:");
        sort(head);
        display(head);
    }
    
}
