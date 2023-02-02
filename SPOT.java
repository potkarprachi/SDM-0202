
public class SPOT
{
    public static void main(String[]args)
    {
        int[]a1={1,8,7,3,4,5};
        int key=3;
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i]==key)
            {
                System.out.println("found key on index "+i);
            }
        }
    }
}