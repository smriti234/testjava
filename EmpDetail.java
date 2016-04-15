package employeedetail;


public class EmpDetail
{
	public static int emp_no;
	public static String empname;
	public static String designation;

	public void showdata()
	{

		System.out.println("employee no---->"+emp_no);
		System.out.println("employee name--------->"+empname);
		System.out.println("employee desgination--------->"+designation);

	}
}
class salary extends EmpDetail{
	public static  float bsal,hr,da,tsal;
	public void cal()
	{
		tsal=bsal+hr+da;
		System.out.println("total salary------>"+tsal);
	}
}

class empsal extends salary{
	public void calc(){
		if (bsal >=15000)
		{
			hr=0.3f*bsal;
			da=0.2f*bsal;
		}
		else if (bsal >=10000)
		{
			hr=0.4f*bsal;
			da=0.3f*bsal;
		}
		else	
			hr=0.3f*bsal+500;
		    da=0.2f*bsal+500;
	}


	public static void main(String[]args)
	{
		empsal E=new empsal();
		emp_no=Integer.parseInt(args[0]);
		empname=args[1];
		designation=args[2];
		bsal=Integer.parseInt(args[3]);
		E.showdata();
		System.out.println("employee salary");
		E.calc();
		E.calc();
	}

}