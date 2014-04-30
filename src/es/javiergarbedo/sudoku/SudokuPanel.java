package es.javiergarbedo.sudoku;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.beans.Beans;
import javax.swing.JOptionPane;

public class SudokuPanel extends javax.swing.JPanel {

    private final int CELL_SIZE = 40;
    private final int NUM_COLUMNS = 9;
    private final int NUM_ROWS = 9;
    private final Color BACKGROUND_SELECTED = Color.ORANGE;
    private final Color BACKGROUND_CLUE = new Color(255, 228, 181);
    private final Color BACKGROUND_NORMAL = new Color(255, 255, 224);
    private int rowSelected = -1;
    private int colSelected = -1;
    private Sudoku sudoku = null;

    /**
     * Creates new form SudokuPanel
     */
    public SudokuPanel() {
        initComponents();
    }

    public void setSudoku(Sudoku sudoku) {
        this.sudoku = sudoku;
    }

    public int getRowSelected() {
        return rowSelected;
    }

    public int getColSelected() {
        return colSelected;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (sudoku != null && !Beans.isDesignTime()) {
            //Pintar las rayas horizontales
            for (int i = 0; i <= NUM_ROWS; i++) {
                if (i % 3 == 0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.drawLine(0, CELL_SIZE * i, CELL_SIZE * NUM_COLUMNS, CELL_SIZE * i);
            }
            //Pintar las rayas verticales
            for (int i = 0; i <= NUM_COLUMNS; i++) {
                if (i % 3 == 0) {
                    g.setColor(Color.BLACK);
                } else {
                    g.setColor(Color.LIGHT_GRAY);
                }
                g.drawLine(CELL_SIZE * i, 0, CELL_SIZE * i, CELL_SIZE * NUM_ROWS);
            }
            //TODO: Pintar los cuadros de las celdas
            g.setColor(new Color(255, 255, 224));
            g.fillRect(1, 1, 39, 39);
            g.fillRect(1, 41, 39, 39);
            g.fillRect(1, 81, 39, 39);
            g.fillRect(1, 121, 39, 39);
            g.fillRect(1, 161, 39, 39);
            g.fillRect(1, 201, 39, 39);
            g.fillRect(1, 241, 39, 39);
            g.fillRect(1, 281, 39, 39);
            g.fillRect(1, 321, 39, 39);
            
            g.fillRect(41, 1, 39, 39);
            g.fillRect(41, 41, 39, 39);
            g.fillRect(41, 81, 39, 39);
            g.fillRect(41, 121, 39, 39);
            g.fillRect(41, 161, 39, 39);
            g.fillRect(41, 201, 39, 39);
            g.fillRect(41, 241, 39, 39);
            g.fillRect(41, 281, 39, 39);
            g.fillRect(41, 321, 39, 39);
            
            g.fillRect(81, 1, 39, 39);
            g.fillRect(81, 41, 39, 39);
            g.fillRect(81, 81, 39, 39);
            g.fillRect(81, 121, 39, 39);
            g.fillRect(81, 161, 39, 39);
            g.fillRect(81, 201, 39, 39);
            g.fillRect(81, 241, 39, 39);
            g.fillRect(81, 281, 39, 39);
            g.fillRect(81, 321, 39, 39);
            
            g.fillRect(121, 1, 39, 39);
            g.fillRect(121, 41, 39, 39);
            g.fillRect(121, 81, 39, 39);
            g.fillRect(121, 121, 39, 39);
            g.fillRect(121, 161, 39, 39);
            g.fillRect(121, 201, 39, 39);
            g.fillRect(121, 241, 39, 39);
            g.fillRect(121, 281, 39, 39);
            g.fillRect(121, 321, 39, 39);
            
            g.fillRect(161, 1, 39, 39);
            g.fillRect(161, 41, 39, 39);
            g.fillRect(161, 81, 39, 39);
            g.fillRect(161, 121, 39, 39);
            g.fillRect(161, 161, 39, 39);
            g.fillRect(161, 201, 39, 39);
            g.fillRect(161, 241, 39, 39);
            g.fillRect(161, 281, 39, 39);
            g.fillRect(161, 321, 39, 39);
            
            g.fillRect(201, 1, 39, 39);
            g.fillRect(201, 41, 39, 39);
            g.fillRect(201, 81, 39, 39);
            g.fillRect(201, 121, 39, 39);
            g.fillRect(201, 161, 39, 39);
            g.fillRect(201, 201, 39, 39);
            g.fillRect(201, 241, 39, 39);
            g.fillRect(201, 281, 39, 39);
            g.fillRect(201, 321, 39, 39);
            
            g.fillRect(241, 1, 39, 39);
            g.fillRect(241, 41, 39, 39);
            g.fillRect(241, 81, 39, 39);
            g.fillRect(241, 121, 39, 39);
            g.fillRect(241, 161, 39, 39);
            g.fillRect(241, 201, 39, 39);
            g.fillRect(241, 241, 39, 39);
            g.fillRect(241, 281, 39, 39);
            g.fillRect(241, 321, 39, 39);
            
            g.fillRect(281, 1, 39, 39);
            g.fillRect(281, 41, 39, 39);
            g.fillRect(281, 81, 39, 39);
            g.fillRect(281, 121, 39, 39);
            g.fillRect(281, 161, 39, 39);
            g.fillRect(281, 201, 39, 39);
            g.fillRect(281, 241, 39, 39);
            g.fillRect(281, 281, 39, 39);
            g.fillRect(281, 321, 39, 39);
            
            g.fillRect(321, 1, 39, 39);
            g.fillRect(321, 41, 39, 39);
            g.fillRect(321, 81, 39, 39);
            g.fillRect(321, 121, 39, 39);
            g.fillRect(321, 161, 39, 39);
            g.fillRect(321, 201, 39, 39);
            g.fillRect(321, 241, 39, 39);
            g.fillRect(321, 281, 39, 39);
            g.fillRect(321, 321, 39, 39);
            
            g.setColor(Color.ORANGE);
            g.fillRect(getRowSelected(),getColSelected(),getRowSelected(),getColSelected());
            //TODO: Pintar los valores           
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        rowSelected = evt.getY() / CELL_SIZE;
        colSelected = evt.getX() / CELL_SIZE;
        if (rowSelected >= NUM_ROWS || colSelected >= NUM_COLUMNS) {
            rowSelected = -1;
            colSelected = -1;
        } else if (sudoku.isInInitialPuzzle(rowSelected, colSelected)) {
            rowSelected = -1;
            colSelected = -1;
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (getRowSelected() != -1 && getColSelected() != -1) {
            if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
                sudoku.setValue(getRowSelected(), getColSelected(), evt.getKeyChar());
                repaint();
                if (sudoku.isFinished()) {
                    //TODO: Adaptar al idioma del sistema
                    String msgLevelCompleted = "Nivel completado";
                    JOptionPane.showMessageDialog(this, msgLevelCompleted, "Sudoku", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE
                    || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                sudoku.removeValue(getRowSelected(), getColSelected());
                repaint();
            }
        }
    }//GEN-LAST:event_formKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
