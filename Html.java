class Html
{
    public static void main(String args[])
    {
        if(args.length != 1){
            System.out.println("ERROR::Too Few Arguments");
            System.out.println("i.e. java Html <Html_Tag>");
            System.exit(0);
        }
        String html = args[0];
        int flag = 1;
        for(int i = 0; i < html.length(); i++)
        {
            if(html.charAt(i) == '<')
            {
                flag = 0;
            }
            else if(html.charAt(i) == '>')
            {
                flag = 1;
            }
            else if(flag == 1)
            {
                System.out.print(html.charAt(i));
            }
        }
    }
}