package org.openmrs.module.kenyaemrCharts.fragment.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.kenyaui.annotation.AppPage;
import org.openmrs.ui.framework.SimpleObject;
import org.openmrs.ui.framework.fragment.FragmentModel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * controller for pivotTableCharts fragment
 */
@AppPage("kenyaemrcharts.chartsFragment")
public class PivotTableChartsFragmentController {
    protected final Log log = LogFactory.getLog(getClass());

    public void controller(FragmentModel model) {
        List<SimpleObject> simpleObjects = new ArrayList<SimpleObject>();
        SimpleObject.create(
                "name", "Nairobi",
                "population", 10000,
                "safety", "High",
                "averageAge", 43
        );
        simpleObjects.add(SimpleObject.create(
                "name", "Nairobi",
                "population", 10000,
                "safety", "High",
                "averageAge", 43
        ));
        simpleObjects.add(SimpleObject.create(
                "name", "Mombasa",
                "population", 20000,
                "safety", "Low",
                "averageAge", 40
        ));
        simpleObjects.add(SimpleObject.create(
                "name", "Kisumu",
                "population", 5000,
                "safety", "Medium",
                "averageAge", 20
        ));
        simpleObjects.add(SimpleObject.create(
                "name", "Eldoret",
                "population", 6000,
                "safety", "High",
                "averageAge", 40
        ));
        log.info("=======The array size here is  ======="+simpleObjects.size());
        model.addAttribute("population", simpleObjects);


    }
}
