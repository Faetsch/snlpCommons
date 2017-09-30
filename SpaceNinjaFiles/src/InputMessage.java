import java.io.Serializable;

public class InputMessage implements Serializable
{
	private String keyCode;
	private boolean add;

	public InputMessage(String keyCode, boolean add)
	{
		this.keyCode = keyCode;
		this.add = add;
	}

	public String getKeyCode()
	{
		return keyCode;
	}

	public boolean isAdd()
	{
		return add;
	}
}
