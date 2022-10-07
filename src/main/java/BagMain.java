/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
class BagMain {
    public static void enhanceBags(Bag[] bags, boolean double_enhance_handbags) {
        for (Bag bag : bags) {
            bag.enhance();
            if((bag instanceof HandBag) && (double_enhance_handbags)){
                bag.enhance();
            }
        }
    }

    /**
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        int counter = 0;
        for(Bag bag : bags){
            if(bag instanceof CrossbodyBag){
                counter += ((CrossbodyBag) bag).getNumberOfStraps();
            }
        }
        return counter;
    }
}