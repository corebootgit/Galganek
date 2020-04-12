package com.chorsstudio.galganek;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;

import screens.SplasScreen;

public class GalganekGame extends Game {

	public final static String GAME_NAME = "Galganek";
	public final static int  WIDTH = 1024;
	public final static int  HEIGHT = 2048;

	private boolean pause;

	
	@Override
	public void create () {
		this.setScreen(new SplasScreen(this));
	}


	/**
	 * -------------------
	 * getters & setters
	 *
	 */

	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}
}
