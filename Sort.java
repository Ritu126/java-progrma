class Sort
{
    public static void main(String args[])
    {   
	
	
		if(args.length==0)
        {
           System.out.println("ERROR::Too Few Arguments");
           System.out.println("i.e. java sort  <value 1>  <value 2>.........<value n>");
		   System.out.println("<value 1> <value 2> values on which you want to perform sorting.");
           System.exit(0);
        }      
        int[] numbers = new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
            numbers[i] = Integer.parseInt(args[i]); 
        }
        for(int i = 0; i < args.length; i++)
        {
            for(int j = 0; j < args.length; j++)
            {
                if(numbers[i] < numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}