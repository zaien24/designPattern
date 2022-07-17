package logwriter.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {

	private static LogWriter singleton = new LogWriter();
	private static BufferedWriter bw;
	
	private LogWriter() {
		try {
			bw = new BufferedWriter(new FileWriter("log.txt"));
		} catch (Exception e) {}
	}
	
	public static LogWriter getInstance() {
		return singleton;
	}
	
	public synchronized void log(String str) {
		try {
			// 현재 날짜와 시각 추가
			// bw.write(LocalDateTime.now() + ":" + str + "\n");
			bw.write(str + "\n");
			bw.flush();
		} catch (Exception e) {
			
		}
		
	}
	
	@Override
	protected void finalize () {
		try {
			super.finalize();
			bw.close();
		} catch (Throwable ex) {} 
	}

}
