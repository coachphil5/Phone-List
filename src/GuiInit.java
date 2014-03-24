import javax.swing.*;
import java.awt.*;

/**
 * Created by JOINTJUICE on 3/22/2014.
 */
public class GuiInit extends JFrame {
    public GuiInit() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.setUndecorated(true);
        JTable table = new JTable(new InsertFileDataToJTable());
        table.setRowHeight(table.getRowHeight() + 8);
        table.setShowHorizontalLines(false);
        table.setRowSelectionAllowed(true);
        table.setDefaultRenderer(Object.class, new JTableRender());
        getContentPane().add(new JScrollPane(table), BorderLayout.CENTER);
        pack();
        this.setTitle("Phone List");
        this.setSize(300,750);
        this.setVisible(true);
    }
}
