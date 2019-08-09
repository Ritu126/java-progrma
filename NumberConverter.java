class NumberConverter
{
    public static void main(String args[])
    {
         if(args.length != 2){
            System.out.println("ERROR::Too Few Arguments");
            System.out.println("i.e. java NumberConverter <choice> <Number>");
            System.out.println("<choice> = 1. Decimal2Binary \n2. Binary2Decimal");
            System.out.println("<number> = 1. Decimal number \n2. Binary number");
            System.exit(0);
        }
        int choice = Integer.parseInt(args[0]);
        int number = Integer.parseInt(args[1]);
		 int flag = 1;
        
        int[] bNumber = new int[50];
        int i=0;
        if(choice == 1)
        {
            while(number > 0)
            {
                bNumber[i] = number % 2;
                number = number / 2;
                i++;
            }
            for (int j = i - 1; j >= 0; j--) 
            System.out.print(bNumber[j]);
        }
        else if(choice == 2)
        {
			
                double decimal = 0;
                while(number!= 0)
                {
                    int reminder = number % 10;
                    number = number / 10;
                    if(reminder == 0 || reminder == 1)
                    {
                        decimal = decimal + (reminder * Math.pow(2, i));
                        i++;
                        flag = 1;
                    }  
                    else 
                    {
                        System.out.println(" Invalid  number: ");
                        System.out.println("Binary number can contains 0's and 1's");
                        flag = 0;
                    }
                }
                if(flag == 1)
                {
                    System.out.println(decimal);
                }
        }
        else 
        {
            System.out.println("Invalid");
        }
    }
}