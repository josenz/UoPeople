// package touring;

// Your task is to write a class named Tape to represent Turing machine tapes. 
public class workingTape {

    // The class should have an instance variable of type Cell that points to the
    // current cell.
    Cell currentCell; 

    static String allCellsChar = "";

    // It is also useful to have a constructor that creates a tape that initially
    // consists of a single cell.
    // The cell should contain a blank space, and the current cell pointer should
    // point to it.
    // (The alternative -- letting the current cell pointer be null to represent a
    // completely blank tape --
    // makes all the methods in the class more difficult to implement.)
    Tape() {
        this.currentCell = new Cell();
        this.currentCell.content = ' ';
    }

    // To be compatible with the classes that will use the Tape class,
    // your class must include the following methods:

    // public Cell getCurrentCell() -- returns the pointer that points to the
    // current cell.
    public Cell getCurrentCell() {
        return this.currentCell;
    }

    // public char getContent() -- returns the char from the current cell.
    public char getContent() {
        return this.currentCell.content;
    }

    // public void setContent(char ch) -- changes the char in the current cell to
    // the specified value.
    public void setContent(char ch) {
        this.currentCell.content = ch;
    }

    // public void moveLeft() -- moves the current cell one position to the left
    // along the tape. 
    // Note that if the current cell is the leftmost cell that exists, then a new cell
    // must be created and added to the tape at the left of the current cell, and then the current cell
    // pointer can be moved to point to the new cell. The content of the new cell should be a blank space.
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

    // public void moveRight() -- moves the current cell one position to the right
    // along the tape. Note
    // that if the current cell is the rightmost cell that exists, then a new cell
    // must be created and
    // added to the tape at the right of the current cell, and then the current cell
    // pointer can be moved
    // to point to the new cell. The content of the new cell should be a blank
    // space.
    public void moveRight() {

        // Note that if the current cell is the rightmost cell that exists, 
        if ( this.currentCell.next == null ) {
            // then a new cell must be created.
            Cell newRightCell = new Cell();
            // added to the tape at the right of the current cell, and
            this.currentCell.next = newRightCell;
            newRightCell.prev = this.currentCell;
            // then the current cell pointer can be moved to point to the new cell.
            this.currentCell = newRightCell;
            // The content of the new cell should be a blank space.
            this.currentCell.content = ' ';
        } else {
            this.currentCell = this.currentCell.next;
        }

    }

    // (Remember that the Turing machine's tape is conceptually infinite, so your
    // linked list must be
    // prepared to expand on-demand when the machine wants to move past the current
    // end of the list.)


    // public String getTapeContents() -- returns a String consisting of the chars
    // from all the cells on the tape, read from left to right, except that leading 
    // or trailing blank characters should be discarded. 

    // The current cell pointer should not be moved by this method; it
    // should point to the same cell after the method is called as it did 
    // before. You can create a different pointer to move along the tape 
    // and get the full contents. 
    // (This method is the hardest one to implement.)

    // The current cell pointer should not be moved by this method; it
    // should point to the same cell after the method is called as it did
    // before.
    public String getTapeContents() {

        // You can create a different pointer to move along the tape 
        //  and get the full contents.
        Cell cell = this.currentCell;

        if ( cell.prev != null ) {
            // moveLeft();
            while ( cell.prev != null ) {
                cell = cell.prev;
            }
        } 

        while ( cell != null && cell.content != ' ' && cell.next != null ) {
            allCellsChar = allCellsChar + cell.content;
            // moveRight();
            cell = cell.next;
            
            
        }
        return allCellsChar;
    }
    
} // end class Tape






