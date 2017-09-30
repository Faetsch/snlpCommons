

import java.io.Serializable;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Sprite implements Serializable
{
    private Image image;
    private double positionX;
    private double positionY;
    private double velocityRight;
    private double velocityLeft;
    private double velocityUp;
    private double velocityDown;
    private double width;
    private double height;


    public Sprite()
    {
        positionX = 0;
        positionY = 0;
        velocityRight = 0;
        velocityLeft = 0;
        velocityUp = 0;
        velocityDown = 0;
    }


    public double getWidth()
    {
		return width;
	}

	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}



    public void setImage(Image i)
    {
        image = i;
        width = i.getWidth();
        height = i.getHeight();
    }

    public void setImage(String filename)
    {
        Image i = new Image(filename);
        setImage(i);
    }

    public void setPosition(double x, double y)
    {
        positionX = x;
        positionY = y;
    }

    public void setPositionX(double x)
    {
        positionX = x;
    }

    public void setPositionY(double y)
    {
        positionY = y;
    }

    public void setVelocity(double r, double u, double l, double d)
    {
        velocityRight = r;
        velocityLeft = l;
        velocityUp = u;
        velocityDown = d;
    }

    public void addVelocity(double r, double u, double l, double d)
    {
        velocityRight += r;
        velocityLeft += l;
        velocityUp += u;
        velocityDown += d;
    }

    public void update(double time)
    {
        positionX += (velocityRight - velocityLeft) * time;
        positionY += (velocityDown - velocityUp) * time;
    }

    public void render(GraphicsContext gc)
    {
        gc.drawImage(image, positionX, positionY);
    }

    public Rectangle2D getBoundary()
    {
        return new Rectangle2D(positionX,positionY,width,height);
    }

    public boolean intersects(Sprite s)
    {

        return s.getBoundary().intersects( this.getBoundary() );
    }

    public double getPositionX()
    {
    	return positionX;
    }

    public double getPositionY()
    {
    	return positionY;
    }

	public double getVelocityRight()
	{
		return velocityRight;
	}

	public double getVelocityLeft()
	{
		return velocityLeft;
	}

	public double getVelocityUp()
	{
		return velocityUp;
	}

	public double getVelocityDown() {
		return velocityDown;
	}

}