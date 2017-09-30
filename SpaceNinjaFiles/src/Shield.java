
public class Shield extends Sprite
{
	private double duration = 0;
	private boolean left = true;
	private double cooldown = 10;


	public Shield(double posX, double posY, boolean left)
	{
		this.setPosition(posX, posY);
		this.setLeft(left);
		this.setDuration(0);
	}


	public double getCooldown()
	{
		return cooldown;
	}

	public void setCooldown(double cooldown)
	{
		this.cooldown = cooldown;
	}

	public double getDuration()
	{
		return duration;
	}

	public void setDuration(double duration)
	{
		this.duration = duration;
	}

	public boolean isLeft()
	{
		return left;
	}

	public void setLeft(boolean left)
	{
		this.left = left;
	}
}
