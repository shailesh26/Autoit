import java.io.File;
import java.util.concurrent.TimeUnit;
import autoitx4java.AutoItX;
import com.jacob.com.LibraryLoader;

public class sam {
	
	public static void main(String[] args) throws InterruptedException
	{
	String jacobDllVersionToUse;
	if(System.getProperty("sun.arch.data.model").contains("32"))
	{
		System.out.println("i am 32 bit");
	jacobDllVersionToUse = "jacob-1.19-x86.dll";
	}
	else {
		System.out.println("i am 64 bit");
	jacobDllVersionToUse = "jacob-1.19-x64.dll";
	}
	 
	File file = new File("lib", jacobDllVersionToUse);
	System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
	 

	 
	AutoItX x = new AutoItX();
	x.run("calc.exe");
	x.winActivate("Calculator");
	x.winWaitActive("Calculator");
	//Enter 3
	x.controlClick("Calculator", "", "133") ;
	Thread.sleep(1000);
	//Enter +
	x.controlClick("Calculator", "", "93") ;
	Thread.sleep(1000);
	//Enter 3
	x.controlClick("Calculator", "", "133") ;
	Thread.sleep(1000);
	//Enter =
	x.controlClick("Calculator", "", "121") ;
	 
	}
}

