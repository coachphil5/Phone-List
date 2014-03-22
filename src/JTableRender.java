import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 * Created by JOINTJUICE on 3/22/14.
 */
public class JTableRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JTextField editor = new JTextField();
        table.setShowHorizontalLines(false);
        if (value != null)
            editor.setText(value.toString());
        if (table.isRowSelected(row))
            editor.setBackground(Color.gray);
        else {
            editor.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, (row % 2 == 0) ? Color.white : Color.lightGray));
            editor.setBackground((row % 2 == 0) ? Color.white : Color.lightGray);
        }
        return editor;
    }
}

