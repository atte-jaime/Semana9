import processing.core.PApplet;

public class Logica {

	private PApplet app;
	private Cronometro c;

	public Logica(PApplet app) {
		this.app = app;
		c = new Cronometro(app);
		c.start();
	}

	public void pintar() {
		c.pintar();
		app.noStroke();
		app.fill(0, 255, 200, 200);
		app.ellipse(50, 75, 25, 25);
		app.fill(255, 0, 0, 200);
		app.ellipse(100, 75, 25, 25);
		app.fill(100, 0, 100, 200);
		app.ellipse(150, 75, 25, 25);
		app.fill(255, 0, 255, 200);
		app.ellipse(200, 75, 25, 25);

	}

	public void pressed() {
		// System.out.println("millis: " + c.getMillis());
		// System.out.println("sec: " + c.getSec());
		// System.out.println("min: " + c.getMin());
		System.out.println("corriendo?: " + c.isCorriendo());
		System.out.println("vel: " + c.getVel());

		if (PApplet.dist(app.mouseX, app.mouseY, 50, 75) < 12) {
			c.setCorriendo(true);
		}

		if (PApplet.dist(app.mouseX, app.mouseY, 100, 75) < 12) {
			c.setCorriendo(false);
		}

		if (PApplet.dist(app.mouseX, app.mouseY, 150, 75) < 12) {
			if (c.getVel()+10 < 1000) {
				c.setVel(10);
			}
		}

		if (PApplet.dist(app.mouseX, app.mouseY, 200, 75) < 12) {
			if (c.getVel()-10 > 0) {
				c.setVel(-10);
			}
		}
	}

}
