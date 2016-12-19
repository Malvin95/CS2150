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
    	Vertex v1 = new Vertex(0.0f,0.0f,2.0f);
		Vertex v2 = new Vertex(0.0f,1.0f,2.0f);
		Vertex v3 = new Vertex(1.0f,1.0f,2.0f);
		Vertex v4 = new Vertex(1.0f,0.0f,2.0f);	
		Vertex v5 = new Vertex(0.0f, 0.0f, 0.0f);
		Vertex v6 = new Vertex(0.0f, 1.0f, 0.0f);
		Vertex v7 = new Vertex(1.0f, 1.0f, 0.0f);
		Vertex v8 = new Vertex(1.0f, 0.0f, 0.0f);
	
		Vertex v9 = new Vertex(0.25f, 0.25f, 2.5f);
		Vertex v10 = new Vertex(0.25f, 0.75f, 2.5f);
		Vertex v11 = new Vertex(0.75f, 0.75f, 2.5f);
		Vertex v12 = new Vertex(0.75f, 0.25f, 2.5f);
		Vertex v13 = new Vertex(0.25f, 0.25f, 2.0f);
		Vertex v14 = new Vertex(0.25f, 0.75f, 2.0f);
		Vertex v15 = new Vertex(0.75f, 0.75f, 2.0f);
		Vertex v16 = new Vertex(0.75f, 0.25f, 2.0f);

		Vertex v17 = new Vertex(0.375f, 0.375f, 2.75f);
		Vertex v18 = new Vertex(0.375f, 0.625f, 2.75f);
		Vertex v19 = new Vertex(0.625f, 0.625f, 2.75f);
		Vertex v20 = new Vertex(0.625f, 0.375f, 2.75f);
		Vertex v21 = new Vertex(0.375f, 0.375f, 2.5f);
		Vertex v22 = new Vertex(0.375f, 0.625f, 2.5f);
		Vertex v23 = new Vertex(0.625f, 0.625f, 2.5f);
		Vertex v24 = new Vertex(0.625f, 0.375f, 2.5f);
		
		
		GL11.glBegin(GL11.GL_POINTS);
		
		v1.submit();
		v2.submit();
		v3.submit();
		v4.submit();	
		v5.submit();
		v6.submit();
		v7.submit();
		v8.submit();
		
		v9.submit();
		v10.submit();
		v11.submit();
		v12.submit();
		v13.submit();
		v14.submit();
		v15.submit();
		v16.submit();
		
		v17.submit();
		v18.submit();
		v19.submit();
		v20.submit();
		v21.submit();
		v22.submit();
		v23.submit();
		v24.submit();
		
		GL11.glEnd();
		
		GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
			//Near face
			
           	v4.submit();
	    	v3.submit();
           	v2.submit();
           	v1.submit();
        }
       	GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Far face
        
        	v5.submit();
	    	v6.submit();
	    	v7.submit();
	    	v8.submit();
        }
        GL11.glEnd();
        
	    GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Top face

	        v7.submit();
        	v6.submit();
            v2.submit();
            v3.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Bottom face

            v1.submit();
            v5.submit();
            v8.submit();
            v4.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Left face

            v1.submit();
            v2.submit();
            v6.submit();
            v5.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Right face

            v8.submit();
            v7.submit();
            v3.submit();
            v4.submit();
        }
        GL11.glEnd();
        
        /*
         * 
         * LARGER LENS PIECE
         */
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
			//Lens Near face
			
            v12.submit();
            v11.submit();
            v10.submit();
            v9.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Lens Far face
        	
        	v13.submit();
            v14.submit();
            v15.submit();
            v16.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Top face

            v15.submit();
            v14.submit();
            v10.submit();
            v11.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Bottom face

            v9.submit();
            v13.submit();
            v16.submit();
            v12.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Left face

            v9.submit();
            v10.submit();
            v14.submit();
            v13.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Right face

            v16.submit();
            v15.submit();
            v11.submit();
            v12.submit();
        }
        GL11.glEnd();
        
        /*
         * 
         * SMALLER LENS PIECE
         */
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
			//Lens Near face
			
            v20.submit();
            v19.submit();
            v18.submit();
            v17.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
        	//Lens Far face
        	
        	v21.submit();
            v22.submit();
            v23.submit();
            v24.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Top face

            v23.submit();
            v22.submit();
            v18.submit();
            v19.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Bottom face

            v17.submit();
            v21.submit();
            v24.submit();
            v20.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Left face

            v17.submit();
            v18.submit();
            v22.submit();
            v21.submit();
        }
        GL11.glEnd();
        
        GL11.glBegin(GL11.GL_POLYGON);
        {
        	submitNextColour();
            //Lens Right face

            v24.submit();
            v23.submit();
            v19.submit();
            v20.submit();
        }
        GL11.glEnd(); 
        
    }
}
