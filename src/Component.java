import org.newdawn.slick.GameContainer;


public abstract class Component {

	protected Entity owner;
	
	public Component(Entity owner)
	{
		this.owner = owner;
	}
	
	public abstract void update(GameContainer gc, int delta);
	
}
