class move_hyphen {
    public static void main(String aegs[])
    {
        char str[]="code-4-lyf".toCharArray();
        int i=str.length-1;
        for(int j=i;j>=0;j--)
        {
            if(str[j]!='-') str[i--]=str[j];
        }
        while(i>=0) str[i--]='-';
        System.out.println(String.valueOf(str));
    }
    
}