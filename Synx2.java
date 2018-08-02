import java.util.*;

class Threads extends Thread
{
//Synx sx;
List<String> arl;
int lim;
Threads(List<String> arl,int lim)
{
	
//this.sx=sx;
this.arl=arl;

this.lim=lim;
}

public void run()
{
	synchronized(arl)
{
for(int i=1;i<lim;i++)
{
arl.add(i+" ");
}
}
}
}

class Synx2
{
public static void main(String ard[])
{
List<String> arl=new ArrayList<>();
arl.add("hi");
arl.add("hello");
arl.add("bye");
arl.add("kai");
arl.add("ek");
arl.add("do");
arl.add("teen");
arl.add("char");
arl.add("paanch");
System.out.print(arl+"\n");
Synx2 s=new Synx2();

Threads t=new Threads(arl,3);
Threads t2=new Threads(arl,5);
t.start();
System.out.println(arl);
t2.start();
System.out.println(arl);
System.out.print("\n");
/*try{
t.join();
t2.join();
}
catch(InterruptedException ie)
{}*/
System.out.print(arl);
}
}
