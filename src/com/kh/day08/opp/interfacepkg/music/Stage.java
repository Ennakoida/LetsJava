package com.kh.day08.opp.interfacepkg.music;

public class Stage {
	public static void main(String[] args) {
		Musician ms = new Musician();
		ms.play(new Drum());
		ms.play(new Guitar());
		ms.play(new Piano());
	}
}
