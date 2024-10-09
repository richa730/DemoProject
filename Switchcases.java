public class Switchcases {

    public static void main (String [] args)
    {
        cases(1);
        Condition cd = new Condition();
        cd.ifelsecond(2);
    }

    public static void cases(int n)
    {
       switch(n)
       {
        case 1:
            System.out.println("Today is Monday");
            break;
           case 2:
               System.out.println("Today is Monday");
               break;

           default:
               System.out.println("Incorrect number is given");;


       }


    }
}




