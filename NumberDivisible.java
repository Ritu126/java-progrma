class NumberDivisible{
    public static void main(String args[]){
        if(args.length!=3){
            System.out.println("Error::Too Few Arguments");
            System.out.println("i.e.NumberDivisible  <n1> <n2> <divisibleNumber>");
            System.out.println("<n1> - starting range");
            System.out.println("<n2> - ending eange");
            System.out.println("<divisibleNumber> - a number by which you want to check");
            System.exit(0);
        }
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        for(int i = n1; i <= n2; i++)
        {
            if(i % n == 0)
                System.out.println(i);
        }
    }
}