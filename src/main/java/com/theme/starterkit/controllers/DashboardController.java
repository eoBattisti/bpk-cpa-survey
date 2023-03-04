package com.theme.starterkit.controllers;

import com.theme.starterkit.libs.KTTheme;
import com.theme.starterkit.libs.config.KTThemeBaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DashboardController {
    @Autowired
    private KTTheme theme;

    @Autowired
    private KTThemeBaseConfig settings;

    @ModelAttribute
    public void init() {
        theme.setLayout(settings.getDefaultLayout());
        theme.initLayout();
    }

    @GetMapping("/")
    public String index(){
        String[] vendors = {"amcharts", "amcharts-maps", "amcharts-stock"};
        theme.addVendors(vendors);
        return theme.getPageView("dashboards", "index");
    }
}
