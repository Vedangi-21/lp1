
import java.util.Scanner;
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    int x,n,p[],pp[],w[],t[],awt,ata,bt[];
    p=new int[10];
    pp=new int[10];
    bt=new int[10];
    w=new int[10];
    t=new int[10];

    System.out.print("Enter Number of Process: ");
    n=sc.nextInt();
    
    for(int i=0;i<n;i++)
    {
        System.out.print("\nProcess["+(i+1)+"]:");
        System.out.print("\n\tEnter burst time : ");
        bt[i]=sc.nextInt();
        System.out.print("\n\tEnter time priority: ");
        pp[i]=sc.nextInt();
        p[i]=i+1;
    }
    
    for(int i=0;i<n-1;i++)
    {
        for (int j=0;j<n;j++)
        {
        if(pp[i] > pp[j])
            {
                x=pp[i];
                pp[i]=pp[j];
                pp[j]=x;

                x=bt[i];
                bt[i]=bt[j];
                bt[j]=x;

                x=p[i];
                p[i]=p[j];
                p[j]=x;
            }
        }
    }

    w[0]=0;
    awt=0;
    t[0]=bt[0];
    ata=t[0];

    for(int i=1;i<n;i++)
    {
        w[i]=t[i-1];
        awt+=w[i];
        t[i]=w[i]+bt[i];
        ata+=t[i];
    }

    System.out.print("\nProcess\t**  Burst time\tWaiting Time\tTurn Around Time\tPriority\n");

    for(int i=0;i<n;i++)
    {
        System.out.println("========================================================================");
        System.out.print(" "+p[i]+"\t\t"+bt[i]+"\t\t"+w[i]+"\t\t"+t[i]+"\t\t"+pp[i]+"\n");
    }

    awt/=n;
    ata/=n;
    System.out.print("\nAverage wait time: "+awt+" \nAverage Turn Around Time: "+ata+"\n");

    sc.close();
}
    