package driver;

import net.kogics.kojo.lite.Builtins;
import net.kogics.kojo.lite.DrawingCanvasAPI;
import net.kogics.kojo.lite.KojoFrame;
import net.kogics.kojo.turtle.TurtleWorldAPI;

class API {
    static KojoFrame kojo = KojoFrame.create(true);
    static Builtins b = kojo.builtins();
    static TurtleWorldAPI t = b.TurtleAPI();
    static DrawingCanvasAPI c = b.CanvasAPI();

    public static void clear() {
        c.clear();
    }

    public static void forward(double n) {
        t.forward(n);
    }
    public static void right(double n){
        t.right(n);
    }
}

