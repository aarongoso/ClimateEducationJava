/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package climateactionapp;

/**
 *
 * @author aaron
 */
public abstract class ClimateEducation {

    // Instance variables to represent various aspects of the climate education
    private int quizScore;
    private boolean desertVisible;
    private boolean iceVisible;
    private boolean landVisible;
    private boolean trueradio1;
    private boolean trueradio3;
    private boolean trueradio5;
    private boolean trueradio7;
    private boolean trueradio9;
    private boolean falseradio2;
    private boolean falseradio4;
    private boolean falseradio6;
    private boolean falseradio8;
    private boolean falseradio10;
    private boolean Homebtn;
    private boolean Nextbtn;
    private boolean homebtn2;
    private boolean backbtn;
    private boolean HideTipsbtn;
    private boolean SearchTipbtn;
    private boolean Displaybtn;
    private boolean AddTipBtn;
    private boolean Tiptxtarea;

    // Constructors

    /**
     * Default constructor initializes default values for instance variables.
     */
    public ClimateEducation() {
        this.quizScore = 0;
        this.desertVisible = false;
        this.iceVisible = false;
        this.landVisible = false;
        this.trueradio1 = true;
        this.trueradio3 = true;
        this.trueradio5 = true;
        this.trueradio7 = true;
        this.trueradio9 = true;
        this.falseradio2 = false;
        this.falseradio4 = false;
        this.falseradio6 = false;
        this.falseradio8 = false;
        this.falseradio10 = false;
        this.Homebtn = false;
        this.Nextbtn = false;
        this.homebtn2 = false;
        this.backbtn = false;
        this.HideTipsbtn = false;
        this.SearchTipbtn = false;
        this.Displaybtn = false;
        this.AddTipBtn = false;
        this.Tiptxtarea = false;
    }

    /**
     * Parameterized constructor allows setting initial values during object creation.
     * @param quizScore Initial quiz score
     * @param desertVisible Initial visibility of desert-related content
     * @param iceVisible Initial visibility of ice-related content
     * @param landVisible Initial visibility of land-related content
     * @param trueradio1 Initial state of trueradio1
     * @param trueradio3 Initial state of trueradio3
     * @param trueradio5 Initial state of trueradio5
     * @param trueradio7 Initial state of trueradio7
     * @param trueradio9 Initial state of trueradio9
     * @param falseradio2 Initial state of falseradio2
     * @param falseradio4 Initial state of falseradio4
     * @param falseradio6 Initial state of falseradio6
     * @param falseradio8 Initial state of falseradio8
     * @param falseradio10 Initial state of falseradio10
     * @param Homebtn Initial state of Home button visibility
     */
    public ClimateEducation(int quizScore, boolean desertVisible, boolean iceVisible,
                            boolean landVisible, boolean trueradio1, boolean trueradio3,
                            boolean trueradio5, boolean trueradio7, boolean trueradio9,
                            boolean falseradio2, boolean falseradio4, boolean falseradio6,
                            boolean falseradio8, boolean falseradio10, boolean Homebtn) {
        this.quizScore = quizScore;
        this.desertVisible = desertVisible;
        this.iceVisible = iceVisible;
        this.landVisible = landVisible;
        this.trueradio1 = trueradio1;
        this.trueradio3 = trueradio3;
        this.trueradio5 = trueradio5;
        this.trueradio7 = trueradio7;
        this.trueradio9 = trueradio9;
        this.falseradio2 = falseradio2;
        this.falseradio4 = falseradio4;
        this.falseradio6 = falseradio6;
        this.falseradio8 = falseradio8;
        this.falseradio10 = falseradio10;
        this.Homebtn = Homebtn;
        this.Nextbtn = Nextbtn;
        this.homebtn2 = homebtn2;
        this.backbtn = backbtn;
        this.HideTipsbtn = HideTipsbtn;
        this.SearchTipbtn = SearchTipbtn;
        this.Displaybtn = Displaybtn;
        this.AddTipBtn = AddTipBtn;
        this.Tiptxtarea = Tiptxtarea;
    }

    // Getter and Setter methods

    /**
     * Get the current quiz score.
     * @return Current quiz score
     */
    public int getQuizScore() {
        return quizScore;
    }

    /**
     * Set the quiz score to a new value.
     * @param quizScore New quiz score
     */
    public void setQuizScore(int quizScore) {
        this.quizScore = quizScore;
    }

