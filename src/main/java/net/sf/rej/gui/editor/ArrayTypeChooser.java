/* Copyright (C) 2004-2007 Sami Koivu
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.sf.rej.gui.editor;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sf.rej.java.instruction._newarray;
import net.sf.rej.util.Wrapper;

@SuppressWarnings("serial")
public class ArrayTypeChooser extends JPanel {
    JLabel label = new JLabel("Array type: ");
    JComboBox<Wrapper<Integer>> combo = new JComboBox<>();

    public ArrayTypeChooser() {
        this.setLayout(new GridBagLayout());
        this.add(this.label, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        this.add(this.combo, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        Vector<Wrapper<Integer>> vector = new Vector<>(8);
        vector.add(getWrapper(_newarray.TYPE_BOOLEAN));
        vector.add(getWrapper(_newarray.TYPE_BYTE));
        vector.add(getWrapper(_newarray.TYPE_CHAR));
        vector.add(getWrapper(_newarray.TYPE_DOUBLE));
        vector.add(getWrapper(_newarray.TYPE_FLOAT));
        vector.add(getWrapper(_newarray.TYPE_INT));
        vector.add(getWrapper(_newarray.TYPE_LONG));
        vector.add(getWrapper(_newarray.TYPE_SHORT));
        DefaultComboBoxModel<Wrapper<Integer>> model = new DefaultComboBoxModel<>(vector);
        this.combo.setModel(model);
    }

    public Object getValue() {
        @SuppressWarnings("unchecked")
		Wrapper<Integer> wrapper = (Wrapper<Integer>) this.combo.getSelectedItem();

        return wrapper.getContent();
    }

    public Wrapper<Integer> getWrapper(int arrayType) {
        Wrapper<Integer> wrapper = new Wrapper<Integer>();
        wrapper.setContent(arrayType);
        wrapper.setDisplay(_newarray.getTypeName(arrayType));
        return wrapper;
    }

    public void setSelected(int arrayType) {
        this.combo.setSelectedItem(getWrapper(arrayType));
    }

    public void setEditable(boolean b) {
        this.combo.setEditable(b);
    }

    public void setReadOnly() {
        this.combo.setEnabled(false);
    }

}