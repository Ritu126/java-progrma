class BasicCalculator
{
    public static void main(String args[])
    {
        if(args.length!=3)
        {
           System.out.println("ERROR::Too Few Arguments");
           System.out.println("i.e. java BasicCalculator  <Operation> <value 1>  <value 2>");
           System.out.println("<operation> 1.Addition 2.Substraction 3.Multiplication 4.division");
		   System.out.println("<value 1> <value 2> values on which operation is to be performed.");
           System.exit(0);
        }           
        int choice = Integer.parseInt(args[0]);
		int value1 = Integer.parseInt(args[1]);
        int value2 = Integer.parseInt(args[2]);
        double result = 0;
        switch(choice)
        {
            case 1:  System.out.println("Addition is " + (value1 + value2));
                      break;
            case 2:  System.out.println("Subtraction is " + (value1 - value2));
                      break;
            case 3:  System.out.println("Multiplication is " + (value1 * value2));
                      break;
            case 4:  System.out.println("division is  " + (value1 / value2));
                      break;
            default: System.out.println("Invalid Choice!");
        }
        
    }
}