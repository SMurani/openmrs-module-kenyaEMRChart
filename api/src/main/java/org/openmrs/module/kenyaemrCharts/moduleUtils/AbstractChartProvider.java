package org.openmrs.module.kenyaemrCharts.moduleUtils;

/**
 * Created by Sammy on 9/4/2017.
 */
//Abstract class
public abstract class AbstractChartProvider {
    int x, y;
    void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;

        System.out.println(":::::::::::::::The cursor has moved from "+x  +" to "+y);
    }

    //abstract method
    public abstract void mark();

    public void drawChart(){

    }
     void showMaps(){
        System.out.println(" :::::::::::::::::Successfully showed maps in parent class");

    }
    //abstract method
    public abstract void generateChartProperties(int x, int y);


    public void showChat(){
        System.out.println(":::::::::::::::::::::: We are currently showing some High charts");
    }

}
