package diamondProblem;

public class DiamonProblem implements First,Second
{
	public void show() 
	{
		First.super.show();
		Second.super.show();
	}

	public static void main(String[] args)
	{
		DiamonProblem obj=new DiamonProblem();
		obj.show();
	}

}
