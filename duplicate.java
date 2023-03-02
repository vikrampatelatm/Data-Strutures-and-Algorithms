public class duplicate
{    
     public static boolean check(int a)
        {
            for(int i=0;i<a.length;i++)
            {
             for(int j=i;j<a.length-1;j++)
              {
                if(a[j]==a[i])
                {
                    System.out.println("true");
                    return;
                }
              }
              }
            System.out.println("false");
        }
    public static void main(String []args )
    {
        int a[]={1,2,3,4,1};
        check(a);
        
    }
}