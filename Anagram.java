class Anagram
{
    public static void main(String args[])
    {
        if(args.length != 2){
            System.out.println("ERROR::Too Few Arguments");
            System.out.println("i.e. java Anagram <String1> <String2>");
            System.out.println("<String1> = Enter String 1");
            System.out.println("<String2> = Enter String 2");
            System.exit(0);
        }
        int[] Sting1 = new int[127];
        int[] Sting2 = new int[127];
        int flag = 0;
        String first = args[0];
        int fLength = first.length();
        String second = args[1];
        int sLength = second.length();
        for(int i = 0; i < fLength; i++)
        {
            Sting1[first.codePointAt(i)]++;
        }
        for(int i = 0; i < sLength; i++)
        {
            Sting2[second.codePointAt(i)]++;
        }
        int stringLength = Sting1.length;
        for(int i = 0; i < stringLength; i++)
        {
            if(Sting1[i] == Sting2[i])
            {
                flag = 1;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Anagram String");
        }
        else
        {
            System.out.println("Not Anagram String");
        }
    }   
}