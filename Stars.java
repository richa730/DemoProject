public class Stars {
    public static void main (String [] args){
      //  square1(5, 5);
       // triangle90();
       // inverted90();
      //  righttriangle90();
       // invertrighttriangle90();

    }
    public static void square1(int i, int j){
        for (i=0; i<=4; i++)
        {
            for(j=0; j<=4; j++){
            System.out.print("*  ");
            }
            System.out.println();
        }
    }
    public static void triangle90(){
        for (int i=0; i<=4; i++)
        {
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted90(){
        for (int i=0; i<=4; i++)
        {
            for(int j=i; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void righttriangle90(){
        for (int i=0; i<=4; i++)
        {
            for(int j=i; j<=4; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++)
            {
            System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void invertrighttriangle90(){
        for (int i=0; i<=4; i++)
        {
            for(int j=0; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
