

import java.io.Serializable;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class AnimatedSprite extends Sprite implements Serializable
{
    private Image[] frames;
    private double duration;

    public Image getFrame(double time)
    {
    	int index = (int)((time % (frames.length * duration)) / duration);
    	return frames[index];
    }


    public void render(GraphicsContext gc, double time)
    {
    	gc.drawImage(getFrame(time), getPositionX(), getPositionY());
    }

    public Image[] getFrames()
    {
		return frames;
	}

	public void setFrames(Image[] frames)
	{
		this.frames = frames;
		setWidth(getFrames()[0].getWidth());
		setHeight(getFrames()[0].getHeight());
	}

	public double getDuration()
	{
		return duration;
	}

	public void setDuration(double duration)
	{
		this.duration = duration;
	}

}
