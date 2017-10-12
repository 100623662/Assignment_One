/**
* @author AddYourNameHere YourBannerIDhere
*/

public class WoodenBeam {
 double computeMaxLoad(double stress) {
 // Write your code here
 }
 public static void main(String[] args) {
 // Create a beam object using it’s length, bade and height
 WoodenBeam wb1 = new WoodenBeam(8.0, 2.0, 4.0);
 WoodenBeam wb2 = new WoodenBeam(8.0, 3.0, 6.0);
 double maxload1 = wb1.computeMaxLoad(3000.0);
 double maxload2 = wb2.computeMaxLoad(3000.0);
 // print out details
 }
}
