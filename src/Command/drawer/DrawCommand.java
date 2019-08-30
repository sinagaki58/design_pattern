package Command.drawer;

import Command.command.ICommand;

import java.awt.Point;

public class DrawCommand implements ICommand {
    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
