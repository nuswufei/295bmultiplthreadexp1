package multiplethreadtest;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class LinkedbindingModule1  extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides
	Moviefinder1 provideMovieFinder() {
		return new MoviefinderImpl1();
	}
}