    /**
     * Check if desert-related content is visible.
     * @return true if desert content is visible, false otherwise
     */
    public boolean isDesertVisible() {
        return desertVisible;
    }

    /**
     * Set the visibility of desert-related content.
     * @param desertVisible New visibility status
     */
    public void setDesertVisible(boolean desertVisible) {
        this.desertVisible = desertVisible;
    }
    
    /**
     * Check if the ice-related content is visible.
     * @return true if ice-related content is visible, false otherwise
     */
    public boolean isIceVisible() {
        return iceVisible;
    }

    /**
     * Set the visibility of ice-related content.
     * @param iceVisible New visibility status for ice-related content
     */
    public void setIceVisible(boolean iceVisible) {
        this.iceVisible = iceVisible;
    }

    /**
     * Check if land-related content is visible.
     * @return true if land-related content is visible, false otherwise
     */
    public boolean isLandVisible() {
        return landVisible;
    }

    /**
     * Set the visibility of land-related content.
     * @param landVisible New visibility status for land-related content
     */
    public void setLandVisible(boolean landVisible) {
        this.landVisible = landVisible;
    }

    /**
     * Check the state of trueradio1.
     * @return true if trueradio1 is selected, false otherwise
     */
    public boolean isTrueradio1() {
        return trueradio1;
    }

    /**
     * Set the state of trueradio1.
     * @param trueradio1 New state for trueradio1
     */
    public void setTrueradio1(boolean trueradio1) {
        this.trueradio1 = trueradio1;
    }

    /**
     * Check the state of trueradio3.
     * @return true if trueradio3 is selected, false otherwise
     */
    public boolean isTrueradio3() {
        return trueradio3;
    }

    /**
     * Set the state of trueradio3.
     * @param trueradio3 New state for trueradio3
     */
    public void setTrueradio3(boolean trueradio3) {
        this.trueradio3 = trueradio3;
    }

    /**
     * Check the state of trueradio5.
     * @return true if trueradio5 is selected, false otherwise
     */
    public boolean isTrueradio5() {
        return trueradio5;
    }

    /**
     * Set the state of trueradio5.
     * @param trueradio5 New state for trueradio5
     */
    public void setTrueradio5(boolean trueradio5) {
        this.trueradio5 = trueradio5;
    }

    /**
     * Check the state of trueradio7.
     * @return true if trueradio7 is selected, false otherwise
     */
    public boolean isTrueradio7() {
        return trueradio7;
    }

    /**
     * Set the state of trueradio7.
     * @param trueradio7 New state for trueradio7
     */
    public void setTrueradio7(boolean trueradio7) {
        this.trueradio7 = trueradio7;
    }

    /**
     * Check the state of trueradio9.
     * @return true if trueradio9 is selected, false otherwise
     */
    public boolean isTrueradio9() {
        return trueradio9;
    }

    /**
     * Set the state of trueradio9.
     * @param trueradio9 New state for trueradio9
     */
    public void setTrueradio9(boolean trueradio9) {
        this.trueradio9 = trueradio9;
    }

    /**
     * Check the state of falseradio2.
     * @return true if falseradio2 is selected, false otherwise
     */
    public boolean isFalseradio2() {
        return falseradio2;
    }

    /**
     * Set the state of falseradio2.
     * @param falseradio2 New state for falseradio2
     */
    public void setFalseradio2(boolean falseradio2) {
        this.falseradio2 = falseradio2;
    }

    /**
     * Check the state of falseradio4.
     * @return true if falseradio4 is selected, false otherwise
     */
    public boolean isFalseradio4() {
        return falseradio4;
    }

    /**
     * Set the state of falseradio4.
     * @param falseradio4 New state for falseradio4
     */
    public void setFalseradio4(boolean falseradio4) {
        this.falseradio4 = falseradio4;
    }

    /**
     * Check the state of falseradio6.
     * @return true if falseradio6 is selected, false otherwise
     */
    public boolean isFalseradio6() {
        return falseradio6;
    }

    /**
     * Set the state of falseradio6.
     * @param falseradio6 New state for falseradio6
     */
    public void setFalseradio6(boolean falseradio6) {
        this.falseradio6 = falseradio6;
    }

    /**
     * Check the state of falseradio8.
     * @return true if falseradio8 is selected, false otherwise
     */
    public boolean isFalseradio8() {
        return falseradio8;
    }

