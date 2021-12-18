package com.javaex.oop.TV;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
	
	void power( boolean on ) {
		 if(on) {
			 power = true;
		 }
		 else {
			 power=  false;
		 }
	 }
	 
	 void channel( int channel ) {
		 if(channel>=1 && channel<=255) {
			 this.channel = channel; 
		 }	 
	 }
	 
	 void channel( boolean up ) {
		 if(up) {
			 if(channel<255) {
				 channel+=1;
			 }
		 }
		 else {
			 if(channel>1) {
				 channel-=1;
			 }
		 }
	 }
	 
	 void volume( int volume ) {
		 if(volume>=0 && volume<=100) {
			 this.volume = volume;
		 }
		 else {
			 this.volume=100;
		 }
	 }
	 
	 void volume( boolean up ) {
		 if(up) {
			 if(volume<100) {
				 volume+=1;
			 }
		 }
		 else {
			 if(volume>0) {
				 volume-=1;
			 }
		 }
	 }
	 
	 void status() {
		 if(power) {
			 System.out.println("현재 TV는 켜져 있습니다.");
			 System.out.printf("TV 채널 : %d, TV 볼륨 : %d%n",channel,volume);
		 }
		 else {
			 System.out.println("현재 TV는 꺼져 있습니다.");
		 }
	 }
	 
	

}
