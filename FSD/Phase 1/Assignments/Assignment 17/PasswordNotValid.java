package exceptionHandling;

public class PasswordNotValid extends Exception
{
private String msg;
	
	public PasswordNotValid(String msg) 
	{
		
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "PasswordNotValid [message=" + msg + "]";
	}

}
