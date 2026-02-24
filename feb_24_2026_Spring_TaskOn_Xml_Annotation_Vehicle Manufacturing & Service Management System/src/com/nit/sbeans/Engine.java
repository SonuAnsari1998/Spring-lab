package com.nit.sbeans;

public class Engine {
	String engineType;
	int horsePower;

	public Engine(String engineType, int horsePower) {
		super();
		this.engineType = engineType;
		this.horsePower = horsePower;
	}
	
	public String  showEngineDetails() {
		return "Engine Details :"+
				"\nEngine Type: "+this.engineType+
				"\nHorse Power: "+this.horsePower;
	}

}
