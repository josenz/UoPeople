// Algorithm "Recursive Walk", based on a path P = (s0,t0), (s1,t1), (s2,t2), ..., (sk-1,tk-1):

// To go from a point (a1,b1) to a point (a2,b2), with recursion level n:
// if n is 0:
// go directly from (a1,b1) to (a2,b2) in a straight line

// else:
// find a transformed copy of the path P that goes from (a1,b1) to (a2,b2),
// where the points on the copy are (x0,y0), (x1,y1), (x2,y2), ... (xk-1,yk-1)
// with (x0,y0) = (a1,b1) and (xk-1,yk-1) = (a2,b2)
// for (i = 1; i < k; i++):
// call the algorithm recursively to go from (xi-1, yi-1) to (xi, yi) with recursion level
// n-1



// The actual program that you will write is an interactive program 
// where the user can drag points on the screen to create the original 
// path that is used as the basis of the recursion. 

// An executable jar 
// file for the program can be found in the file FunnyFractals.jar, in 
// the code directory of this unit. 


// The source code for the main program 
// is in the file FamousFractals.java, also in the code directory. Copy 
// this file into your Eclipse project. 

// You will have to create two classes, 
// InputCanvas and DisplayCanvas. 

// The main program and the executable program 
// can serve as a guide for what needs to be in these classes. 

// Each class can 
// be written as a subclass of JPanel. 

// Both classes need paintComponent methods 
// to draw the contents of the panel. 


// InputCanvas needs a mouse listener and mouse 
// motion listener to allow the user to drag the points. 
// As the user drags a point, you need to call repaint, 
// and you need to call the setPoints method in the DisplayCanvas 
// to get the new list of points into that class as well.

// This task is obviously about more than recursion. It's also a chance for you to review (or learn) some GUI programming.