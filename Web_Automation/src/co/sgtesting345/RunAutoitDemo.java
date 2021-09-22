package co.sgtesting345;

public class RunAutoitDemo {

	public static void main(String[] args) {
		try
		{
			//Runtime.getRuntime().exe("E:\\ExampleAutomation\\AutoIT\\ExamplesTest1.exe")
			Runtime obj=Runtime.getRuntime();
			obj.exec("E:\\ExampleAutomation\\AutoIT\\ExampleTest1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