    /**
     * Set the state of falseradio8.
     * @param falseradio8 New state for falseradio8
     */
    public void setFalseradio8(boolean falseradio8) {
        this.falseradio8 = falseradio8;
    }

    /**
     * Check the state of falseradio10.
     * @return true if falseradio10 is selected, false otherwise
     */
    public boolean isFalseradio10() {
        return falseradio10;
    }

    /**
     * Set the state of falseradio10.
     * @param falseradio10 New state for falseradio10
     */
    public void setFalseradio10(boolean falseradio10) {
        this.falseradio10 = falseradio10;
    }
    
   /**
     * Check if the "Home" button is visible.
     * @return true if the "Home" button is visible, false otherwise
     */
    public boolean isHomebtn() {
        return Homebtn;
    }

    /**
     * Set the visibility of the "Home" button.
     * @param Homebtn New visibility status for the "Home" button
     */
    public void setHomebtn(boolean Homebtn) {
        this.Homebtn = Homebtn;
    }

    /**
     * Check if the "Next" button is visible.
     * @return true if the "Next" button is visible, false otherwise
     */
    public boolean isNextbtn() {
        return Nextbtn;
    }

    /**
     * Set the visibility of the "Next" button.
     * @param Nextbtn New visibility status for the "Next" button
     */
    public void setNextbtn(boolean Nextbtn) {
        this.Nextbtn = Nextbtn;
    }

    /**
     * Check if the secondary "Home" button is visible.
     * @return true if the secondary "Home" button is visible, false otherwise
     */
    public boolean isHomebtn2() {
        return homebtn2;
    }

    /**
     * Set the visibility of the secondary "Home" button.
     * @param homebtn2 New visibility status for the secondary "Home" button
     */
    public void setHomebtn2(boolean homebtn2) {
        this.homebtn2 = homebtn2;
    }

    /**
     * Check if the "Back" button is visible.
     * @return true if the "Back" button is visible, false otherwise
     */
    public boolean isBackbtn() {
        return backbtn;
    }

    /**
     * Set the visibility of the "Back" button.
     * @param backbtn New visibility status for the "Back" button
     */
    public void setBackbtn(boolean backbtn) {
        this.backbtn = backbtn;
    }

    /**
     * Check if the "Hide Tips" button is visible.
     * @return true if the "Hide Tips" button is visible, false otherwise
     */
    public boolean isHideTipsbtn() {
        return HideTipsbtn;
    }

    /**
     * Set the visibility of the "Hide Tips" button.
     * @param HideTipsbtn New visibility status for the "Hide Tips" button
     */
    public void setHideTipsbtn(boolean HideTipsbtn) {
        this.HideTipsbtn = HideTipsbtn;
    }

    /**
     * Check if the "Search Tip" button is visible.
     * @return true if the "Search Tip" button is visible, false otherwise
     */
    public boolean isSearchTipbtn() {
        return SearchTipbtn;
    }

    /**
     * Set the visibility of the "Search Tip" button.
     * @param SearchTipbtn New visibility status for the "Search Tip" button
     */
    public void setSearchTipbtn(boolean SearchTipbtn) {
        this.SearchTipbtn = SearchTipbtn;
    }

    /**
     * Check if the "Display" button is visible.
     * @return true if the "Display" button is visible, false otherwise
     */
    public boolean isDisplaybtn() {
        return Displaybtn;
    }

    /**
     * Set the visibility of the "Display" button.
     * @param Displaybtn New visibility status for the "Display" button
     */
    public void setDisplaybtn(boolean Displaybtn) {
        this.Displaybtn = Displaybtn;
    }

    /**
     * Check if the "Add Tip" button is visible.
     * @return true if the "Add Tip" button is visible, false otherwise
     */
    public boolean isAddTipBtn() {
        return AddTipBtn;
    }

    /**
     * Set the visibility of the "Add Tip" button.
     * @param AddTipBtn New visibility status for the "Add Tip" button
     */
    public void setAddTipBtn(boolean AddTipBtn) {
        this.AddTipBtn = AddTipBtn;
    }

    /**
     * Check if the text area for tips is visible.
     * @return true if the text area for tips is visible, false otherwise
     */
    public boolean isTiptxtarea() {
        return Tiptxtarea;
    }

    /**
     * Set the visibility of the text area for tips.
     * @param Tiptxtarea New visibility status for the text area for tips
     */
    public void setTiptxtarea(boolean Tiptxtarea) {
        this.Tiptxtarea = Tiptxtarea;
    }
}
                          
