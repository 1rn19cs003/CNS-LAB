import java.util.*;
public class LB {
    public static void main(String[] args)
    {
        System.out.println("Enter the number of time intervals");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t[]=new int[n];
        System.out.println("Enter the time intervals");
        for(int i=0;i<n;i++)
        {
            t[i]=s.nextInt();
        }
        System.out.println("Enter i and l");
        int i=s.nextInt();
        int l=s.nextInt();
        int lct=t[0];
        int x=0,y=0;
        for(int j=0;j<n;j++)
        {
            y=x-(t[j]-lct);
            if(y>l) 
                System.out.println("non-conforming packet: "+t[j]);
            else
            {
                x=y+i;
                lct=t[j];
                System.out.println("conforming packet:     "+t[j]);
            }
        }
    }
}