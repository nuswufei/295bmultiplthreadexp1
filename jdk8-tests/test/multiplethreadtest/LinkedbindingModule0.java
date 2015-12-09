package multiplethreadtest;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class LinkedbindingModule0  extends AbstractModule {
	@Override
	protected void configure() {}
	@Provides
	Moviefinder0 provideMovieFinder() {
		return new MoviefinderImpl0();
	}
}
