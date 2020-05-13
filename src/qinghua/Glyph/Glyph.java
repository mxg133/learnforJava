package qinghua.Glyph;

public abstract class Glyph {
    abstract void draw();
    Glyph(){
        System.out.println("Glyph() berore draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}