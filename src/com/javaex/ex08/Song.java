package com.javaex.ex08;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private int year;
	private int track;
	
	
	//생성자 기본, 5개짜리, 6개(5개를 사용해서)
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		System.out.println("Song(title, artist, album, year)");
	}
	
	public Song(String title, String artist, String album, int year, int track) {
		this(title, artist, album, year);
		this.track = track;
		System.out.println("Song(title, artist, album, year, track)");
	}
	
	//메소드-gs
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlum() {
		return album;
	}
	public void setAlum(String alum) {
		this.album = alum;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드-일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + ", track=" + track
				+ "]";
	}
	
	
}
