import java.awt.Graphics;

public class Arc extends Shape{
    private int angleArc;
    private int angleInitial;

    public Arc(){
        super();
        angleArc = 70;
        angleInitial = 30;
    }

    @Override
    public void draw(Graphics graphics){
        graphics.setColor(getColor());
        graphics.drawArc(getMinX(),getMinY(),getWidth(),getHeight(),angleInitial,angleArc);
    }
}
