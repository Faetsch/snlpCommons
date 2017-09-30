import java.io.Serializable;
import java.util.ArrayList;

public class GameState implements Serializable
{
	public Soldier[][] soldiers = new Soldier[2][3];
	public ArrayList<Missile> missiles = new ArrayList<Missile>();
	public int[] selectedSoldier = new int[2];
	public double absoluteTime = 0;
	public double elapsedTime = 0;
	public long currentNanoTime = 0;
	public int wonBy = 1;

	public int getSelectedSoldier(int player)
	{
		return selectedSoldier[player];
	}

	public void setSelectedSoldier(int player, int s)
	{
		this.selectedSoldier[player] = s;
	}

	public Soldier[][] getSoldiers()
	{
		return soldiers;
	}

	public void setSoldiers(Soldier[][] soldiers)
	{
		this.soldiers = soldiers;
	}

	public ArrayList<Missile> getMissiles()
	{
		return missiles;
	}

	public void setMissiles(ArrayList<Missile> missiles)
	{
		this.missiles = missiles;
	}
}
