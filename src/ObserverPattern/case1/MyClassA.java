package case1;

import java.util.Observable;
import java.util.Observer;

public class MyClassA implements Observer {

    Observable observable;	// 등록될 Observable
    private boolean bPlay;	// 실행 여부

    public MyClassA(Observable o) { 
        this.observable = o;
        observable.addObserver(this);	// 옵저버에 현재 클래스를 등록
    }

	@Override
	public void update(Observable o, Object arg) {
        if (o instanceof PlayController) {
            PlayController myControl = (PlayController)o;
            this.bPlay = myControl.getFlag();
            myActControl();
        }
	}

    public void myActControl() {
    	if (bPlay) {
            System.out.println("MyClassA : 동작을 시작합니다.");
    	} else {
            System.out.println("MyClassA : 동작을 정지합니다.");
    	}
    }
}
