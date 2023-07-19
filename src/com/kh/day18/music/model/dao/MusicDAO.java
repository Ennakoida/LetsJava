package com.kh.day18.music.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.kh.day18.music.model.vo.Music;

public class MusicDAO {
	private List<Music> musicList;
	
	public MusicDAO() {
		musicList = new ArrayList<Music>();
	}
	
	public void addMusic(Music music) {
		musicList.add(music);
	}
	
	public List<Music> allMusicInfo() {
		return musicList;
	}

	public List<Music> findListBySinger(String singer) {
		List<Music> findList = new ArrayList<Music>();
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				findList.add(music);
			}
		}
		return findList;
	}

	public int findIndexBySinger(String singer) {
		int count = 0;
		for(Music music : musicList) {
			if(music.getSinger().equals(singer)) {
				return count;
			}
			count += 1;
		}
		return -1;
	}

	public void deleteMusic(int index) {
		musicList.remove(index);
	}

	public Music findMusicBySinger(String singer) {
		for(Music music : musicList) {
			if(music.getSinger().equals(singer))
				return music;
		}
		return null;
	}

	public void updateMusic(int index, Music music) {
		musicList.set(index, music);
	}
}
