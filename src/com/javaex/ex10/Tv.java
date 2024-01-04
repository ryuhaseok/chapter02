package com.javaex.ex10;

public class Tv {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public Tv() {
		
	}
	
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드-gs
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean getPower() {
		return power;
	}

	//메소드-일반
	public void power(boolean on) {
		this.power = on;
		if (on == false) {
			this.channel = 7;
			this.volume = 20;
		}
	}
	
	public void channel(int channel) {
		if (channel>0 && channel<256) {
			this.channel = channel;
		} else if(channel == 0) {
			this.channel = 1;
		} else if (channel>255) {
			this.channel = 255;
		}
	}
	
	public void channel(boolean up) {
		if (channel>0 && channel<256) {
			if (up == true) {
				this.channel = this.channel+1;
			} else {
				this.channel = this.channel-1;
			}
		}
	}
	
	public void volume(int volume) {
		if (volume>=0 && volume<101) {
			this.volume = volume;
		} else if(volume>100) {
			this.volume = 100;
		}
	}
	
	public void volume(boolean up) {
		if (volume>=0 && volume<101) {
			if (up == true ) {
				this.volume = this.volume+1;
			} else {
				this.volume = this.volume-1;
			}
		}
	}
	
	public void status() {
		System.out.println("파워:" + this.power + " 채널:" + this.channel + " 볼륨:" + this.volume);
	}
	
}
