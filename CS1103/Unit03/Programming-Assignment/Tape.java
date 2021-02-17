// package turing;

/**
 * This class Tape represents a Turing Machine tapes, it uses a linked list
 * approach to create cells on itself.
 * It has a constructor that creates the first cell with a blank space content.
 */
public class Tape {

    /**
     * The currentCell instance variable points to the current cell.
     */
    Cell currentCell; 

    /**
     * The allCellsChar is a String type static variable
     * that holds all the characters inside the cells.
     */
    static String allCellsChar = "";

    /**
     * The Tape constructor certifies that every Tape object
     * created must contain a first cell with a blank space content.
     */
    Tape() {
        this.currentCell = new Cell();
        this.currentCell.content = ' ';
    }

    /**
     * The getCurrentCell() instance method
     * returns a type Cell value that points 
     * to the current cell available.
     */
    public Cell getCurrentCell() {
        return this.currentCell;
    }

    /**
     * The getContent() instance method 
     * returns a type char value which
     * the current cell holds in its content 
     * field.
     */
    public char getContent() {
        return this.currentCell.content;
    }

    /**
     * The setContent() instance method 
     * does not return any value, it 
     * just sets a value to the currentCell's
     * content field which is a char type value.
     */
    public void setContent(char ch) {
        this.currentCell.content = ch;
    }

    /**
     * The moveLeft() instance method moves
     * the current cell one position to the 
     * left along the tape.
     * It does not return any value.
     */
    public void moveLeft() {

        if ( this.currentCell.prev == null ) {
            Cell newLeftCell = new Cell();
            this.currentCell.prev = newLeftCell;
            newLeftCell.next = this.currentCell;
            this.currentCell = newLeftCell;
            this.currentCell.content = ' ';
        } else {
            this.currentCell = this.currentCell.prev;
        }

    }

    /**
     * The moveRight() instance method moves
     * the current cell one position to the 
     * right along the tape.
     * It does not return any value.
     */
    public void moveRight() {

        if ( this.currentCell.next == null ) {
            Cell newRightCell = new Cell();
            this.currentCell.next = newRightCell;
            newRightCell.prev = this.currentCell;
            this.currentCell = newRightCell;
            this.currentCell.content = ' ';
        } else {
            this.currentCell = this.currentCell.next;
        }

    }

    /**
     * The getTapeContents() instance method returns
     * a String consisting of the chars from all the
     * cells on the tape, it starts reading them from 
     * the left to the right.
     */
    public String getTapeContents() {

        Cell cell = this.currentCell;

        if (cell.prev != null) {
            // moveLeft();
            while (cell.prev != null) {
                cell = cell.prev;
            }
        }

        while (cell != null && cell.content != ' ' && cell.next != null) {
            allCellsChar = allCellsChar + cell.content;
            // moveRight();
            cell = cell.next;

        }
        return allCellsChar;
    }
    
} // end class Tape






