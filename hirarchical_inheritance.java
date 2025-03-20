class a
{
void aprint()
{
System.out.println("class a");
}
}
class b extends a
{
void bprint()
{
System.out.println("class b");
}
}
class c extends a
{
void cprint()
{
System.out.println("class c");
}
}
class abc 
{
public static void main(String [] args)
{
abc p=new abc();
p.bprint();
p.cprint();
c h=new c();
h.bprint();
h.cprint();
}
}

