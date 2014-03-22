import javax.swing.*;
import java.awt.*;

/**
 * Created by JOINTJUICE on 3/22/2014.
 */
public class GuiInit extends JFrame {
    public GuiInit() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setUndecorated(true);
        JTable table = new JTable(new InsertFileDataToJTable());
        table.setRowHeight(table.getRowHeight() + 8);
        table.setRowSelectionAllowed(true);
        table.setDefaultRenderer(Object.class, new JTableRender());
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        this.setTitle("Phone List");
        pack();
    }
}
