package tv;

import tv04.Tv;

public class SmartTv extends Tv{
	void search(String str) {
		System.out.println("인터넷에 " + str + "을 검색합니다");
	}
	void netflix(String name) {
		System.out.println("영화 " + name + "을 재생합니다");
	}
}
