package main;

import engine.io.Window;

public class Main
{
    public static void main(String[] args)
    {
        Window window = new Window(800, 600, "LWJGL");
        window.create();

        while (!window.closed())
        {
            window.update();
            System.out.println("Hello");
            window.swapBuffers();
        }
    }
}
