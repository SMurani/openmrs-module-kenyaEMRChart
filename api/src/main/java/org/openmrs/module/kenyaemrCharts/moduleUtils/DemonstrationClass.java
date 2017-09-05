package org.openmrs.module.kenyaemrCharts.moduleUtils;

/**
 * Created by Sammy on 9/4/2017.
 */

//This class demonstrates how we call the subclass to access all methods in the abstract class
public class DemonstrationClass {
    public static void main(String[] args) {
        BarChartProvider barChartProvider = new BarChartProvider();
        barChartProvider.generateChartProperties(3,6);
        barChartProvider.drawChart();
        barChartProvider.showMaps();
        barChartProvider.moveTo(6,9);
        barChartProvider.showChat();
        barChartProvider.mark();


    }



    }



//Notes
//An Abstract class provide a base which other subclasses can extend from
//They can have abstruct methods (methods with no body) and also methods that have a body.
//All abstrcut methods in an abstrct class must be instanciated;
//
