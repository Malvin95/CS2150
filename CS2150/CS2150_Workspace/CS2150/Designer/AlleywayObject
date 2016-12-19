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
    	//GL11.glDisable(GL11.GL_CULL_FACE);
    }
	
	/** Draw the shape **/
    protected void drawUnitShape()
    {
    	//Scene object Groups
    	Vertex v1 = new Vertex(-5.0f,0.0f,10.0f);
		Vertex v2 = new Vertex(-5.0f,5.0f,10.0f);
		Vertex v3 = new Vertex(5.0f,5.0f,10.0f);
		Vertex v4 = new Vertex(5.0f,0.0f,10.0f);
		Vertex v5 = new Vertex(-5.0f,0.0f,-10.0f);
		Vertex v6 = new Vertex(-5.0f,5.0f,-10.0f);
		Vertex v7 = new Vertex(5.0f,5.0f,-10.0f);
		Vertex v8 = new Vertex(5.0f,0.0f,-10.0f);
		
		GL11.glBegin(GL11.GL_POINTS);
		
			v1.submit();
			v2.submit();
			v3.submit();
			v4.submit();
			v5.submit();
			v6.submit();
			v7.submit();
			v8.submit();
			
			GL11.glEnd();
			
		GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
			//Back Pane
        	
            v1.submit();
            v2.submit();
            v3.submit();
            v4.submit();
            
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Left Pane
        	
        	v1.submit();
            v5.submit();
            v6.submit();
            v2.submit();
            
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Right Pane

            v4.submit();
            v3.submit();
            v7.submit();
            v8.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Bottom Pane

            v4.submit();
            v8.submit();
            v5.submit();
            v1.submit();
        }
        GL11.glEnd();
        
    }
}
