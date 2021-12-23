package com.javaexamfinal;

public class TV {
	
	protected String model;
	protected int size;
	protected int channel;
	
	public TV() {		
	}

	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void channelUP() {
		channel++;
		channel = (channel>10) ? 1 : channel;
	}
	
	public void channelDown() {
		channel--;
		channel = (channel<1) ? 10 : channel;
	}
	
	
	

}
