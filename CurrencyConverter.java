class CurrencyConverter
{
    public static void main(String args[])
    {
        if(args.length!=2)
		{
            System.out.println("ERROR:::TOO FEW ARGUMENT");
            System.out.println("i.e. java CurrencyConverter <currencyType> <Value>");
            System.out.println("<currencyTypeType> - \n1. USD2INR \n2. INR2USD");
            System.out.println("<Value> - Value you want to convert");
            System.exit(0);
        }
        int currencyType = Integer.parseInt(args[0]);
        double Value = Double.parseDouble(args[1]);
        double rate = 70;
        if(currencyType == 1)
		{
            System.out.println("$"+ Value +" = "+(Value*rate)+"INR");            
        }
        else
		{
            System.out.println(Value +"INR = $"+(Value/rate));
        }
    }
}