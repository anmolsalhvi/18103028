public class Main {

    public static void main(String[] args) {
        int front=0;
        int[] array=new int[20];
        for(int i=1;i<Integer.MAX_VALUE;i++)
        {
            int sum=0;
            for(int j=1;j<=i;j++)
            {
                sum+=j;
            }
            if(sum==i)
            {
                array[front]=i;
                front++;
            }
        }
        System.out.println("All such values of i's are :: ");
        for(int i=0;i<front;i++) System.out.println(array[i]);
    }
}
