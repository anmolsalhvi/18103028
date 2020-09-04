public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long long n=scanner.nextInt();
		int flag=1;
        while(n!=1)
        {
            System.out.println(n);
            if(n%2==0) n/=2;
            else n=n*3+1;
			if(n>int.MAX_VALUE) {System.out.println("Overflow"); flag=0; break;}
        }
        if(flag) System.out.println(n);
    }
}
