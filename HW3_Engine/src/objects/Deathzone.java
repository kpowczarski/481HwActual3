package objects;

import java.awt.Rectangle;

import main.Server;
import processing.core.PApplet;
/**
 * 
 * @author Kevin Owczarski
 * Encompasses deathzone object's variables
 *
 */
public class Deathzone extends GameObject {

    private static final long serialVersionUID = 1L;

    public Deathzone ( int x, int y, int w, int h ) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.rect = new Rectangle( x, y, w, h );
    }

    @Override
    public void render ( PApplet p ) {
        // nothing to render

    }

    @Override
    public void handleCollision ( GameObject o ) {
    	Event e = new Event(Events.DEATH, o, Server.time.getCurrentTime());
    	Server.eventM.addEvent(e);
//        if ( o.type.equals( "player" ) ) {
//            Player p = (Player) o;
//            Spawnpoint s = p.spawnlist.get( p.GUID % 3 );
//            p.rect.x = s.x;
//            p.rect.y = s.y;
//        }
    }

}
