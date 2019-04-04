import org.lwjgl.glfw.GLFW.*

GLFWErrorCallback.createPrint(System.err).set()

if (!(glfwInit())) {
	throw IllegalStateException("Unable to initialize window!")
}

glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3)
glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3)
glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE)
glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE)
glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE)

val window: Long = glfwCreateWindow(300, 300, "Voxel Engine", 0, 0)
if (window <= 0) {
	println("Failed to create GLFW window")
	glfwTerminate()
}

glfwMakeContextCurrent(window)
