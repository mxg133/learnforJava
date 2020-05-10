package Glyph;

public class RoundGlyph extends Glyph {
    int m_radius = 1;
    RoundGlyph(int m_radius){
        this.m_radius = m_radius;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + m_radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(), radius = " + m_radius);
    }
}
