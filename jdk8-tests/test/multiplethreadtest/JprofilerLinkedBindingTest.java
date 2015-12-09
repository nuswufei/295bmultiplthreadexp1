package multiplethreadtest;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class JprofilerLinkedBindingTest {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		for(int i = 0; i < 1; ++i) {
		    Injector injector = Guice.createInjector(new LinkedbindingModule0(),
		    		new LinkedbindingModule1(),
		    new LinkedbindingModule2(),
		    new LinkedbindingModule3());
		}
		System.out.println(System.currentTimeMillis() - time);
	}
}
