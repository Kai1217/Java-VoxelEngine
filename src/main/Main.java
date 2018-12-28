package main;

import org.lwjgl.glfw.GLFW;
import engine.io.Window;

public class Main
{
    public static void main(String[] args)
    {
        Window window = new Window(800, 600, "JavaVoxelEngine");
        window.create();

        while (!window.closed())
        {
            window.update();
            if (window.isKeyPressed(GLFW.GLFW_KEY_A)) System.out.println("A is pressed");
            if (window.isKeyReleased(GLFW.GLFW_KEY_A)) System.out.println("A is released");
            if (window.isMousePressed(GLFW.GLFW_MOUSE_BUTTON_LEFT)) System.out.println("Left mouse button is pressed at: " + window.getMouseX() + ", " + window.getMouseY() + "");
            if (window.isMouseReleased(GLFW.GLFW_MOUSE_BUTTON_LEFT)) System.out.println("Left MB is released");
            window.swapBuffers();
        }
    }
}
