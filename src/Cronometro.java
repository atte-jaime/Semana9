import processing.core.PApplet;

public class Cronometro extends Thread {
	private PApplet app;
	private int millis;
	private int sec;
	private int min;
	private boolean corriendo;
	private int vel = 1;

	public Cronometro(PApplet app) {
		this.app = app;
	}

	public void run() {

		while (true) {
			if (corriendo) {

				millis++;

				if (millis / 1000 == 1) {
					sec += 1;
					millis = 0;
				} else

				if (sec / 60 == 1) {
					min += 1;
					sec = 0;
				}
			}
			try {
				Thread.sleep(vel);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void pintar() {
		app.fill(255);
		app.text("Milis: "+millis, 50 + (2 * 50), 50);
		app.text("Sec: "+sec, 50 + (1 * 50), 50);
		app.text("Min: "+min, 50 + (0 * 50), 50);
	}

	public int getMillis() {
		return millis;
	}

	public int getSec() {
		return sec;
	}

	public int getMin() {
		return min;
	}

	public boolean isCorriendo() {
		return corriendo;
	}

	public int getVel() {
		return vel;
	}

	public void setMillis(int millis) {
		this.millis = millis;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setCorriendo(boolean corriendo) {
		this.corriendo = corriendo;
	}

	public void setVel(int v) {
		this.vel += v;
	}

}
