package _24_interface;

public abstract interface Press {
    String NAME = "butten";
    //객체 생성불가, 생성자 X
    //변수는 Public static final(상수) 만 가능

    abstract void onPressed();
}
