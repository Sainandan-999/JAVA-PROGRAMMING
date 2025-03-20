class employee{
float salary=40000;
}
class programmer extends employee{
int bonus=1000;
public static void main(String[] args)
{
programmer p=new programmer();
System.out.println("programmer salary is :"+p.salary);
System.out.println("bonus of programmer is:"+p.bonus);
}
}