public class Forloop {
    public static void main (String [] args)
    {
        forlooptest(6);
    }
    public static void forlooptest(int i)
    {
        for (i=1; i<=7; i++)
        {
            System.out.println("Day" +i);
            for (int j=9; j<=15; j++) {
                System.out.println(" " +j + "-" + (j+1));
            }
        }//How a for loop works: initialize (set an initial value), check for condition, increment or decrement

    }
}
