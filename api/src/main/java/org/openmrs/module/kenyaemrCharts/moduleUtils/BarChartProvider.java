package org.openmrs.module.kenyaemrCharts.moduleUtils;

/**
 * Created by Sammy on 9/4/2017.
 */
public class BarChartProvider extends AbstractChartProvider {

    @Override
    public void mark() {
        System.out.print("**********This is an abstruct method, thus has to be implemented in this class");
    }

    public void drawChart(){
        System.out.println("*************Map Successfully Drawn");
    }

    @Override
    public void generateChartProperties(int x, int y) {
        System.out.println("******** Chat Vertical Length is "+y +" an chat horizontal length is "+x);
    }


}
