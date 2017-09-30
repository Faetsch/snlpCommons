

public class Missile extends Sprite
{
	boolean left = true;
	boolean active = true;
	private double speed = 320;

	public Missile(double x, double y, boolean left)
	{
		setWidth(30);
		setHeight(10);
		setPosition(x, y);
		this.left = left;
		if(this.left){setVelocity(speed, 0, 0, 0);} else {setVelocity(0, 0, speed, 0);}
	}

	@Override
	public void update(double time)
	{
			setPositionX(getPositionX() + (getVelocityRight() - getVelocityLeft()) * time);
			setPositionY(getPositionY() + (getVelocityDown() - getVelocityUp()) * time);
	}


}
