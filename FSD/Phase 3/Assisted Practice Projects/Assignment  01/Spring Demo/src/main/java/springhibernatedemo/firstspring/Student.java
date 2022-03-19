package springhibernatedemo.firstspring;

public class Student 
{
	private int id;
	private String name;
	private Marks mark;
	
	public Marks getMark() {
		return mark;
	}
	public void setMark(Marks mark) {
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
