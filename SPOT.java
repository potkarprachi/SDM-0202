import java.util.*;

public class SPOT
{
    public static void main(String[]args)
    {   Scanner sc= new Scanner();
        int[]a1={10,20,30,40,50};
        int key=40;
        System.out.println("1.for Linear search      2.binary Search");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            for(int i=0;i<a1.length;i++)
        {
            if(a1[i]==key)
            {
                System.out.println("found key on index "+i);
            }
        }   
        break;
        case 2:
        int last= a1.length-1;
    int first=0;
    int mid=(0+last)/2;
    while(first<=last)
    {
        if(a1[mid]<key)
        {
            first=mid+1;
        }

        else if(a1[mid]==key)
        {
            System.out.println("found");
            break;
        }
        else
        {
            last=mid-1;
        }
        mid=(first+last)/2;
    }



        }
        
    }
}