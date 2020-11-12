public class Question1
{
     public static void main(String[] args)
     {
        Thread t = new Thread()
        {
            public void run()
            {
                for(int variable=0 ; variable<101 ; variable++)
                {
                    System.out.print(variable);
                    System.out.print(" ");
                    if (x % 10 == 0)
                    {   
                        System.out.println();
                        System.out.println("10 second message");
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t.start();
    }
}
