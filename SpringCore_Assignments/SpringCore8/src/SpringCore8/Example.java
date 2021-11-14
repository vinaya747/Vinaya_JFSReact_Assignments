package SpringCore8;




public class Example {
private String Subject;

public String getSubject() {
	return Subject;
}

public void setSubject(String subject) {
	Subject = subject;
}

public Example() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Example [Subject=" + Subject + "]";
}

public void start()
{
	System.out.println("Starting method of the example ");

}

public void end()
{
	System.out.println("Ending method of the example");
}
}