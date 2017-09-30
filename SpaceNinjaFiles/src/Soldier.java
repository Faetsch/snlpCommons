

import java.io.Serializable;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Soldier extends AnimatedSprite implements Serializable
{

	private boolean left = true;
	private int hp = 3;
	private double missileCooldown = 3.0;
	private double soldierWidth = 120;
	private double soldierHeight = 75;

	public Soldier()
	{
		setWidth(soldierWidth);
		setHeight(soldierHeight);
	}


	public double getSoldierWidth() {
		return soldierWidth;
	}

	public void setSoldierWidth(double soldierWidth) {
		this.soldierWidth = soldierWidth;
	}

	public double getSoldierHeight() {
		return soldierHeight;
	}

	public void setSoldierHeight(double soldierHeight) {
		this.soldierHeight = soldierHeight;
	}

	@Override
	public void render(GraphicsContext gc, double time)
	{
		if(!left)
		{
			gc.save();
			gc.translate(getPositionX(), getPositionY());
			gc.drawImage(getFrame(time), 0, 0, getFrame(time).getWidth(), getFrame(time).getHeight(), getFrame(time).getWidth(),0,-getFrame(time).getWidth(),getFrame(time).getHeight());
			gc.restore();
		}

		else
		{
	    	gc.drawImage(getFrame(time), getPositionX(), getPositionY());
		}
	}

	public void showHitbox(GraphicsContext gc, double time)
	{
		gc.setStroke(Color.GREEN);
		gc.strokeRect(getPositionX(), getPositionY(), getFrame(time).getWidth(), getFrame(time).getHeight());
	}

	public double getMissileCooldown()
	{
		return missileCooldown;
	}


	public void setMissileCooldown(double missileCooldown)
	{
		this.missileCooldown = missileCooldown;
	}


	@Override
	public void update(double time)
	{
		if(left)
		{
			if((getPositionX() + (getVelocityRight() - getVelocityLeft()) * time) > 500 - soldierWidth)
			{
				setPositionX(500 - soldierWidth);
			}

			else
			{
				setPositionX(getPositionX() + (getVelocityRight() - getVelocityLeft()) * time);
			}


			if((getPositionX() + (getVelocityRight() - getVelocityLeft()) * time) < 0)
			{
				setPositionX(0);
			}

			else
			{
				setPositionX(getPositionX() + (getVelocityRight() - getVelocityLeft()) * time);
			}


			if((getPositionY() + (getVelocityDown() - getVelocityUp()) * time) > 600 - soldierHeight)
			{
				setPositionY(600 - soldierHeight);
			}

			else
			{
				setPositionY(getPositionY() + (getVelocityDown() - getVelocityUp()) * time);
			}

			if((getPositionY() + (getVelocityDown() - getVelocityUp()) * time) < 0)
			{
				setPositionY(0);
			}

			else
			{
				setPositionY(getPositionY() + (getVelocityDown() - getVelocityUp()) * time);
			}
		}

		else
		{
			if((getPositionX() + (getVelocityRight() - getVelocityLeft()) * time) < 500)
			{
				setPositionX(500);
			}

			else
			{
				setPositionX(getPositionX() + (getVelocityRight() - getVelocityLeft()) * time);
			}


			if((getPositionX() + (getVelocityRight() - getVelocityLeft()) * time) > 1000 - soldierWidth)
			{
				setPositionX(1000 - soldierWidth);
			}

			else
			{
				setPositionX(getPositionX() + (getVelocityRight() - getVelocityLeft()) * time);
			}


			if((getPositionY() + (getVelocityDown() - getVelocityUp()) * time) > 600 - soldierHeight)
			{
				setPositionY(600 - soldierHeight);
			}

			else
			{
				setPositionY(getPositionY() + (getVelocityDown() - getVelocityUp()) * time);
			}

			if((getPositionY() + (getVelocityDown() - getVelocityUp()) * time) < 0)
			{
				setPositionY(0);
			}

			else
			{
				setPositionY(getPositionY() + (getVelocityDown() - getVelocityUp()) * time);
			}
		}

	}


	public boolean isLeft()
	{
		return left;
	}

	public void setLeft(boolean left)
	{
		this.left = left;
	}

	public void setHp(int hp)
	{
		this.hp = hp;
	}

	public int getHp()
	{
		return this.hp;
	}

	public void tickCooldown(double time)
	{
		setMissileCooldown(getMissileCooldown() - time);
	}
}
