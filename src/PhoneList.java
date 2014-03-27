/**
 * Created by JOINTJUICE on 3/22/2014.
 * Implemented class using a runnable for thread safety.
 */
public class PhoneList {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GuiInit();
            }
        });
    }
}
// public static void main(String[] args) { new GuiInit();

