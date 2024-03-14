import java.io.*;

class Search1{
    public static void main (String args[]){
        DataInputStream din = new DataInputStream(System.in);

        int [] arr ={10,20,30,40,50};
        int num;
        boolean found=false;
        try {
            System.out.println("Enter the number:");
            num=Integer.parseInt(din.readLine());

            for(int i=0; i<arr.length;i++){
                if(arr[i]==num){
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Element found");
            }
            else{
            System.out.println("Element not Found");
            }
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
        

    }

}