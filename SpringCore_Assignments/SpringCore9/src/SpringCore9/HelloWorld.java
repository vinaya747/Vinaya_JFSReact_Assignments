package SpringCore9;


public class HelloWorld {

	
	public void init()
	{
		System.out.println(
			"Bean HelloWorld has been "
			+ "instantiated and I'm "
			+ "the init() method");
	}

	
	public void destroy() {
		System.out.println(
			"Container has been closed "
			+ "and I'm the destroy() method");
	}
}