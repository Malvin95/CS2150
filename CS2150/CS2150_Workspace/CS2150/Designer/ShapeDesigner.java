package Designer;

import org.lwjgl.opengl.GL11;

import GraphicsLab.Colour;
import GraphicsLab.Normal;
import GraphicsLab.Vertex;

/**
 * The shape designer is a utility class which assits you with the design of 
 * a new 3D object. Replace the content of the drawUnitShape() method with
 * your own code to creates vertices and draw the faces of your object.
 * 
 * You can use the following keys to change the view:
 *   - TAB		switch between vertex, wireframe and full polygon modes
 *   - UP		move the shape away from the viewer
 *   - DOWN     move the shape closer to the viewer
 *   - X        rotate the camera around the x-axis (clockwise)
 *   - Y or C   rotate the camera around the y-axis (clockwise)
 *   - Z        rotate the camera around the z-axis (clockwise)
 *   - SHIFT    keep pressed when rotating to spin anti-clockwise
 *   - A 		Toggle colour (only if using submitNextColour() to specify colour)
 *   - SPACE	reset the view to its initial settings
 *  
 * @author Remi Barillec
 *
 */
public class ShapeDesigner extends AbstractDesigner {
	
	/** Main method **/
	public static void main(String args[])
    {   
		new ShapeDesigner().run( WINDOWED, "Designer", 0.01f);
    }
	
	/** Draw the shape **/
    protected void drawUnitShape()
    {
    	Vertex v1 = new Vertex(-0.5f, 0.5f, 0.5f);
		Vertex v2 = new Vertex(0.0f, 1.0f, 0.5f);
		Vertex v3 = new Vertex(0.5f, 0.5f, 0.5f);
		Vertex v4 = new Vertex(-0.5f, 0.5f, -0.5f);
		Vertex v5 = new Vertex(0.5f, 0.5f, -0.5f);
		Vertex v6 = new Vertex(0.0f, 1.0f, -0.5f);
		
		/* GL11.glBegin(GL11.GL_POINTS);
		
		v1.submit();
		v2.submit();
		v3.submit();
		v4.submit();
		v5.submit();
		v6.submit();
		
		GL11.glEnd(); */
		
		GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
			//Near face
			
            v3.submit();
            v2.submit();
            v1.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Far face
        	
            v4.submit();
            v6.submit();
            v5.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Bottom face

            v1.submit();
            v4.submit();
            v5.submit();
            v3.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Left face

            v2.submit();
            v6.submit();
            v4.submit();
            v1.submit();
        }
        GL11.glEnd();
        
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Right face

            v6.submit();
            v2.submit();
            v3.submit();
            v5.submit();
        }
        GL11.glEnd();
    }
}
