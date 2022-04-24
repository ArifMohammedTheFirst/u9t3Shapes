import java.awt.Graphics;
public class Line extends Shape{

    Line(){
        super();
    }

    @Override
    public void draw(Graphics graphics){
        graphics.setColor(getColor());
        graphics.drawLine(getP1().x, getP1().y,getP2().x,getP2().y);
    }
}
