package test.ch06;

public class Earth {
	static final double EARTH_RADIUS = 6400; //지구 둘레
	static final double EARTH_SURFACE_AREA; 
	//static필드 초기화 해줄떄 사용
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	}
}
