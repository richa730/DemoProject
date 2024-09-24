public class Dowhileloop {
    public static void main (String [] args)
    {
        loops(100);
    }

    public static void loops(int i) 

    {
         do{
            System.out.println("Hi" + i);
            i++;
        }
        while (i<=45);
    }//when condition is false and we want output atleast once then we use do while loop.
}
