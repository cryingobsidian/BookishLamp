package cryingobsidian.bookishlamp;

import org.lwjgl.Version;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL15;

import static org.lwjgl.opengl.GL11.glClearColor;

public class BookishLamp {

    private Window window;

    public static void main(String[] args) {
        new BookishLamp().run();
    }

    public void run() {
        System.out.println("LWJGL version " + Version.getVersion());

        init();
        loop();
        cleanup();
    }

    private void init() {
        window = new Window("BookishLamp", 500, 500);
    }

    private void loop() {
        GL.createCapabilities();

        glClearColor(0.5f, 0.5f, 0.5f, 0.0f);

        while (!window.shouldClose()) {
            GL15.glBegin(GL15.GL_TRIANGLES);

            GL15.glColor3f(1f, 0f, 0f);
            GL15.glVertex2f(-0.5f, 0.5f);
            GL15.glVertex2f(0.5f, 0.5f);
            GL15.glVertex2f(-0.5f, -0.5f);

            GL15.glColor3f(0f, 0f, 1f);
            GL15.glVertex2f(0.5f, -0.5f);
            GL15.glVertex2f(-0.5f, -0.5f);
            GL15.glVertex2f(0.5f, 0.5f);

            GL15.glEnd();

            window.update();
        }
    }

    private void cleanup() {
        window.cleanup();
    }

}