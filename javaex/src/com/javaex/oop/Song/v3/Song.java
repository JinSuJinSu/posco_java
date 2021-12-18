package com.javaex.oop.Song.v3;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
//	// 생성자1
//	public Goods(String name) {
//		this.name = name;
//	}
//	
//	// 생성자2
//	public Goods(String name, int price) {
//		this(name); // 다른 생성자 호출
//		this.price = price;
//	}
	
	// 초기 생성자
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	
	// 생성자 만들기
	public Song(String artist, String title, String albunm, 
			int year, int track, String composer) {
		this(artist,title);
		this.album = albunm;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
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
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d번 track, %s 작곡)%n",getArtist(),getTitle(),
				getAlbum(),getYear(),getTrack(),getComposer());
	}
	
	
	

}
